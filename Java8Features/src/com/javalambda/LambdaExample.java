package com.javalambda;

public class LambdaExample {

	public static void main(String args[])
	{
		Test aCheck= ()->System.out.println("Hello");
		MyAdd myAdd=(int a,int b)-> a+b;
		aCheck.check();
		myAdd.add(10,15);
	}
}
interface Test
{
	void check();
}
interface MyAdd
{
	int add(int a,int b);
	}
