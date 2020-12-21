package eg1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuedemo {

	public static void main(String[] args) {
		
		Queue<Integer> ql = new LinkedList();
		ql.add(60);
		ql.add(20);
		ql.add(30);
		ql.add(40);
		ql.add(50);
		System.out.println("Printing the contents of the Queue-LinkedList: "+ql);
		
		int x2 = ql.size();
		System.out.println("Print size of Queue LinkedList : "+x2);
		
		ql.remove(10);
		System.out.println("\nPrinting Queue after removal of an element : "+ql);
		
		System.out.println("\nPoll method on Queue : "+ql.poll());
		
		System.out.println("\nPrinting Queue after poll, returns and removes the head of queue : "+ql);
		
		System.out.println("\nPeek method on Queue returns head of the queue: "+ql.peek());
		
		
		
		
		
		Queue<Integer> pq =  new PriorityQueue();
		pq.add(30);
		pq.add(20);
		pq.add(30);
		pq.add(20);
		pq.add(50);
		System.out.println("\n\n\nPrinting the contents of the PriorityQueue : "+pq);
		
		int x1 = pq.size();
		System.out.println("Print size of PriorityQueue : "+x1);
		
		pq.remove(10);
		System.out.println("\nPrinting Queue after removal of an element : "+pq);
		
		System.out.println("\nPoll method on Queue : "+pq.poll());
		
		System.out.println("\nPrinting Queue after poll, returns and removes the head of queue : "+pq);
		
		System.out.println("\nPeek method on Queue returns head of the queue: "+pq.peek());
		
		
		//The difference between the LinkedList and PriorityQueue is that the PriorityQueue sorts its elements 
		//at the time of insertion while the LinkedList preserves the orders of element in their natural order.
		
	}
	
}
