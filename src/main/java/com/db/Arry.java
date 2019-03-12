package com.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Arry {

	@Test
	public void array() {
		 /*ArrayList<String> ar  = new   ArrayList<String>();
		 LinkedList<String> lr = new LinkedList<String>();*/
		// TreeSet<String>   tr =  new  TreeSet<String>();
		 PriorityQueue<String> tr = new PriorityQueue<String>();
		 HashMap<Integer, String>  map = new HashMap<Integer,String> ();
		 map.put(1,"Amit");  
		    map.put(5,"Rahul");  
		    map.put(2,"Jai");  
		    map.put(6,"Amit");  
		    
		    Set set     = map.entrySet();
		     Iterator itr            = set.iterator();
		     while(itr.hasNext())
		     {
		    	 Map.Entry entey =(Map.Entry)itr.next();
		    	 System.out.println(entey.getValue() + " " + entey.getKey());
		     }
		     
		     for(Map.Entry emty : map.entrySet())
		     {
		    	 
		    	 System.out.println(emty.getKey() + " " + emty.getValue());
		     }
		    		 
 	      
		/*tr.add("12");
		tr.add("ad");
		tr.add("nm");
		tr.add("xc");
		tr.add("za");
		tr.add("lp");
		tr.add("isSN");
		
		   System.out.println(tr.poll());
		   System.out.println(tr.peek());
		   System.out.println(tr.element());
		   System.out.println(tr.remove("za"));
		   System.out.println(tr.contains("c"))*/;
		
		
		
		
	}
}
