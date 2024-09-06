package Linkedlist;

public class LinkedList {
	int size;
	Node head;
	
	public void add(int data) {
		if(head ==null) {
			head =new Node(data);
			return;
		}
		Node current;
		current =head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new Node(data);
		size++;
	}
	public void display() {
		Node curr= head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	public int get(int index) {
		int res=0;
		if(index<size) {
			Node cur =head;
			int count=0;
			while(cur!=0) {
				if(count==index) {
					res=cur.next;
				}
			}
		}
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		//return "list"+head;
		String s="[";
		Node cur =head;
		while(cur!=null) {
			s=s+cur.data+",";
			cur = cur.next;
		}
		return s+"]";
		
	}
}
