package com.example.bean;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("Hello, "+ this.name);
	}
}
