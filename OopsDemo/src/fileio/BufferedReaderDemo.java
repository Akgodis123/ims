package fileio;

import java.io.*;

/*
 * A BufferedReader example that reads a file line by line
 */
public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		try {
		// Creating Writer obj in Append mode -true
        FileReader reader = new FileReader("c:/demo/names.txt"); 
     // Improves Efficiency while Writing Data in to file
        BufferedReader br = new BufferedReader(reader);  
        String line = "";
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not exists or insufficient rights");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("An exception occured while reading the file");
        e.printStackTrace();        }

	
		}
}
