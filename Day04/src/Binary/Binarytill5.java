package Binary;

import java.util.ArrayDeque;
import java.util.Queue;

public class Binarytill5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue<String> q1 = new ArrayDeque<>();
//         int n = q1.size();
         String ch1 = "1";
         String ch2 = "0";
         q1.offer("1");
//         q1.offer( "1"+"0");
         int count = 1;
         
         while(count <= 5) {
             String front = q1.poll();
             System.out.println(front);
        	 
         	 q1.offer(front+ch2);
        	    q1.offer(front + ch1);
        	    
        	    count++;
         }
         
         
//         System.out.println(q1);
         
         
         
         
         
	}

}
