package fileio;

import java.io.*;

public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader read=new FileReader("c:/demo/data.txt");
			int data=read.read();
			while(data!=-1) {
				System.out.println((char)data);
			    data=read.read();
			}
		    read.close();
		    
		}
       catch(Exception ex) {
    	   System.err.println(ex.getMessage());
       }
	}

}
