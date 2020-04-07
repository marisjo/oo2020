import java.io.BufferedReader;
import java.io.FileReader;

public class At2hed {

    public static int smallLetters = 0;
    public static int bigLetters = 0;
    public static String textFile;
    public static String[] words = new String[0];
    private int count1 = 1;
    private int count2 = 2;
    private int count3 = 3;
    public static int oneLetter = 0;
    public static int twoLetters = 0;
    public static int threeLetters = 0;
    private static int howManyLetters = 0;
    public static int addedLetters = 0;
    public int allLetters=0;
    public int allWords=0;


    public void count() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        while ((textFile = br.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= textFile.length() - 1; i++) {
                if (textFile.charAt(i) == 'a') {
                    smallLetters++;
                } else if (textFile.charAt(i) == 'A') {
                    bigLetters++;
                }
            
            }
            
        }
        int addedLetters = bigLetters + smallLetters;
        br.close();
        System.out.println("The textfile contains the small letter a " + smallLetters + " times.");
        System.out.println("The textfile contains the small letter a " + bigLetters + " times.");
        System.out.println("All together there are " + addedLetters + " small and big a-letters.");
    }
    
    public void howMany() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        while ((textFile = br.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= words.length - 1; i++) {
                for (int j = 0; j <= words[i].length() - 1; j++) {
                    if (words[i].toLowerCase().charAt(j) == 'a') {
                        howManyLetters++;
                    }
                }
                if (howManyLetters == count1) {
                    oneLetter++;
                } else if (howManyLetters == count2) {
                    twoLetters++;
                } else if (howManyLetters == count3) {
                    threeLetters++;
                }
                System.out.println("The word '" + words[i] + "' contains " + howManyLetters + " a-letters.");
                
                howManyLetters = 0;
            
            }
            System.out.println("One a-letter in total are in " + oneLetter + " words");
            System.out.println("Two a-letter in total are in " + twoLetters + " words");
            System.out.println("Three a-letter in total are in " + threeLetters + " words");

        }
        br.close();
    }

    public void getAverage()throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        while ((textFile = br.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= words.length - 1; i++) {
                for (int j = 0; j <= words[i].length() - 1; j++) {
                    if (words[i].toLowerCase().charAt(j) == 'a') {
                        howManyLetters++;
                    }
                allLetters++;
                }
                allWords++;
                
            }
            int average=howManyLetters/allWords;
            System.out.println("The avarage of a-letters is: " + average);
            System.out.println("All together there are "+ (allLetters-(allWords-1)) +" letters.");
            
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        At2hed test = new At2hed();
        test.count();
        test.howMany();
        test.getAverage();
        
        
       

    
    }
}
