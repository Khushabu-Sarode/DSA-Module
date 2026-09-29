package Binary;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseTillK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> q1 = new ArrayDeque<>();
		 q1.offer(10);
		 q1.offer(20);
		 q1.offer(30);
		 q1.offer(40);
		 q1.offer(50);
		 int k = 3;
		 
	
		 Deque<Integer> reversetillK = new ArrayDeque<>();
		 
		 for(int i=1;i<=k;i++) {
			 int front = q1.poll();
			 reversetillK.push(front);
		 }

//		 System.out.println("******************************************************************************");
//		 System.out.println( reversetillK.poll());
//		 System.out.println( reversetillK.poll());
//		 System.out.println( reversetillK.poll());
//		 System.out.println( reversetillK.poll());
//		 System.out.println("******************************************************************************");
		   
		   while(!reversetillK.isEmpty()) {
			   int front = reversetillK.pop();
			   q1.offer(front);
		   }
         
		   System.out.println(q1);
		   
		   int n = q1.size() - k;
		   for (int i = 0; i < n; i++) {
			   int front = q1.poll();
	            q1.offer(front);
	        }

	        System.out.println(q1);
//		 
//		 for(int i=1;i<q1.size();i++) {
//			 int front = q1.poll();
////			 q1.offer(front);
//			 System.out.print(front);
//		 }
		 
	}

}
