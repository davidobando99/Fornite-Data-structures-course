package mundo;

import collections.HashNode;
import collections.HashTable;
import collections.IHashTable;
import collections.IQueue;
import collections.Node;
import collections.Queue;

public class Fornite {

	
	private IQueue<Player> myQueue;
	private IHashTable<Integer, Player> consoleTable;
	private IHashTable<Integer, Player> phoneTable;
	private IHashTable<Integer, Player> pcTable;
	

	public Fornite() {
		myQueue = new Queue<Player>();
		consoleTable = new HashTable<Integer, Player>();
		phoneTable = new HashTable<Integer, Player>();
		pcTable = new HashTable<Integer, Player>();
		
	}

	public IQueue<Player> getMyQueue() {
		return myQueue;
	}

	public IHashTable<Integer, Player> getXboxTable() {
		return consoleTable;
	}

	public void setXboxTable(IHashTable<Integer, Player> xboxTable) {
		this.consoleTable = xboxTable;
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


	public void setMyQueue(Queue<Player> miQueue) {
		this.myQueue = miQueue;
	}

	public void dequeue() {
		myQueue.dequeue();

	}

	

	public boolean isQueueEmpty() {
		return myQueue.isEmpty();
	}

	public void enqueue(Player newElem) {
		myQueue.enqueue(newElem);

	}

	public int sizeQueue() {
		System.out.println(myQueue.size());
		return myQueue.size();
	}
	

	public void addTable(Player newElement, Integer key) {

		if (newElement.getPlatform().equals(Player.CONSOLE)) {

			consoleTable.add(newElement, key);

		} else if (newElement.getPlatform().equals(Player.PC)) {
			pcTable.add(newElement, key);
		} else {
			phoneTable.add(newElement, key);
		}

	}
	public HashNode<Integer, Player> searchTable(IHashTable<Integer, Player> myHash, Integer key) {
		return myHash.search(key);
	}
	
	public void skillRanking(HashTable<Integer, Player> myHash) {
		int key=generateRandom();
		HashNode<Integer,Player> player = searchTable(myHash,key);
		myQueue.enqueue(player.getValue());
		
		
	
	}
	
	public int generateRandom() {
		
		return (int)( Math.random()*1000000 )+1;
	}

	public static void main(String[] args) {
		Fornite f = new Fornite();
		Player uno = new Player("Huertas", 80, "Sur", 50, 3107, "cp",null);
		Player dos = new Player("Huertas", 80, "Sur", 50, 3107, "cp",null);
      
		f.enqueue(uno);
		f.enqueue(dos);
		System.out.println(f.sizeQueue());
		System.out.println(f.getMyQueue().getFront().getValue().getName());

	}

}
