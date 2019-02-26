package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		
		assertEquals(empty.size(), 0);
	}
	public void testInsert() {
		SetADT<String>  object = new JavaSet<>();
		
		// insert something into object
		object.insert("1");
		
		assertEquals(object.size(), 1);
	}
	public void testContains () {
		SetADT<String>  object = new JavaSet<>();
		SetADT<String>  object2 = new JavaSet<>();
		
		object.insert("1");
		object2.insert("1");
		
		assertEquals(object.contains("1"), object2.contains("1"));
	}
	public void testRemove () {
		SetADT<String>  object = new JavaSet<>();
		
		object.insert("1");
		object.remove("1");
		
		assertEquals(object.size(), 0);
	}
	public void toList () {
		SetADT<String>  object = new JavaSet<>();
		
		object.toList(); 
		
		assertEquals(object, List);
	}
	public void toJava () {
		SetADT<String>  object = new JavaSet<>();
		
		object.toJava(); 
		
		assertEquals(object, );
	}
	
	
	
}
