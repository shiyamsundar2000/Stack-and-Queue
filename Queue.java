package Task3;

import java.util.LinkedList;
import java.util.Scanner;

import Task3.StacklinkedList.Node;

public class Queue{
	class Node{
		int data;
		Node next;
		Node (int val){
			data=val;
			next=null;
			
		}
	}
Node front,rear;
 int size=0;
public void enqueue(int val) {
	Node newNode=new Node( val);
	if(front==null) {
		front=newNode;
		
	}
	else
		rear.next=newNode;
	size++;
	rear=newNode;
		
	
}
public int dequeue() throws Exception{
	try {
	if(front==null)
			System.out.println("Queue is empty");
	  // throw new Exception("Queue is empty");
	
	int temp=front.data;
	//Node del=front;
	front=front.next;
	size--;	
	return temp;
		
}
	catch(NullPointerException e) {
		System.out.println("Nullpointer Exception has occurred");
		
	}

	return size;
}

public int peek()
{
	try {
	return front.data;
	}
	
	catch(NullPointerException e) {
		System.out.println("nullpointerException has occurred");
	}
	return size;
}

public boolean isempty()
{
	try {
	return size == 0;
	}
	catch(NullPointerException e) {
		System.out.println("nullpointerException has occurred");
	}
	return false;
}
public int display() {
	
	Node current = front;
	if(isempty()) {
		System.out.println("Queue is Empty");
	}
	while(current!= null) {
		System.out.print(current.data+" ");
		current=current.next;
		
	}
	
	return size;
	
}	
	public static void main(String[] args) throws Exception {
		Queue Q=new Queue();
		Scanner sc = new Scanner(System.in);
	    
	     while(true) {
	    	 System.out.println(" \n1.enqueue: \n2.dequeue : \n3.peek  : \n4.isempty  : \n5.display");
	     System.out.println("Enter your choice");
	     int n1=sc.nextInt();
	     switch(n1) {
	     case 1:
	     	System.out.println("Enter a element");
	     	Q.enqueue(sc.nextInt());
	     	break;
	     case 2:
	     	System.out.println("dequeue  :"+Q.dequeue());	     	
	     	break;
	     case 3  :
	     	System.out.println("peek :" +Q.peek());
	     	break;
	     case 4 :
	    	 System.out.println("empty : "+Q.isempty());
	     case 5 :
	    	 
	    	 System.out.println("display");
		        Q.display();
		        break;
	    	 
	     default:
	     		System.out.println("exit");
	     }

	     }
	
	}
	


	

}
