/*DeJanae Faison*/
/*Program 1: Create and Write data file*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Faison_M2_WriteFile {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //First TryCatch : File creation
        try {
            //Create file and display name
            File fileName = new File("DEJANAEdatafile.dat");
            if (fileName.createNewFile()) {
                System.out.println("\n--|FILE CREATION SUCCESSFUL|--");
                System.out.println("\nFile created: "+ fileName.getName());
            }
            else{
                //If file exists already display message
                System.out.println("\nFile already exists");
            }

            // Second TryCatch: File Writing after creation
            try{

                FileWriter fileWriter = new FileWriter(fileName,true);

                //Random integer
                Random randomInteger = new Random();
                System.out.print("\nRandom Integer Values:\n");
                fileWriter.write("\nRandom Integer Values:\n");
                //For each interger display 5 random int values between 0-20
                for (int i = 0; i < 5; i++) {
                    int inumber = randomInteger.nextInt(20);
                    System.out.print (inumber + "\n");

                    fileWriter.write(inumber + "\n");
                }

                // Random Double
                Random randomDouble = new Random();
                System.out.print("\nRandom Double Values:\n");
                fileWriter.write("\nRandom Double Values:\n");
                //For each double display five random double values between 0-2.3
                for( double i = 0; i < 5; i++){
                    double dnumber = randomDouble.nextDouble(2.3);
                    //Format double value to just 2 decimal places
                    String formatDNumber = String.format("%.2f",dnumber);
                    System.out.print(formatDNumber + "\n");

                    fileWriter.write(formatDNumber + "\n");
                }

                System.out.println("\n");
                fileWriter.write(System.lineSeparator());
                fileWriter.close();
            }

            //If writing to file does not work, throw this error
            catch(IOException e){
                System.err.println("\n|| WRTITING ERROR OCCURED ||\n");
            }

        //If creating the file does not work, throw this error
        } catch (IOException e) {
            System.err.print("\n||CREATION ERROR OCCURED||\n");
        }
        
    }
}
