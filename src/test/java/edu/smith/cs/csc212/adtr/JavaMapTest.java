package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {

	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	
	public void testPut() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		
		assertEquals(object.size(), 1);
	}
	public void testGet() {
		MapADT<String, Integer> object = new JavaMap<>();
		
		assertEquals(object.get(null), null);
	}
	public void testSize() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		
		assertEquals(object.size(), 1);
	}
	public void testRemove() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		object.remove("hey");
		
		assertEquals(object.size(), 0);
	}
	public void getKeys() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		object.getKeys(); 
		
		assertEquals(object.getKeys(), "hey");
	}
	public void getEntries() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		object.getEntries(); 
		
		assertEquals(object.getEntries(), 1);
	}
}
