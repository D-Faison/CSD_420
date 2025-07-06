
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


        //String Builders for mutability
        StringBuilder lettersOutput = new StringBuilder();
        StringBuilder digitsOutput = new StringBuilder();
        StringBuilder symbolsOutput = new StringBuilder();
        
        //Initialize Thread Variable to call function
        Thread lettersThread = new Thread(new RandomLetters(lettersOutput));
        Thread digitsThread = new Thread(new RandomNumbers(digitsOutput));
        Thread symbolsThread = new Thread(new RandomSymbols(symbolsOutput));

        //Start threads
        lettersThread.start();
        digitsThread.start();
        symbolsThread.start();
        try {
            //Wait for completion
            lettersThread.join();
            digitsThread.join();
            symbolsThread.join();
        } catch (InterruptedException ex) {
            System.err.println("Didnt work");
        }


        //Outputs and their headers
        System.out.println("\n===| Random Letters |===\n");
        System.out.print(lettersOutput);
        
        System.out.println("\n===| Random Numbers |===\n");
        System.out.print(digitsOutput);

        System.out.println("\n===| Random Symbols |===\n");
        System.out.print(symbolsOutput);

    }

    //Random letters method
    static class RandomLetters implements Runnable {

        private final StringBuilder output;

        public RandomLetters(StringBuilder output){
            this.output = output;
        }
       @Override
       public void run(){
            Random random = new Random();
            //for every character print one of the random 26 characters
            for (int i = 0; i < CHAR_COUNT; i++) {
               char letters = random.nextBoolean() ? 
                              (char) ('a' + random.nextInt(26)) : 
                              (char) ('a' + random.nextInt(26));
                output.append(letters);
            }

       }
    }

    //Random numbers method
    static class RandomNumbers implements Runnable{

        private final StringBuilder output;

        public RandomNumbers(StringBuilder output){
            this.output = output;
        }

        @Override
        public void run(){
            Random random = new Random();
            for( int i = 0; i < CHAR_COUNT; i++){
                char numbers = (char)('0'+ random.nextInt(10));

                output.append(numbers);
            }
        }
    }

    //Random Symbols
    static class RandomSymbols implements Runnable{
   
        private final char[] symbolsArray = {'!','@','#','$','%','&','*'};

        private final StringBuilder output;

        public RandomSymbols(StringBuilder output){
            this.output = output;
        }
        @Override
        public void run(){
            Random random = new Random();
            for (int i = 0; i < CHAR_COUNT; i++) {
                char character = symbolsArray[random.nextInt(symbolsArray.length)];
                output.append(character);
            }
        } 
    }
 }
 /*Resources:
  * OpenAI. (2023). ChatGPT (Mar 14 version) [Large language model]. https://chat.openai.com/chat
  */