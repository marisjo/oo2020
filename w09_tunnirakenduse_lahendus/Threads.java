public class Threads {

    public static String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };
  
    public static void main(final String[] args) {
        for (int i = 0; i < letters.length; i++) {
        new Thread(getRunnable(i),letters[i]).start();
            try {
            Thread.sleep(200);
            } catch (Exception e) {
         
            e.printStackTrace();
            }

        }
    }
    public static Runnable getRunnable(final int i) {
        return () -> {
        
            switch (i) {
                case 0:
                    numbersDown();
                    break;
                case 1:
                    numbersUp();
                    break;
                case 2:
                    upLetters();
                    break;
                case 3:
                    downLetters();
                    break;
                default:
                    break;
            }
        {
            System.out.println(Thread.currentThread().getName());
        }
    };
    }
    public static void numbersDown() {
    
    try {
        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
          
            Thread.sleep(50);
        }
    } catch (final InterruptedException e) {
                 
             }
             
        }
        

    public static void numbersUp() {
        try {
            for (int j = 0; j <=10; j++) {
                System.out.println(j);
              
                Thread.sleep(50);
            }
        } catch (final InterruptedException e) {

        }

    }

    public static void upLetters() {
        try {
            for (int j = 0; j <=10; j++) {
                System.out.println(letters[j]);
        
                Thread.sleep(50);
            }
        } catch (final InterruptedException e) {

        }
    }

    public static void downLetters() {
        try {
            for (int j = 10; j >=  0; j--) {
                System.out.println(letters[j]);
            
                Thread.sleep(50);
            }
        } catch (final InterruptedException e) {

            }   
       }
  }


