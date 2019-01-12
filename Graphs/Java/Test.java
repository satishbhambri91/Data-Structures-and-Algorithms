import java.util.*;
public class Test{
	static Test t ;
     
    static int count =0;
	public static void main(String[] args) throws InterruptedException
	{
		String str = new String("Hey There");
		str = null;
		System.gc();
		Thread.sleep(1000);
		t = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("finalize method called "+count+" times");
	}
	@Override
    protected void finalize() 
    { 
        count++;
         
        t = this; // line 38
             
    }
}