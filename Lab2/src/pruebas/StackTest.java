package pruebas;
import collections.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
 
	private Stack<String> relation;
	
	@Before
	public void initialization() {
		relation = new Stack<String>();
	}
	@Test
	public void testPush() {
     String abc = "Hola";
     relation.push(abc);
     
     assertEquals(abc, relation.getLast().getValue());
     
     String abcd = "Pruebame este";
     relation.push(abcd);
     
     assertEquals(abcd, relation.getLast().getValue());
     
     String abcde = "Pruebame este2";
     relation.push(abcde);
     
     assertEquals(abcde, relation.getLast().getValue());
	}
	
	@Test
	public void testPop() {
		 String abc = "Hola";
	     relation.push(abc);
	     
	     String abcd = "Pruebame este";
	     relation.push(abcd);
	     
	     String abcde = "Pruebame este2";
	     relation.push(abcde);
	     
	     relation.pop();
	     
	     assertEquals(abcd, relation.getLast().getValue());
	}
	
	@Test
	public void testTop() {
		
		 String abc = "Hola";
	     relation.push(abc);
	     
	     String abcd = "Pruebame este";
	     relation.push(abcd);
	     
	     String abcde = "Pruebame este2";
	     relation.push(abcde);
	     
	     assertEquals(abcde, relation.top());
		
	}
	
	@Test
	public void testIsEmpty() {
		 String abc = "Hola";
	     relation.push(abc);
	     
	     String abcd = "Pruebame este";
	     relation.push(abcd);
	     
	     String abcde = "Pruebame este2";
	     relation.push(abcde);
	     
	     boolean isEmpty = relation.isEmpty();
	     
	     assertTrue(false == isEmpty);
		
	}
	
	@Test
	public void testSize() {
		
		 int accountant = 3;
		 
		 String abc = "Hola";
	     relation.push(abc);
	     
	     String abcd = "Pruebame este";
	     relation.push(abcd);
	     
	     String abcde = "Pruebame este2";
	     relation.push(abcde);
	     
	     int actual = relation.size();
	     
	     assertEquals(accountant, actual);
		
	}
	
	@Test
	public void testSearch() {
		
		 String abc = "Hola";
	     relation.push(abc);
	     
	     String abcd = "Pruebame este";
	     relation.push(abcd);
	     
	     String abcde = "Pruebame este2";
	     relation.push(abcde);
		
		boolean actual = relation.search("Hola");
		boolean hope = true;
		
		assertTrue(hope == actual);
		
	}
	
	
	

}
