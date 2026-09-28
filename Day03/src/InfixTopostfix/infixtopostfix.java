package InfixTopostfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class infixtopostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infixExpression = "A+B*C";
		System.out.println("Infix :: " + infixExpression);
		System.out.print("Postfix :: " + infixToPostfix(infixExpression));

	}

	public static String infixToPostfix(String infixExpression) {
		 char []input = infixExpression.toCharArray();
		 StringBuilder postfix = new StringBuilder();
		 Deque<Character> s = new ArrayDeque<>();
		 
		 for(char c : input) {
			 if(Character.isLetterOrDigit(c)) {
				 postfix.append(c);
			 }
			 else if(c == '(') {
				 s.push(c);
			 }
			 else if(c == ')') {
				 while(!s.isEmpty() && s.peek() != '(') {
					 postfix.append(s.pop());
				 }
				 s.pop();
			 }else {
				 while(!s.isEmpty() && s.peek()!= '(' && (getprecedence(s.peek()) >= getprecedence(c))) {
					 postfix.append(s.pop());
				 }
				 s.push(c);
			 }
		 }
	
		 while(!s.isEmpty()) {
			 postfix.append(s.pop());
		 
	     }
		 return postfix.toString();
	}
	
	
	private static int getprecedence(char c) {
		return switch(c) {
		case '^' -> 3;
		case '/','*' -> 2;
		case '+','-'->1;
		default -> throw new IllegalArgumentException("Invalid operator");
	};
  }
}
