package com.java.AbstractDemo;

public class AbstractDemo {

	public static void main(String[] args) {
		Ape a = new Ape();
		
	}

}
interface Vehicle{
	void engineType();
	void runsOn();
    void auto();
}

abstract class Simple implements Vehicle{
	abstract void car();
	abstract void bus();
	public abstract void auto();
	void wheels(){
		System.out.println(4);
	}
	
}
abstract class Honda extends Simple{
	
	void car() {
		System.out.println("This is Honda car");
	}
	
}
abstract class Hitech extends Honda{
	void bus() {
		System.out.println("This is Hitech Bus");
	}
	
}
class Ape extends Hitech{
	 public void auto(){
		System.out.println("This is Ape auto");
	}

	@Override
	public void engineType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runsOn() {
		// TODO Auto-generated method stub
		
	}

}