package Linkedlist;

public class Node {
	int data;
	Node next;
	Node(){}
	Node(int data){
		this.data=data;
		this.next=null;
	}
	Node(int data,Node next){
		this.data=data;
		this.next=null;
	}
	public String toString() {
		return "Node[data=" + data +", next"+next +"]";
	}
}
	
