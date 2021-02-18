package com.valuemomentum.training.collections;

class Sample<T>
{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}


public class GenericClassDemo {

	public static void main(String[] args) {
		Sample<Integer> s1 = new Sample<Integer>();
		s1.setData(15);
		System.out.println("Display from generic class"  +s1.getData());
		
		Sample<String> s2 = new Sample<String>();
		s2.setData("Java Generics");
		System.out.println(" Display from generic class of type String " +s2.getData());
		
		Sample<Float> s3 = new Sample<Float>();
		s3.setData(1.35f);
		System.out.println(+s1.getData());
		

	}

}
