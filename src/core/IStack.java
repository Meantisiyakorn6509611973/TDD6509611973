package core;

public interface IStack {
	boolean isEmpty();
	boolean isFull();
	int getSize();
	void push (int elm);
	int top();
	int pop();
}
