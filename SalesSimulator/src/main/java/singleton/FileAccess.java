package singleton;


import depots.Depot;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileAccess {

    // singleton implemented on this class so we can have only one instace of it
    private static FileAccess instance = new FileAccess();
    
    // properties
    FileWriter myWriter;
    
    // constructor
    private FileAccess() {
        createFile();
        try {
            myWriter = new FileWriter("data.txt");
        } catch (IOException ex) {
            Logger.getLogger(FileAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // method to access the file
    private void createFile() {
        try {
            File data = new File("data.txt");
            if (data.createNewFile()) {
            //System.out.println("File created: " + data.getName());
        } else {
            //System.out.println("File already exists.");
        }
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void writeDepots(Depot[] depotsfromA, Depot[] depotsfromB, Depot[] depotsfromC) {
        try { 
         
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
          //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
         
    }
    
    public void readTransactions() {
        try {
          File myObj = new File("data.txt");
          Scanner myReader = new Scanner(myObj);
          
          // loop through whole file while there's a line
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if(data.contains("bought")) {
                System.out.println(data);       
            } 
          }        
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
    
    public void readTransactionsForCompany(String company) {
         try {
          File myObj = new File("data.txt");
          Scanner myReader = new Scanner(myObj);
          
          if(company.equals("A")){
                // loop through whole file while there's a line
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(data.contains("Depot A")) {
                  System.out.println(data);       
              }
            }
          } else if(company.equals("B")){
                // loop through whole file while there's a line
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(data.contains("Depot B")) {
                  System.out.println(data);       
              }
            }
          } else if(company.equals("C")){
                // loop through whole file while there's a line
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(data.contains("Depot C")) {
                  System.out.println(data);       
              }
            }
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

    public void writeTransactions(String transaction) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("data.txt", true));
            bw.write(transaction);
            bw.newLine();
            bw.flush();
      } catch (IOException ioe) {
	 ioe.printStackTrace();
      } finally {                       
	 if (bw != null) try {
	    bw.close();
	 } catch (IOException ioe2) {
	    System.out.println("Fatal error.");
	 }
      } 

   }

    public void readDetailsForCompany(String company) {
        try {
          File myObj = new File("data.txt");
          Scanner myReader = new Scanner(myObj);
          
          if(company.equals("A")){
                // loop through whole file while there's a line
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(data.contains("company=A")) {
                  System.out.println(data);       
              }
            }
          } else if(company.equals("B")){
                // loop through whole file while there's a line
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(data.contains("company=B")) {
                  System.out.println(data);       
              }
            }
          } else if(company.equals("C")){
                // loop through whole file while there's a line
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(data.contains("company=C")) {
                  System.out.println(data);       
              }
            }
          }            
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }

    
}
