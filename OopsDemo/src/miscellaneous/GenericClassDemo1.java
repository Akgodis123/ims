package miscellaneous;
class Test<T>  // generic class
{
    T data;  // generic variable

 

    public Test(T data) {  // generic constructor
        
        this.data = data;
    }

 

    public T getData() {   // generic getter & setter
        return data;
    }

 

    public void setData(T data) {
        this.data = data;
    }
    
    
}
public class GenericClassDemo1 {

	public static void main(String[] args) {
		Test<Integer> t1=new Test<Integer>(10); // use generic class Test for Integer
        System.out.println(t1.getData());
       
         // use generic class Test for String
        Test<String> t2=new Test<String>("Hello World");
        System.out.println(t2.getData());
       
        // // use generic class Test for Double
        Test<Double> t3=new Test<Double>(5000.50);
        System.out.println(t3.getData());
	}

}
