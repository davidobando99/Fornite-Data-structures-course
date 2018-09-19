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
     String abc = (String) "Hola";
     relation.push(abc);
     
     assertEquals(relation.getLast(), abc);
	}

}
