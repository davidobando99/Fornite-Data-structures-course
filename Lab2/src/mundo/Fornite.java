package mundo;

import collections.IQueue;
import collections.Node;
import collections.Queue;

public class Fornite implements IQueue<Player>{
	
	private Player player;
	private Queue<Player> miQueue;
	//private IQueue<Player> miQueue;

	public Fornite() {
		miQueue= new Queue<Player>();
	}
	
	
	public Queue<Player> getMiQueue() {
		return miQueue;
	}
	


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public void setMiQueue(Queue<Player> miQueue) {
		this.miQueue = miQueue;
	}
	
	@Override
	public void dequeue() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void search(Player searched) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void enqueue(Player newElem) {
		miQueue.enqueue(newElem);
		
	}
	@Override
	public int size() {
		return miQueue.size();
	}


	public static void main(String[] args) {
		Fornite f = new Fornite();
		
		Player uno= new Player("Huertas",80,"Sur",50,3107);
//		Node<Player> n= new Node<Player>(uno);
		f.enqueue(uno);
		System.out.println(f.size());
		System.out.println(f.getMiQueue().getFront().getValue().getName());
		
	
	
	}


	
	
	

}
