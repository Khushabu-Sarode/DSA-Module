//package Recursion;
//
//public class SumOfEle {
//
//	public static int sumofele(int []arr,int n,int i,int sum) {
////		i=0;
//		if(n==0) {
//			return 0;
//		}
//		 sum = sum + arr[i];
//		sumofele(arr,n,i++,sum);
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        int arr[] = {2,3,5,6,7};
//        int n = arr.length;
//        int i=0;
//        int sum = 0;
//        
//        
//        System.out.println(sumofele(arr,n,i,sum));
//	}
//
//}
package Recursion;

public class SumOfEle {

	public static int sumofele(int []arr,int n) {
//		i=0;
		if(n==0) {
			return 0;
		}
		int lastnum = arr[n-1];
		int allbutlast = sumofele(arr,n-1);
		return lastnum + allbutlast;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,3,5,6,7};
        int n = arr.length;
//        int i=0;
//        int sum = 0;
        
        
        System.out.println(sumofele(arr,n));
	}

}
