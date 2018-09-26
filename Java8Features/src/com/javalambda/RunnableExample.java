package com.javalambda;

public class RunnableExample {
	public static void main(String args[])
	{
		Thread myLambda= new Thread(()->System.out.println("Vandana"));
		myLambda.run();
	}
	
}
