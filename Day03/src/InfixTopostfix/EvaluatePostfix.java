package InfixTopostfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluatePostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String expression = "242*+";
       System.out.print("before ::" + expression);
       System.out.print("after :: "+ evaluation(expression));  
	}
	
	public static int evaluation(String expression) {
		
		char[] input =  expression.toCharArray();
		Deque<Integer> st = new ArrayDeque<>();
		
		for(char c : input) {
			if(Character.isDigit(c)) {
				st.push(c-'0');
			}else {
			  int a = st.pop();
			  int b = st.pop();
			  
			  st.push( getprecedence(c,b,a));
				 
			}
		}
		return st.pop();
		
	}
	
	private static int getprecedence(char c,int a,int b) {
		return switch(c) {
		case '^' -> (int)Math.pow(a, b);
		case '/' -> a/b;
		case '*' -> a*b;
		case '+' -> a+b;
		case '-'->a-b;
		default -> throw new IllegalArgumentException("Invalid operator");
			};
	}
}
