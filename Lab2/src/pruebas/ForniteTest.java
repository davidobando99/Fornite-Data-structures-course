package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import collections.HashTable;
import collections.IHashTable;
import mundo.Fornite;
import mundo.Player;

class ForniteTest {
	
	private Fornite fornite;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	private Player player5;
	private Player player6;
	
	
	public void setUp() {
		fornite= new Fornite();
		player1= new Player("David", 101, "norte",256, 233445, "PC" ,null);
		player2= new Player("Douglas", 188, "sur",432, 134322, "PC", null);
		player3= new Player("Huertas", 188, "sur",432, 134552, "Console", null);
		player4= new Player("Laura", 188, "norte",432, 346353, "Phone", null);
		player5= new Player("Pepito", 188, "oeste",432, 011111, "Phone", null);
		player6= new Player("Felipe", 188, "este",432, 586611, "Console", null);
		
	}

	@Test
	public void enqueueTest() {		
		setUp();
		fornite.enqueue(player1);
		fornite.enqueue(player2);
		String backName =fornite.getMyQueue().getBack().getValue().getName();
		assertEquals(player2.getName(), backName);
	}
	
	@Test
	public void dequeueTest() {
		setUp();
		fornite.enqueue(player1);
		fornite.enqueue(player2);
		fornite.dequeue(); //Borra el primero- Player1
		String frontName =fornite.getMyQueue().getFront().getValue().getName();
		assertEquals(player2.getName(), frontName);
	}
	
	@Test
	public void sizeQueueTest() {
		setUp();
		fornite.enqueue(player1);
		fornite.enqueue(player2);
		
		assertEquals(fornite.sizeQueue(),2 );
	}
	
	@Test
	public void addTableTest() {
		setUp();
		fornite.getPcTable().setSizeTable(3);
		fornite.addTable(player1, player1.getId());
		
		int slot =fornite.getPcTable().getSlot(player1.getId(), 1,1);
		assertEquals(player1.getName(), fornite.getPcTable().getHashTable()[slot].getValue().getName());
		
	}
	
	@Test
	public void searchTableTest() {
		setUp();
		fornite.getPcTable().setSizeTable(3);
		fornite.addTable(player1, player1.getId());
		fornite.addTable(player2, player2.getId());
		
		
		String player2Name = fornite.searchTable(fornite.getPcTable(), player2.getId()).getName();
		assertEquals(player2.getName(),player2Name);
		
	}
	
	@Test
	public void mostrarTablaTest() {		
		setUp();
		
		fornite.getPcTable().add(player1, player1.getId());
		fornite.getPcTable().add(player2, player2.getId());
		fornite.getConsoleTable().add(player3, player3.getId());
		fornite.getPhoneTable().add(player4, player4.getId());
		fornite.getPhoneTable().add(player5, player5.getId());
		fornite.getConsoleTable().add(player6, player6.getId());

		HashTable<Integer, Player> hashPlayer= fornite.mostrarTabla();

//		System.out.println("fornite " +fornite.mostrarTabla().getSizeTable());
		assertTrue(hashPlayer.getHashTable()!=null);
		
		
	}
	@Test
	public void addFirstPlayerTest() {
		setUp();
		
		
//		System.out.println(fornite.addFirstPlayer(fornite.mostrarTabla()).getName());
		assertTrue(!fornite.getPcTable().isEmpty()|| !fornite.getConsoleTable().isEmpty()||!fornite.getPhoneTable().isEmpty());
		
	}
//	@Test
//	public void addLowerLevelTest() {
//		setUp();
//		
//		HashTable<Integer, Player> m= null;
//		m=fornite.mostrarTabla();
//		Player player=fornite.addFirstPlayer(m);
//		System.out.println("First player " +player.getSkill());
//		fornite.addLowerLevel(player, m);
//		
//		assertTrue(fornite.getMyQueue().getBack().getValue().getSkill()<=player.getSkill());
//		
//		
//		
//		
//	}
	
	

}
