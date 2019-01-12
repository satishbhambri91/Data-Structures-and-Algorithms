import java.util.* ;
class Parenthesis{
	public boolean checkParenthesisBalance(String str){
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()){
			switch(c){
				case '{':
					stack.push('}');
					break;
				case '[':
					stack.push(']');
					break;
				case '(':
					stack.push(')');
					break;
				default:
					if(stack.isEmpty() || stack.pop() != c){
					return false;
					}

			}
		}
		return stack.isEmpty();

	}
}

public class ParenthesisCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Braces ");
		String str = sc.next();
		Parenthesis obj = new Parenthesis();
		boolean result = obj.checkParenthesisBalance(str);
		System.out.println("And the result is : ");
		System.out.println(result);
	}
}