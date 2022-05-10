package fileio;

import java.io.*;


public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		try {

			 

            BufferedOutputStream stream = new BufferedOutputStream(
                       new FileOutputStream("c:/demo/textfile.txt"));



               stream.write("Hello, World!".getBytes());
               stream.write(System.lineSeparator().getBytes());
               stream.write("I am writting into a file using BufferedOutputStream".getBytes());
               stream.write(System.lineSeparator().getBytes());
               stream.close();
               System.out.println("Data Written");


           } catch (IOException ex) {



               ex.printStackTrace();



           }  


	}

}
