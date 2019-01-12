import java.util.* ;
public class Product{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two numbers one by one");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int Product = num1 * num2;
	sc.close();
	System.out.println("The product of two numbers is : "+Product);

	}
}