package com.core.spring_core.constructorinjection.ambiguity;

public class Addition {
	
	Addition(double a,double b){
		System.out.println("inside double"+ (a+b));
	}
	
	Addition(int a,int b){
		System.out.println("inside int"+ (a+b));
	}

	

}
