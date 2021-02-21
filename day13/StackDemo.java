package day13;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		s.push(1);//  java1.0
		s.add(2);// java1.2
		s.add(3);
		
		System.out.println(s);
		
		System.out.println("it returns top element"+s.peek());
		System.out.println("it return and removes the top element"+s.pop());
		System.out.println("after poping out "+s);
		
		System.out.println(s.pop());
		System.out.println("after poping out "+s);
		
	}

}
