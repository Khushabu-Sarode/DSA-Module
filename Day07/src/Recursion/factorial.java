package Recursion;

public class factorial {

	public static int fact(int n) {
		if(n ==1) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = fact(n);
		System.out.print(ans);

	}

}
