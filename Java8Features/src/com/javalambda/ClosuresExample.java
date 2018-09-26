package com.javalambda;

public class ClosuresExample {

	public static void main(String args[])
	{
		int a=62;
		int b =10;
		doProcess(a,i->System.out.println(i+b));
	}
	public static void doProcess(int i,Process p)
	{
		p.perform(i);
	}
	interface Process
	{
		public void perform(int i);
	}
}
