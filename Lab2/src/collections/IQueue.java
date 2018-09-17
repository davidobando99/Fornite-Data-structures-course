package collections;

import mundo.Player;

public interface IQueue<T> {
	
	public void enqueue(T newElem);
	public void dequeue();
	public void search(T searched);
	public int size();
	public boolean isEmpty();
	

}
