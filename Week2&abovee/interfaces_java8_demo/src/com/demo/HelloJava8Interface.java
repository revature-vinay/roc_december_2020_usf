package com.demo;

public interface HelloJava8Interface {

	
	public static void hiStatic() {
		System.out.println("Hello from static method within a Interface from Java8 and above");
	}
	
	default void hiDefault() {
		System.out.println("Hi From default methods from Java 8 and above");
	}
}
