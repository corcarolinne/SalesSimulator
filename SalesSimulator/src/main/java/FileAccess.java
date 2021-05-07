
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
    
    public void writeFile(Depot[] depots) {
        try { 
          // create new file
          FileWriter myWriter = new FileWriter("data.txt");
          // write depots as strings
          for(int i=0; i < depots.length; i++) {
            myWriter.write(depots[i].toString());
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
