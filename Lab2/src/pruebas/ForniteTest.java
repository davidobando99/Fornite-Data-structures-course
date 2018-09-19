package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mundo.Fornite;
import mundo.Player;

class ForniteTest {
	
	private Fornite fornite;
	private Player player1;
	private Player player2;
	
	
	public void setUp() {
		fornite= new Fornite();
		player1= new Player("David", 101, "norte",256, 233445, "PC" ,null);
		player2= new Player("Douglas", 188, "sur",432, 134322, "PC", null);
		
		
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
	
	public void addTableTest() {
		setUp();
		fornite.getPcTable().setSizeTable(3);
		fornite.addTable(player1, player1.getId());
		
		int slot =fornite.getPcTable().getSlot(player1.getId(), 1,1);
		assertEquals(player1.getName(), fornite.getPcTable().getHashTable()[slot].getValue().getName());
		
	}
	
	public void searchTableTest() {
		setUp();
		fornite.getPcTable().setSizeTable(3);
		fornite.addTable(player1, player1.getId());
		fornite.addTable(player2, player2.getId());
		
		
		String player2Name = fornite.searchTable(fornite.getPcTable(), player2.getId()).getValue().getName();
		assertEquals(player2.getName(),player2Name);
		
	}
	
	

}
