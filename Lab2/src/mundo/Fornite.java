package mundo;

import collections.IHashTable;
import collections.IQueue;
import collections.Node;
import collections.Queue;

public class Fornite {
	
	private Player player;
	private IQueue<Player> myQueue;
	private IHashTable<Integer, Player> xboxTable;
	private IHashTable<Integer, Player> phoneTable;
	private IHashTable<Integer, Player> pcTable;
	

	public Fornite() {
		myQueue= new Queue<Player>();
	}
	
	
	public IQueue<Player> getMyQueue() {
		return myQueue;
	}
	
	public IHashTable<Integer, Player> getXboxTable() {
		return xboxTable;
	}


	public void setXboxTable(IHashTable<Integer, Player> xboxTable) {
		this.xboxTable = xboxTable;
	}


	public IHashTable<Integer, Player> getPhoneTable() {
		return phoneTable;
	}


	public void setPhoneTable(IHashTable<Integer, Player> phoneTable) {
		this.phoneTable = phoneTable;
	}


	public IHashTable<Integer, Player> getPcTable() {
		return pcTable;
	}


	public void setPcTable(IHashTable<Integer, Player> pcTable) {
		this.pcTable = pcTable;
	}


	public void setMyQueue(IQueue<Player> myQueue) {
		this.myQueue = myQueue;
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
	
	public void add(Player newElement, Integer key) {
		
	}


	public static void main(String[] args) {
		Fornite f = new Fornite();
		
		Player uno= new Player("Huertas",80,"Sur",50,3107);

		f.enqueue(uno);
		System.out.println(f.size());
		System.out.println(f.getMyQueue().getFront().getValue().getName());
		
	
	
	}


	
	
	

}
