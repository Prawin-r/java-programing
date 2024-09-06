package Stac;

import java.util.Stack;

public class Stackk {
	public static void main(String[] args) {
		Stack <Integer> s= new Stack <Integer>();
		s.push(10);
		s.push(9);
		s.push(1);
		if(s.isEmpty()) {
			System.out.println("hi");
		}
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		if(s.isEmpty()) {
			System.out.println("hi");
		}

	}

}
