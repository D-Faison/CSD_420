
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//DeJanae Faison
//M3 Assignment : Array Lists and Generics
//Create a list with 50 random values then create a new list from the original that holds no duplicates
//Due 6.15.25

public class FaisonM3_ArrayGeneric {
    public static void main(String[] args) {
        
        //Create original list and fill with random values
        ArrayList <Integer> originaList = new ArrayList<>();
        Random randomValue = new Random();
        for (int i = 1; i < 50; i++) {
            //plus one so it excludes 0
            originaList.add(randomValue.nextInt(20) + 1);
        }
        //Print og list
        System.out.println("\nOriginal List: ");
        System.out.print(originaList);
        System.out.println("\n");

        //New List using original list
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