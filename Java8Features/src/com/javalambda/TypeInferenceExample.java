package com.javalambda;

public class TypeInferenceExample {
	public static void greeting(LambdaTest l)
	{
		System.out.println(l.test("Vandana"));
	}
public static void main(String args[])
{
   TypeInferenceExample.greeting(s->s.length());
	
}
interface LambdaTest
{
	int test(String a);
}
}
