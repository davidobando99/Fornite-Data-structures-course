package mundo;

import collections.IQueue;
import collections.Node;
import collections.Queue;

public class Fornite {
	
	private Player player;
	private IQueue<Player> myQueue;
	

	public Fornite() {
		myQueue= new Queue<Player>();
	}
	
	
	public IQueue<Player> getMyQueue() {
		return myQueue;
	}
	


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public void setMyQueue(Queue<Player> miQueue) {
		this.myQueue = miQueue;
	}
	
	
	public void dequeue() {
		// TODO Auto-generated method stub
		
	}


	
	public void search(Player searched) {
		// TODO Auto-generated method stub
		
	}


	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	
	public void enqueue(Player newElem) {
		myQueue.enqueue(newElem);
		
	}
	
	public int size() {
		return myQueue.size();
	}


	public static void main(String[] args) {
		Fornite f = new Fornite();
		
		Player uno= new Player("Huertas",80,"Sur",50,3107);

		f.enqueue(uno);
		System.out.println(f.size());
		System.out.println(f.getMyQueue().getFront().getValue().getName());
		
	
	
	}


	
	
	

}
