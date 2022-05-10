package com.basics;

import java.util.Scanner;



public class SumAvg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num1,num2,num3,sum;
        float avg;
       
        System.out.println("Enter 3 Numbers : ");
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
       
        sum=num1+num2+num3;
        avg=(float)sum/3;
       
        System.out.println("***********************************");
        System.out.println("The Sum of 3 Numbers is     : "+sum);
        System.out.println("The Average of 3 Numbers is :"+avg);
        System.out.print("The Average of 3 Numbers is :");
        System.out.format("%.3f", avg);
        System.out.println();
       
        System.out.print("The Average of 3 Numbers is :");
        System.out.format("%.2f", avg);
       
        System.out.println();
        System.out.println("***********************************");
       
        s.close();
	}

}
