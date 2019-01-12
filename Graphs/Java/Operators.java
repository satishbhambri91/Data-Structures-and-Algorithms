import java.util.* ;
public class Operators{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println("Adding num to 1 :" +(num1+=1));
	System.out.println("Substracting :"+(num2-=1));
	System.out.println("Modulus : "+(num1%num2));
	System.out.println("Bitwise :");
	System.out.println("Bitwise AND : " +(num1&num2));
	System.out.println("Bitwise OR :"+ (num1|num2));
	System.out.println("Complement :"+ (~num1));
	System.out.println("Bitwise SHIFT LEFT :" +(num1<<1));
	System.out.println("Bitwise SHIFT RIGHT :" +(num1>>1));
	System.out.println("Ternary Operators :");
	String ch = (num1 > num2) ? "yay" : "Oh fudge !" ;
	System.out.println(ch);


	}
}