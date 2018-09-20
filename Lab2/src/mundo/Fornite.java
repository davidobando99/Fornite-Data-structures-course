package mundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ThreadLocalRandom;

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
	
//	public void skillRanking(HashTable<Integer, Player> myHash) {
////		int key=generateRandom();
//		HashNode<Integer,Player> player = searchTable(myHash,key);
//		myQueue.enqueue(player.getValue());
//		
//		
//	
//	}
	public void addFirstPlayer(HashTable<Integer, Player> hashTable) {
		int key=generateRandom(1, 1000000);
		Player player= null;
		boolean cond=false;
		
		while(!cond) {
			if(hashTable.getHashTable()[key]!=null) {
				
				if(hashTable.getHashTable()[key].getValue().getSkill()>5) {
					cond=true;
					player=hashTable.getHashTable()[key].getValue();
				}
				
			}
			else
				key= generateRandom(1, 1000000);
		}
		addLowerLevel(player, hashTable);
		
	}
	
	public void addLowerLevel( Player medium, HashTable<Integer, Player> hashTable) {
		
		int x= 50;
		int conta = 0;
		Player n=null;
		
		if(medium.getSkill()<= 50) {
			x= newSkillLow(medium.getSkill());
		}
		int key= generateRandom(medium.getSkill()-x, medium.getSkill());
		
		while(conta<=50) {
			 n= newPlayerHash(key, medium.getSkill()-x, medium.getSkill(), hashTable);
			myQueue.enqueue(n);
			conta++;
		}
		addHighLevel(n, hashTable);
		
	}
	
	public void addHighLevel(Player medium, HashTable<Integer, Player>hashTable) {
		
		int x=50;
		int conta=0;

		if(medium.getSkill() + 50 >=500) {
			
			x=newSkillHigh(medium.getSkill());
		}
		int key=generateRandom(medium.getSkill(), medium.getSkill()+x);
		
		while(conta<=50) {
			Player n=newPlayerHash(key, medium.getSkill(), medium.getSkill()+x, hashTable);
			
			myQueue.enqueue(n);
			conta++;
		}
		
			
		
		
	}
	
	public int newSkillHigh(int num) {
		
		int high= 50;
		
		while(num + high>500) {
			high-=5;
		}
		return high;
	}
	
	public Player newPlayerHash(int key, int min, int max, HashTable<Integer, Player> hashTable) {
		boolean n= false;
		Player player=null;
		
		while(!n) {
			key = generateRandom(min, max);
			 player= hashTable.getHashTable()[key].getValue();
			
			if(player!=null && player.getSkill()>=min && player.getSkill()<=max) {
				n=true;
			}
		}
		return player;
	}
	
	public int newSkillLow( int num) {
		int low=50;
		
		while(num-low<=0) {
			low-=5;
		}
		return low;
	}
	public HashTable<Integer,Player> mostrarTabla() {
		
		boolean e=false;
		HashTable<Integer, Player> n= new HashTable<>();
		int key=generateRandom(1, 1000000);
		while(!e) {
			
			if(phoneTable.getHashTable()[key]!=null ) {
				e=true;	
				n.setHashTable(phoneTable.getHashTable());
				
			}
			else if( pcTable.getHashTable()[key]!=null){
				e=true;	
				n.setHashTable(pcTable.getHashTable());
			}
			else if(consoleTable.getHashTable()[key]!=null) {
				e=true;	
				n.setHashTable(consoleTable.getHashTable());
			}
		}
		return n;
		
	}
	
	
	public int generateRandom(int min, int max) {
		
		return ThreadLocalRandom.current().nextInt(min,max);
	}
	
//	public readPlayers() {
//		File file = new File("./data/pruebaAleatorios.txt");
//		FileReader reader = new FileReader(file);
//		BufferedReader buffer = new BufferedReader(reader);
//		String line="";
//		int arreglo=0;
//		arreglo=2;
//		while((line= buffer.readLine())!=null) {
//			Player newPlayer = new Player();
//			
//		}
//	    
//	}
	
	

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
