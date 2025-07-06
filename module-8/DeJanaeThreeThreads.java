
import java.util.Random;

/*DeJanae Faison 
 * M8: three threads outputing different characters minimum 10,000
 * Thread 1: Output random letters a-z
 * Thread 2: Output random digits 1-#
 * Thread 3: Output random characters !,@,#,$,%,&,*
 * Due 7.6.25
 */

 public class DeJanaeThreeThreads{

    private static final int CHAR_COUNT = 10000;

    public static void main(String[] args) {
        
        //Initialize Thread Variable to call function
        Thread lettersThread = new Thread(new RandomLetters());
        Thread digitsThread = new Thread(new RandomNumbers());
        Thread symbolsThread = new Thread(new RandomSymbols());

        //Start function
        System.out.println("===| Random Letters |===");
        lettersThread.start();

        System.out.println("===| Random Numbers |=== ");
        digitsThread.start();

        symbolsThread.start();
    }

    //Random letters method
    static class RandomLetters implements Runnable {
       @Override
       public void run(){
            Random random = new Random();
            //for every character print one of the random 26 characters
            for (int i = 0; i < CHAR_COUNT; i++) {
               char letters = random.nextBoolean() ? 
                              (char) ('a' + random.nextInt(26)) : 
                              (char) ('a' + random.nextInt(26));
                System.out.print(letters);
            }

       }
    }

    //Random numbers method
    static class RandomNumbers implements Runnable{
        @Override
        public void run(){
            Random random = new Random();
            for( int i = 0; i < CHAR_COUNT; i++){
                char numbers = (char)('0'+ random.nextInt(10));

                System.out.print(numbers);
            }
        }
    }

    //Random Symbols
    static class RandomSymbols implements Runnable{
   
        private final char[] symbolsArray = {'!','@','#','$','%','&','*'};
        @Override
        public void run(){
            Random random = new Random();
            for (int i = 0; i < CHAR_COUNT; i++) {
                char character = symbolsArray[random.nextInt(symbolsArray.length)];
                System.out.print(character);
            }
        } 
    }
 }