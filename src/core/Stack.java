package core;

import java.util.ArrayList;

public class Stack implements IStack {

	private ArrayList<Integer> s1 = new ArrayList<Integer>() ;
	private int size;
	private int maxSize;
	Stack (int maxSize) {
		this.maxSize = maxSize;
	}
	Stack () {
		size = 0;
	}
	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		
		}
		else return false;
	}
	@Override
	public boolean isFull() {
		if (size == maxSize) {
			return true;
		
		}
		else return false;
	}

	@Override
	public int getSize() {
		if (size != 0) {
			return size;
		}
		else {
			return 0;	
		}
	}

	@Override
	public void push(int elm) {		
		s1.add(elm);
		size++;
	
	}

	@Override
	public int top() {
		if (isEmpty()) {
			return -1;
		}
		else  {
			return (int) s1.get(size-1);
		}

	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		else {
			size = size-1;
			return (int) s1.get(size);
		}

	}
	

}
