package singleton;


import depots.Depot;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileAccess {

    // singleton implemented on this class so we can have only one instace of it
    private static FileAccess instance = new FileAccess();
    
    // properties

    // constructor
    private FileAccess() {
        createFile();
    }

    // method to access the file
    private void createFile() {
        try {
            File data = new File("data.txt");
            if (data.createNewFile()) {
            System.out.println("File created: " + data.getName());
        } else {
            System.out.println("File already exists.");
        }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void writeFile(Depot[] depotsfromA, Depot[] depotsfromB, Depot[] depotsfromC) {
        try { 
          // create new file
          FileWriter myWriter = new FileWriter("data.txt");
          
          // write depots lists as strings
          for(int i=0; i < depotsfromA.length; i++) {
            myWriter.write(depotsfromA[i].toString());
            myWriter.write("\n");
          }
          for(int i=0; i < depotsfromB.length; i++) {
            myWriter.write(depotsfromB[i].toString());
            myWriter.write("\n");
          }
          for(int i=0; i < depotsfromC.length; i++) {
            myWriter.write(depotsfromC[i].toString());
            myWriter.write("\n");
          }
          myWriter.close();
          System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
         
    }
    
    public void readFile() {
        try {
          File myObj = new File("data.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
    
    
    public static FileAccess getInstance() {
        return instance;
    }

}
