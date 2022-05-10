package fileio;

import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		try {
        Writer w=new FileWriter("c:/demo/data.txt");
	    String content="She sells sea shesells in the sea";
		w.write(content);
		w.close();
		System.out.println("Data written to a file");
		}
		catch(IOException e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}

}
}