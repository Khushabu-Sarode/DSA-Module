//package Recursion;
//
//public class StringPalindrome {
//	
////	public static String reverseString(String s) {
////		if(s.length() == 1) {
////			return s;
////		}
////		String last = s.substring(s.length() -1);
////		String remaining = s.substring(0,s.length()-1);
////		
////		return last + reverseString(remaining);
////	}
//	public static boolean checkPalindrome(String sname,int s,int e){
//		if(sname[s] == sname[e]) {
//			return true;
//		}
//		
//		checkPalindrome(sname,s++,e);
//		checkPalindrome(sname,s,e--);
//		return false;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "ABCDDCBA";
//		String original = s;
//		
////	   String ans = 	reverseString(s);
//		
////		System.out.println(checkPalindrome(s,s));
//		
//
//	}
//
//}
