package oopsdemo3;

import java.nio.file.FileSystemLoopException;

import com.oopsdemo.Book;

class Test{
	int a; // default variable
    private int b; // private variable
    protected int c; // accessed in sub class
    public int d;
    
    public Test(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        d=500;
    }

 

    public void display()  // public method
    {
        System.out.println("Private Variable:"+b);
        System.out.println("Public variable: "+d);
    }
}

class Test2 extends Test{
	  public Test2(int a, int b, int c) {
	        super(a, b, c);
	        
	    }
	    public void display()  // public method
	    {
	        System.out.println("Protected Variable:"+c);
	    }
}

public class AccessSpecifiersDEmo {

	public static void main(String[] args) {
		Test t1=new Test(100,200,300);
        t1.display();
        // t1.b=50; compiler error. cannot access private variable
        System.out.println("Defaut Variable :"+t1.a);
        Test2 t2=new Test2(100,200 , 300);
        t2.display();
        
       
	}

}
