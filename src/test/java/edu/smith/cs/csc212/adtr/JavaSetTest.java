package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaList;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		
		assertEquals(empty.size(), 0);
	}
	@Test
	public void testInsert() {
		SetADT<String>  object = new JavaSet<>();
		
		// insert something into object
		object.insert("1");
		
		assertEquals(object.size(), 1);
	}
	@Test
	public void testContains () {
		SetADT<String>  object = new JavaSet<>();
		SetADT<String>  object2 = new JavaSet<>();
		
		object.insert("1");
		object2.insert("1");
		
		assertEquals(object.contains("1"), object2.contains("1"));
	}
	@Test
	public void testRemove () {
		SetADT<String>  object = new JavaSet<>();
		
		object.insert("1");
		object.remove("1");
		
		assertEquals(object.size(), 0);
	}
	@Test
	public void toList () {
		SetADT<String>  object = new JavaSet<>();
		
		ListADT<String> objAsList = object.toList(); 
		
		assertTrue(objAsList instanceof ListADT);
		assertEquals(objAsList.size(), object.size());
	}
	@Test
	public void toJava () {
		SetADT<String>  object = new JavaSet<>();
		
		Set<String> jSet = object.toJava(); 
		
		assertEquals(jSet.size(), object.size());
	}
	
	
	
}
