package com.coding.basic;

public interface List {
	
	
	public void add(Object o);
	
	public void add(int index, Object o);
	
	public Object get(int index);
	
	public Object remove(int index);
	
	public Iterator iterator();
	
	public String toString();
	
	public int size();
}
