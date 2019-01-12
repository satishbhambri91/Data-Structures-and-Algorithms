public class Example1{
	public static void main(String[] args){
		try{
			System.out.println("First statement of try block");
			int num = 45/0;
			System.out.println(num);
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
			//System.exit(0);
		}
		finally{
			System.out.println("finally block");
		}
		System.out.println("Out of finally block");
	}
}