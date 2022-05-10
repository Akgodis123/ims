package fileio;

import java.io.*;


public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		 String fname= "c:/demo/data1.txt";
		 
		 try (FileInputStream fis=new FileInputStream(fname)){
			 
			 int i;
			 while((i=fis.read())!=-1){
				 System.out.println((char) i);
			 }
		
		 }
		 
		 System.out.println();
	}

}
