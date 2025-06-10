
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//DeJanae Faison
//M3 Assignment : Array Lists and Generics
//Due 6.15.25

public class FaisonM3_ArrayGeneric {
    public static void main(String[] args) {
        
        //Create original list and fill with random values
        ArrayList <Integer> originaList = new ArrayList<>();
        Random randomValue = new Random();
        for (int i = 0; i < 50; i++) {
            originaList.add(randomValue.nextInt(20));
        }
        //Print og list
        System.out.println("\nOriginal List: ");
        System.out.print(originaList);
        System.out.println("\n");

        //New List
        ArrayList<Integer> newList = removeDuplicates(originaList);

        System.out.println("\nNew List: ");
        System.out.print(newList);
        System.out.println("\n");

    }

    public static <E> ArrayList <E> removeDuplicates(ArrayList <E> list){
        //Hash can not have duplicates
        return new ArrayList<>(new HashSet<>(list));
    }
}