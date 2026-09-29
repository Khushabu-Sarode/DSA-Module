package InsertionSort;

public class inserstionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {3,2,1,4,7};
       int n = arr.length;
       for(int i=1;i<n;i++) {
    	     int currentindex = arr[i];
    	     int position = i - 1;
    	      while(position >=0 && arr[position] > currentindex) {
    	    	    arr[position + 1] = arr[position];
    	    	    position--;
    	      }
    	      arr[position + 1] = currentindex;
       }
       
       for(int i=0;i<n;i++) {
    	   System.out.print(arr[i] + " ");
       }
	}

}
