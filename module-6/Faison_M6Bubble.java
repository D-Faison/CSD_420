
import java.util.Comparator;

/*DeJanae Faison M6 Due 6.28.25
 * Prograam using bubble sort with  two methods
 * Method 1: Sorts using Comparable Interface
 * Method 2: Sorts using Comparator Interface
 */

 public class Faison_M6Bubble {
    public static void main(String[] args) {
        
         //Array of integers (use Integer[] for generics)
         Integer[] unsortedArray = {7, 3, 8, 5, 2, 6, 4, 1};

         System.out.println("\n===| Unsorted Array |===");
         for (int num : unsortedArray) {
             System.out.print(num + " ");
         }

         // Sort using bubbleSort with Comparable
         bubbleSort(unsortedArray); 
         
         System.out.println("\n\n===| Sorted Array using Comparable |===");
         for (int num : unsortedArray) {
             System.out.print(num + " ");
         }
    }

    public static<E extends Comparable<E>> void bubbleSort(E[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static<E> void bubbleSort(E[] array, Comparator<? super E> comparator) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
 }

