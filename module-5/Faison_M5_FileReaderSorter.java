
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*DeJanae Faison CSD420 Due 6.22.25
 * M5: Read File then displays words in ascending
 * then descending order
 */ 

 public class Faison_M5_FileReaderSorter{

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        try{
            String fileName = "collection_of_words.txt";
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();

            
        } catch (IOException e){ 

            System.err.println("==!!!! READING ERROR !!!!==");
        }
    }

 }