
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*DeJanae Faison*/
/*Program 2: Read data file*/

public class Faison_M2_ReadFile {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            String fileName = "DEJANAEdatafile.dat";
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e) {

            System.err.println("|| READING ERROR ||");
        
        }
    }
}