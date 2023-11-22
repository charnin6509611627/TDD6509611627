package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push(Integer item);
	Integer pop();
	Integer peek();
	Integer top();
}
