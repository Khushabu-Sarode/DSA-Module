package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int []arr = {5,4,3,2,1};
	    int n= arr.length;
	    
	    for(int i = 0;i<n-1;i++) {
	    	 int minIndex = i;
	    	 for(int j = i+1; j<n;j++) {
	    		 if(arr[j] < arr[minIndex]) {
	    			 minIndex = j;
	    		 }
	    	 }
	    	 if(i!=minIndex) {
	    		 int temp = arr[i];
	    		 arr[i] = arr[minIndex];
	    		 arr[minIndex] = temp;	    		 
	    	 }
	    }
	    
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i] +" " );
	    }
		
	}

}
