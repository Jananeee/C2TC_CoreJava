package com.cg.javagenerics;

class Data_Generic<T>{   
	private T obj;

	public Data_Generic(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	@Override
	public String toString() {
		return "Data_Generic [obj=" + obj + "]";
	}
	

}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Data_Generic<Float> obj_Generic = new Data_Generic<Float>(1.0F);
Float out =obj_Generic.getObj();
System.out.println(out);
	}

}
