package hint1;

public class MyStaticStack implements MyStack {

	private int items[];
	private int numItems;
	private int maxItems;

	
	public MyStaticStack(int m){
		maxItems = m;
		items = new int[maxItems];
		numItems = 0;
	}


	public boolean isEmpty(){
		if (this.numItems == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int pop(){
		if (numItems > 0) {
			//int temp = numItems;
			int item = items[numItems-1];
			numItems--;
			return item;
		}
		else {
			System.out.println("ERROR: There are no items in the stack");
			return -1;
		}
	}


	public void push(int element){
		if (this.numItems < maxItems) {
			items[this.numItems] = element;
			this.numItems++;
		}
		else {
			System.out.println("ERROR: The stack is full.");
		}
	}
	
	
	public void print(){
		int temp = numItems;
		if (temp > 0) {
			while (temp > 0) {
				System.out.print(items[temp-1] + " ");
				temp--;
			}
		}
		else {
			System.out.println("ERROR: Stack is empty");
		}
	}
	
}
