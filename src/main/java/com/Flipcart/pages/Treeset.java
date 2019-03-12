package com.Flipcart.pages;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class Treeset {

	
	public WebDriver driver ;
	@Test
	public void set()
	{
	TreeSet<String> set = new TreeSet<String>();
	{
	set.add("a");
	set.add("v");
	set.add("d");
	set.add("s");
	set.add("q");
	System.out.println("1st :"+set.pollFirst());
	System.out.println(set.size());
	System.out.println("2st :"+set.pollLast());
	System.out.println(set.first());
	
	
	
	

	
	    Iterator<String>itr    =set.descendingIterator();
	    while(itr.hasNext())
	    {
	    	
	    	System.out.println(itr.next());
	    }
	
	for(String sort : set)
	{
		
		
		System.out.println(sort);
	}
	
	System.out.println(set.descendingSet());
	
	}
	
	}
	private void withTimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}
}
