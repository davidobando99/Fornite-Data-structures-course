package collections;

public class Queue<T> implements IQueue<T> {
	
	public int SIZE_ASS= 100;
	private int highRank;
	private int lowRank;
	private Node<T> front;
	private Node<T>back;
	
	public Queue() {
		front=null;
		back=null;
	}

	public int getHighRank() {
		return highRank;
	}

	public void setHighRank(int highRank) {
		this.highRank = highRank;
	}

	public int getLowRank() {
		return lowRank;
	}

	public void setLowRank(int lowRank) {
		this.lowRank = lowRank;
	}

	public void setFront(Node<T> front) {
		this.front = front;
	}

	public void setBack(Node<T> back) {
		this.back = back;
	}

	@Override
	public void enqueue(T newElem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dequeue(T deleted) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(T searched) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getBack() {
		// TODO Auto-generated method stub
		return null;
	}

	


	


}
