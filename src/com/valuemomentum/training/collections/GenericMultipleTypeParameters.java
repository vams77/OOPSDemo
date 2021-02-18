package com.valuemomentum.training.collections;

public class GenericMultipleTypeParameters {class Employee10
{
	private String name;

	public Employee10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

interface pair<K,V>
{
	public K getKey();
	public V getValue();
}

class OrderedPair<K,V> implements pair<K,V>
{
  private K key;
  private V value;
  
	public OrderedPair(K key, V value) {
	super();
	this.key = key;
	this.value = value;
}

	@Override
	public K getKey() {
				return key;
	}

	@Override
	public V getValue() {
				return value;
	}
	
}

	public static void main(String[] args) {
		
	
		
		

	}

}
