import java.util.Iterator;
import java.util.LinkedList;

/*DeJanae Faison 
 * M4 Linked List Storage 6.15.2025
 * Iterator VS Get Index
 * This program creates a linked list and stores 50,000 integers
 */

public class Faison_M4_LinkedListStorage {

    //Create and Fill LinkedList with n amount
    private static LinkedList<Integer> createList(int n){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    //Iterate through list using GET and return time
    @SuppressWarnings("unused")
    private static long timedGet(LinkedList<Integer> list){

        long startTime = System.nanoTime();
        int sum = 0;
        //iterate through list 
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        long endTime = System.nanoTime();
        //time in miliseconds, return the time it ended - time started
        return (endTime-startTime)/1000000;
    }

    //Iterate through list using Iterator
    @SuppressWarnings("unused")
    private static long timedIterator(LinkedList<Integer> list){

        long startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        long endTime = System.nanoTime();
        //time in miliseconds
        return (endTime-startTime)/1000000;
    }
    //Testing method
    private static void testing(int size){

        System.out.println("TESTING " + size + " Elements:");
        LinkedList<Integer> list = createList(size);
        
        long iteratorTime = timedIterator(list);
        System.out.println("Using Iterator Time: "+ iteratorTime + "ms"); 

        long getTime = timedGet(list);
        System.out.println("Using Get Index:  "+ getTime+"ms\n");
    }

    public static void main(String[]args){

        System.out.println("===| Linked List Testing |===");
        testing(50000);
        testing(500000);
    }

    /* Using the Iterator method was significantly faster than the get index method in both
     * testing instances. For example for the 500,000 elements it took 9ms to iterate through
     * but using the get index took about 2 minutes. For the 50,000 elements it took
     * 6 ms to iterate through but 1674 ms through Get Index.
     */

     /*Resources:
      * OpenAI. (2023). ChatGPT (Mar 14 version) [Large language model]. https://chat.openai.com/chat
      */
}
