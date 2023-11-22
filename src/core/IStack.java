package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push (int elm);
	int top();
	int pop();
}
