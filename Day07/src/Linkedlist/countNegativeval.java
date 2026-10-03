package Linkedlist;

import java.util.LinkedList;

public class countNegativeval {
 
	public static int checkList(LinkedList<Integer> l,int i,int count) {
		
		if(i>l.size()-1) {
			return count;
		}
		
		if(l.get(i)<0) {
			count++;
		}
		return checkList(l,i+1,count);
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l= new LinkedList<>();
		l.add(1);
		l.add(-2);
		l.add(3);
		l.add(-5);
		l.add(-32);
		int i=0;
		int count=0;
		System.out.print(checkList(l,i,count));
	}

}
