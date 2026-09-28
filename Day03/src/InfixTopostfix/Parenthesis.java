package InfixTopostfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "({}{}[])";
		
		System.out.println(isparenthesis(s));
	}
	
	public static boolean isparenthesis(String s) {
		char[] chp =  s.toCharArray();
		Deque<Character> st = new ArrayDeque<>();
		
		for(char ch : chp) {
			
		if(ch == '[' || ch == '(' || ch == '{') {
			st.push(ch);
		}
		else {
			if(st.isEmpty()) return false;
			
			char top = st.pop();
			
			if(ch == ')' && top!= '(') return false;
			if(ch == '}' && top != '{') return false;
			if(ch == ']' && top != '[') return false;
			
		  }
		}
		return st.isEmpty();
		
	}

}
