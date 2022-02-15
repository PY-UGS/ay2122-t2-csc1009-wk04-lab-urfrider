public class StackOfIntegers {
	private int[] elements;
	private int size;
	private int top;
	private int capacity = 16;
	
	public StackOfIntegers() {
		this.elements = new int[this.capacity];
		this.top = -1;
		this.size = 0;
	}
	
	public StackOfIntegers(int capacity) {
		this.capacity = capacity;
		this.elements = new int[capacity];
		this.top = -1;
		this.size = 0;
	}
	
	public boolean empty() {
		if (this.top == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int peek() {
		return elements[this.top];
	}
	
	public void push(int value) {
		if (getSize() == this.capacity) {
			System.out.println("STACK IS FULL");
			System.exit(1);
		}
		this.top++;
		this.size++;
		this.elements[this.top] = value;
	}
	
	public int pop() {
		if (empty()) {
			System.out.println("STACK IS EMPTY");
			System.exit(1);
		}
		this.size--;
		return this.elements[this.top--];		
	}
	
	public int getSize() {
		return (this.size);
	}
	
}
