package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaMapTest {

	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	@Test
	public void testPut() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		
		assertEquals(object.size(), 1);
	}
	// test asking for something that doesn't exist
	@Test
	public void testGet() {
		MapADT<String, Integer> object = new JavaMap<>();
		
		assertEquals(object.get(null), null);
	}
	// test asking for something that does
	@Test
	public void testGet2() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		assertEquals((int) object.get("hey"), 1);
	}
	@Test
	public void testSize() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		
		assertEquals(object.size(), 1);
	}
	@Test
	public void testRemove() {
		MapADT<String, Integer> object = new JavaMap<>();
		
		object.put("hey", 1);
		//System.out.println(object.get("hey")); 
		object.remove("hey");
		
		
		assertEquals(object.size(), 0);
	}
	@Test
	public void getKeys() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		object.getKeys(); 
		
		assertEquals(object.getKeys().size(), 1);
	}
	@Test
	public void getEntries() {
		MapADT<String, Integer> object = new JavaMap<>();
		object.put("hey", 1);
		object.getEntries(); 
		
		assertEquals(object.getEntries().size(), 1);
	}
	@Test
	public void toJava () {
		SetADT<String>  object = new JavaSet<>();
		
		Set<String> jSet = object.toJava(); 
		
		assertEquals(jSet.size(), object.size());
	}
	
}

