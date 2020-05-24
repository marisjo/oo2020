import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> lettersList = new ArrayList<String>();
    static List<Integer> occurences = new ArrayList<>();

    static List<LetterFreq> letters = new ArrayList<LetterFreq>();
    static List<String> finalLetters = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Main x = new Main();
        x.readFile();
        x.sorting();
        
        FileWriter fileWriter = new FileWriter("/Users/marisjool/Desktop/java_kt_2-2/index.html", true);

        fileWriter.write("<!DOCTYPE html><html><head><title>Viimaste tähtede esinemissagedus</title></head><body>");
                
        for (int i = 0; i < finalLetters.size(); i++) {
            fileWriter.write("<a href='letters/" + finalLetters.get(i) + ".txt'>" + finalLetters.get(i) + " -- " + letters.get(i).value + "</a><br>");
        }

        fileWriter.write("</body></html>");
        fileWriter.close();

        System.out.println("Kõige sagedasemini esinevad tähed");
        System.out.println(finalLetters);
    }

    private void readFile() throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("/Users/marisjool/Desktop/java_kt_2-2/text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            Scanner readWord = new Scanner(scanner.nextLine());
            while (readWord.hasNext()) {
                String word = readWord.next();
                word = word.replaceAll("[^a-zA-Z0-9]", "");

                if (!word.isEmpty()) {
                    String lastLetter = word.substring(word.length() - 1);
                    lastLetter = lastLetter.toUpperCase();
                    if (lettersList.contains(lastLetter)) {
                        int index = lettersList.indexOf(lastLetter);
                        Integer value = occurences.get(index);
                        value = value + 1;
                        occurences.set(index, value);
                    } else {
                        lettersList.add(lastLetter);
                        occurences.add(1);
                    }
                    
                    try {
                        FileWriter fileWriter = new FileWriter("/Users/marisjool/Desktop/java_kt_2-2/letters/" + lastLetter + ".txt", true);
                        fileWriter.write(word + "\n");
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                
            }
        }
    }

    private void sorting() {
        Integer[] array = occurences.toArray(new Integer[0]);

        for (int i = 0; i < array.length; i++) {
            letters.add(new LetterFreq(i, array[i]));
        }

        Collections.sort(letters);

        for (LetterFreq element : letters) {
            finalLetters.add(lettersList.get(element.index));
        }
    }
    
}
