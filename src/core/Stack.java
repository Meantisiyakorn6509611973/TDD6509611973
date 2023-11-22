package core;

import java.util.ArrayList;

public class Stack implements IStack {

	private ArrayList<Integer> s1 = new ArrayList<Integer>() ;
	//private Stack s2 = new Stack ();
	private int size = 0;
	/*Stack (int size) {
		this.size = size;
	}
	Stack () {
		int size = 0;
	}*/
	@Override
	public boolean isEmpty() {
		if (size == 0) {
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
		// TODO Auto-generated method stub
	}

	@Override
	public void push(int elm) {		
		//int size = 0;
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
			return (int) s1.get(size--);
		}
		// TODO Auto-generated method stub

	}
	

}
