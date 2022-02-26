package MultithreadingandFileHandling;

class MyException1 extends Exception 
{ 
    public MyException1(String s) 
    { 
        super(s); 
    } 
} 
public class ExceptionEx 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
