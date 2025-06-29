/*DeJanae Faison M6 Due 6.28.25
 * Program using bubble sort with  two methods
 * Method 1: Sorts using Comparable Interface
 * Method 2: Sorts using Comparator Interface
 */

import java.util.Comparator;

public class Faison_M6Bubble {
   //Comparable bubble sort method
   public static <E extends Comparable<E>> void bubbleSort(E[] list) {
      boolean swapped;
      do {
         swapped = false;
         for (int i = 0; i < list.length - 1; i++) {
            if (list[i].compareTo(list[i + 1]) > 0) {
               E temp = list[i];
               list[i] = list[i + 1];
               list[i + 1] = temp;
               swapped = true;
            }
         }
      } while (swapped);
   }

   public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
      boolean swapped;
      do {
         swapped = false;
         for (int i = 0; i < list.length - 1; i++) {
            if (comparator.compare(list[i], list[i + 1]) > 0) {
               E temp = list[i];
               list[i] = list[i + 1];
               list[i + 1] = temp;
               swapped = true;
            }
         }
      } while (swapped);
   }

   @SuppressWarnings("Convert2Lambda")
   public static void main(String[] args) {
        
      //Array of integers to be sorted
      Integer[] intArray = {5, 2, 9, 1, 5, 6, 3, 8, 7, 4, 0, 9};
      Integer[] intArray2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
      System.out.println("\n===| Original Integer Array |===");
      printArray(intArray);

      bubbleSort(intArray);
      System.out.println("\n===| Comparable Sort |===");
      printArray(intArray);

      bubbleSort(intArray2, new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
         }
      });
      System.out.println("\n===| Comparator Sort |===");
      printArray(intArray2);
    }

    //Method for printing the arrays
   public static <E> void printArray(E[] array) {
      for (E element : array) {
         System.out.print(element + " ");
      }
      System.out.println();
      System.out.println("\n");
   }
 }

