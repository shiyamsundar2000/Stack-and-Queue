package Task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Stack1linkedList<T> {
	class Node
	{
		T data;
		Node next;
		Node(T val)
		 {
			data=val;
			next =null;
		 }
		
	 }
	 Node top;
	  int size = 0;
		
		 Stack1linkedList() 
		 { 
			 top=null;
		 
		  }
		 
	public void push(T val) 
	{
		Node sNode = new Node(val);
		sNode.next=top;
		top=sNode;
		size++;
	}
	
	public T pop() throws Exception 
	{
		try {
		if(top==null)
			System.out.println("Queue is empty");
		T temp=top.data;
		top = top.next;
		size--;
		return temp;
	}
		catch(NullPointerException e) {
			System.out.println("Nullpointer Exception has occurred");		
			}
		return null;
	}
	public T peek()
	{
		try {
		return top.data;
		}
		catch(NullPointerException e) {
			System.out.println("NullpointerException has occurred");
		}
		return null;
	}
	public boolean isempty()
	
	{
		try {
		return size == 0;
		}
		catch(NullPointerException e) {
			System.out.println("NullpointerException has occurred");
		}
		return false;
	}
	public int size() {
		return size;
	}
	public int display() {
		Node current = top;
		if(isempty())
			System.out.println("Stack is empty");
		while(current!= null) {
			System.out.print(current.data+" ");
			current=current.next;
			
		}
		
		return size;
		
	}
	
	public static void main(String[] args) throws Exception {
		 Stack1linkedList<Integer> s=new Stack1linkedList<Integer>();			
	     Scanner s1=new Scanner(System.in);
	     
	     while(true) {
	     System.out.println("\nselect \n1.push :\n2.pop :\n3.peek :\n4.display :\n5.Empty :\n	");
	     System.out.println("Enter your choice");
	     int n1=s1.nextInt();
	     switch(n1) {
	     case 1:
	     	System.out.println("Enter a element");
	     	s.push(s1.nextInt());
	     	break;
	     case 2:
	     	System.out.println("remove the element : "+s.pop());
	     	
	     	break;
	     case 3  :
	     	System.out.println("recent the element :" +s.peek());
	     	
	     	break;
	     case 4 :
	     System.out.println("display");
	        s.display();
	        break;
	     case 5 :
	    	 System.out.println("empty : "+s.isempty());
	     default:
	     		System.out.println("exit");
	     }

	     }
	
	}
	
}