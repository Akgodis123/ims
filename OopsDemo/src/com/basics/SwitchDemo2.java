package com.basics;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		int number;
        String size="";
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter ur Shirt Size:");
        number=s.nextInt();
        s.close();
        
        switch((1<=number&&number<=28)?1:
        	(29<=number&&number<=41)?29:42)
        {
        case 1:
            
            size="Kids";
            break;
        case 29:
          size = "Small";
          break;



        case 42:
          size = "Medium";
          break;




}
  System.out.println("Size: " + size);
        }
        

	}


