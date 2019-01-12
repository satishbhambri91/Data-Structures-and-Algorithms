public class JavaExample{
	public static void main(String[] args){
		JavaExample obj = new JavaExample();
		obj = null;
		JavaExample c = new JavaExample();
		JavaExample d = new JavaExample();
		c = d;
		System.gc();
	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage Collection is performed by the JVM");
	}
}