package fileio;


import java.io.*;


public class FileoutputStreamDemo {

	public static void main(String[] args) {
	     String fname= "c:/demo/data1.txt";
	     try {
	    	 FileOutputStream fos=new FileOutputStream(fname);
	    	 String text="The day is beautiful";
	    	 byte[] mybytes=text.getBytes();
	    	 fos.write(mybytes);
	    	 System.out.println("data is written in file ");
	    	 fos.close();
	     }
         catch(IOException e) {
        	 e.printStackTrace();
         }
	}

}
