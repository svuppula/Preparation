package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class JavaPrep implements Runnable {
	
	public void unicode() {
		//\u000d System.out.println("something strange");
	}
	public void string_reference() {
		String one  = new String("Random");// new String() is not good to use
		String two  = new String("Random");
		if(one == two) {
			System.out.println("Bothe Are Same");
		}
		else System.out.println("Both Are Different");
	}
	public void integer_referene() {
		Integer i1 = 127;
		Integer i2 = 127;
		
		System.out.println(i1==i2);
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i3==i4);
	}
	
	public void min_value() {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
	}
	
	public void fibanacci() {
		int f = 0;
	    int g = 1;

	    while(f<100) {
	        System.out.print(f + " ");
	        f = f + g;
	        g = f - g;
	    } 
	    System.out.println();
	}
	
	public void magic_with_map() {
	Map<Integer,String> hm =new HashMap<Integer,String>();
		
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		System.out.println("get method in Hash Map: " + hm.get(3));
		
		Map<Integer, String> chm =new ConcurrentHashMap<Integer, String>();
		
		chm.put(1,"A");
		chm.put(2,"B");
		chm.put(3,"C");
		chm.put(4,"D");
		System.out.println("get method in Concurrent Hash Map: " + chm.get(4));
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1,"A");
		ht.put(2,"B");
		ht.put(3,"C");
		ht.put(4,"D");
		System.out.println("get method in Hash Table: " + ht.get(1));
			
	}
	
	public void magic_with_list() {
    	ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("3.65");	
		System.out.print("Array List : " );
		al.stream().forEach(a -> System.out.print(a + " ")) ;
		System.out.println();
		
		LinkedList<String> lL = new LinkedList<String>();
		lL.add("a");
		lL.add("b");
		lL.add("3.65");	
		System.out.print("Linked List : " );
		lL.stream().forEach(a -> System.out.print(a + " ")) ;
		System.out.println();	
		
		Vector<String> vR = new Vector<String>();
		vR.add("a");
		vR.add("x");
		vR.add("3.65");	
		vR.add("d");
		vR.add("z");
		vR.add("a");
		System.out.print("Vector : " );
		vR.stream().forEach(a -> System.out.print(a + " ")) ;
		System.out.println();		}
	
	public void magic_with_set() {
		HashSet<String> hS = new HashSet<String>();		
		hS.add("a");
		hS.add("b");
		hS.add("c");
		hS.add("d");
		hS.add("a");
		hS.add("1");
		hS.add("0");
        System.out.println("Hash Set :" + hS);
        
        TreeSet<String> tS = new TreeSet<>();
        tS.add("A");
        tS.add("a");
        tS.add("1");
        tS.add("1a");
        System.out.println("Tree Set :" + tS);
        
        LinkedHashSet<String> lhS = new LinkedHashSet<>();
        lhS.add("A");
        lhS.add("a");
        lhS.add("a");
        lhS.add("1");
        lhS.add("1a");
        System.out.println("Linked Hash Set :" + lhS);
   	}
	
	@Override
	public void run() {
		Thread t1 = new Thread();
		t1.setName("First Thread: ");
		t1.setPriority(10);;
		t1.setDaemon(true);
		t1.start();
		t1.interrupt();
		System.out.println("T1 current state & priority: " + t1.getState()+" " + t1.getPriority());
	}
	
	public void numberInWords() {
		
	}	
	
	public static void main(String[] args) {
	JavaPrep iW = new JavaPrep();
	iW.unicode();
	iW.string_reference();
	iW.integer_referene();
	iW.min_value();
	iW.fibanacci();
	iW.magic_with_map();
	iW.magic_with_list();
	iW.magic_with_set();
	iW.run();
	}
	
}
