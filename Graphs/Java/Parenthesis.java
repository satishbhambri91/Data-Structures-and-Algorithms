import java.util.*;
public class Parenthesis{
	public boolean checkParenthesisBalance(String str){
	
		Stack<Character> st = new Stack<Character>();
		for(char ch : str.toCharArray()){

			switch(ch){
				case '{':
					st.push('}');
					break;
				case '(':
					st.push(')');
					break;
				case '[':
					st.push(']');
					break;
				default:
					if(st.isEmpty() || st.pop() != ch){
						return false;
					}
			}

		}
		return st.isEmpty();

	}

	public static void main(String[] args){

		Parenthesis p = new Parenthesis();
		boolean result = p.checkParenthesisBalance("{");
		System.out.println(result);
	}
}

