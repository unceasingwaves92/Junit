package com.ubuntu.demos;

public class Calculator {
	
	public Calculator() {
		
	}
	public double add(int a,int b) {
		
		if(a==100) {
			b=b+10;
			
		}else if(a==200) {
			b=b+20;
		}
		return a+b;
	}
	public double sub(int a,int b) {
		return a-b;
	}
	
	public double multiply(int a, int b) {
		return a*b;
	}

}
