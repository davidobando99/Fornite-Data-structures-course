package mundo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import collections.HashNode;
import collections.HashTable;
import collections.IHashTable;
import collections.IQueue;
import collections.Node;
import collections.Queue;
import collections.Stack;

public class Fornite {

	// *************************
	// CONSTANTS
	// *************************

	public static final int AMOUNT_TABLE = 50000;

	// *************************
	// ATTRIBUTES
	// *************************

	// *************************
	// RELATIONS
	// *************************

	private IQueue<Player> myQueue;
	private IHashTable<Integer, Player> consoleTable;
	private IHashTable<Integer, Player> phoneTable;
	private IHashTable<Integer, Player> pcTable;

	/**
	 * Constructor method of the Fortnite class.
	 */
	public Fornite() {
		myQueue = new Queue<Player>();
		consoleTable = new HashTable<Integer, Player>(AMOUNT_TABLE);
		phoneTable = new HashTable<Integer, Player>(AMOUNT_TABLE);
		pcTable = new HashTable<Integer, Player>(AMOUNT_TABLE);

	}

	// ****************************
	// METHODS GETS AND SETTERS
	// ****************************

	public IQueue<Player> getMyQueue() {
		return myQueue;
	}

	public IHashTable<Integer, Player> getConsoleTable() {
		return consoleTable;
	}

	public void setConsoleTable(IHashTable<Integer, Player> xboxTable) {
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

	public Player searchTable(IHashTable<Integer, Player> myHash, Integer key) {
		return myHash.search(key).getValue();
	}

	// public void skillRanking(HashTable<Integer, Player> myHash) {
	//// int key=generateRandom();
	// HashNode<Integer,Player> player = searchTable(myHash,key);
	// myQueue.enqueue(player.getValue());
	//
	//
	//
	// }
	public Player addFirstPlayer(HashTable<Integer, Player> hashTable) {
		int key = hashTable.getSlot(generateRandom(1, 100000), 1, 1);

		Player player = null;
		boolean cond = false;

		while (!cond) {

			if (key <= AMOUNT_TABLE) {
				
				System.out.println("llave" +key);

				if (hashTable.getHashTable()[key] != null) {

//					System.out.println("This");

					if (hashTable.getHashTable()[key].getValue().getSkill() > 5) {

						player = hashTable.getHashTable()[key].getValue();
						myQueue.enqueue(player);
						cond = true;
						System.out.println("agregado");
					}

				}
				else
					key = generateRandom(1, 100000);
			} 
		}

		if (player == null) {
			System.out.println(key);

		}
		return player;

	}

	public Player addLowerLevel(Player medium, HashTable<Integer, Player> hashTable) {
		System.out.println("sss"+medium.getSkill());

		int x = 50;
		int conta = 0;
		Player n = null;
		
		

		if (medium.getSkill() <= 50) {
			System.out.println("YYY");
			x = newSkillLow(medium.getSkill());
			System.out.println("XXXX");

		}

		int key = hashTable.getSlot(generateRandom(medium.getSkill() - x, medium.getSkill()), 1, 1);

		while (conta <= 50) {
			System.out.println("8888");

			n = newPlayerHash(key, medium.getSkill() - x, medium.getSkill(), hashTable);
			System.out.println("Enqueue");
			myQueue.enqueue(n);
			conta++;
			System.out.println("Conta " + conta);
		}
		return n;

	}

	public Player newPlayerHash(int key, int min, int max, HashTable<Integer, Player> hashTable) {
		boolean n = false;
		Player player1 = null;

		while (!n) {	
			

			
			
			
			if (key <= AMOUNT_TABLE) {
				HashNode<Integer, Player> player = hashTable.getHashTable()[key];
				System.out.println("WWW");

				if (player != null && player.getValue().getSkill() >= min && player.getValue().getSkill() <= max) {
					n = true;
					System.out.println("first");
					player1 = player.getValue();
				}
				
				key = hashTable.getSlot(generateRandom(min, max), 1, 1);
			}
			key = hashTable.getSlot(generateRandom(min, max), 1, 1);
		}
		return player1;
	}

	public void addHighLevel(Player medium, HashTable<Integer, Player> hashTable) {

		int x = 50;
		int conta = 0;

		if (medium.getSkill() + 50 >= 500) {

			x = newSkillHigh(medium.getSkill());
		}
		int key = hashTable.getSlot(generateRandom(medium.getSkill(), medium.getSkill() + x), 1, 1);

		while (conta <= 50) {
			Player n = newPlayerHash(key, medium.getSkill(), medium.getSkill() + x, hashTable);

			myQueue.enqueue(n);
			conta++;
		}

	}

	public int newSkillHigh(int num) {

		int high = 50;

		while (num + high > 500) {
			high -= 5;
		}
		return high;
	}

	public int newSkillLow(int num) {
		int low = 50;

		while (num - low <= 0) {
			low -= 5;
			System.out.println("salir");
		}
		return low;
	}

	public HashTable<Integer, Player> mostrarTabla() {

		boolean e = false;
		HashTable<Integer, Player> n = new HashTable<Integer, Player>(AMOUNT_TABLE);
		int key = generateRandom(1, 1000000);

		while (!e) {

			try {
				if (phoneTable.getHashTable()[key] != null) {
					e = true;

					n.setHashTable(phoneTable.getHashTable());

				} else if (pcTable.getHashTable()[key] != null) {
					e = true;

					n.setHashTable(pcTable.getHashTable());
				} else if (consoleTable.getHashTable()[key] != null) {
					e = true;

					n.setHashTable(consoleTable.getHashTable());
				}
			} catch (Exception e1) {
				key = generateRandom(1, 1000000);
			}
			key = generateRandom(1, 1000000);
		}
		return n;

	}

	public int generateRandom(int min, int max) {

		return ThreadLocalRandom.current().nextInt(min, max);
	}

	public void readPlayers() {
		try {
			File file = new File("./data/pruebaAleatorios.txt");
			FileReader reader = new FileReader(file);

			BufferedReader buffer = new BufferedReader(reader);
			String line = "";
			String[] array = new String[6];
			String name = "";
			int ping = 0;
			int id = 0;
			String geo = "";
			String platform = "";
			int skill = 0;
			Stack<Weapon> stack = new Stack<Weapon>();
			Weapon ax = new Weapon("hacha", "img", 30, Weapon.MELEE);
			stack.push(ax);
			while ((line = buffer.readLine()) != null) {
				array = line.split(",");

				name = array[0];
				ping = Integer.parseInt(array[1]);
				id = Integer.parseInt(array[2]);
				geo = array[3];
				platform = array[4];
				skill = Integer.parseInt(array[5]);

				Player newPlayer = new Player(name, ping, geo, skill, id, platform, stack);
				addTable(newPlayer, newPlayer.getId());

			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Player> listPlayers() {

		ArrayList<Player> py = new ArrayList<Player>();

		while (myQueue.getFront() != null) {
			Player aux = myQueue.getFront().getValue();
			py.add(aux);
			myQueue.dequeue();
		}

		return py;
	}

	public static void main(String[] args) {
		Fornite f = new Fornite();
		f.readPlayers();
		
		HashTable<Integer, Player> m= null;
		m=f.mostrarTabla();
		Player pl = f.addFirstPlayer(m);
		System.out.println("33333333333");
		

		System.out.println("Jugador " + pl.getSkill());
		System.out.println(pl.getSkill());
		
		f.addLowerLevel(pl, m);
//		System.out.println(f.getMyQueue().getBack().getValue().getSkill());

//		System.out.println(f.searchTable(f.getConsoleTable(), 610997).getName());

	}

}