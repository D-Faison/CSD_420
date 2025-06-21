
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*DeJanae Faison CSD420 Due 6.22.25
 * M5: Read File then displays words in ascending
 * then descending order
 */ 

 public class Faison_M5_FileReaderSorter{

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        //Relative File name variable
        String fileName = "collection_of_words.txt";
        //Sets Allow no Duplicates
        Set<String> wordSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName));){
            String line;
            while((line = fileReader.readLine()) != null){
                //Split by spaces or one or non word characters in a row
                String[] words = line.split("[^a-zA-Z]+");
                for(String word : words){
                    word = word.toLowerCase().trim();
                    //If the word is not empty or blank add it to the set
                    if(!word.isEmpty()){
                        wordSet.add(word);
                    }
                }
            }

        //If the file can not be read throw this error
        } catch (IOException e){ 

            System.err.println("==!!!! READING ERROR !!!!==");
        }

        //Show Ascending Order
        System.out.println("===| Ascending Order |===");
        for (String word : wordSet){
            System.out.println(word);
        }

        //Show Descending Order
        System.out.println("\n===| Descending Order |===");
        List<String> wordList = new ArrayList<>(wordSet);
        Collections.reverse(wordList);
        for(String word : wordList){
            System.out.println(word);
        }
    }


 }