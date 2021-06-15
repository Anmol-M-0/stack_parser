package com.app.stackWalker;

public class Main {
	public static void main(String[] args) {
		StackParser sp = new StackParser();
		
		System.out.println(sp.getStackCount());
		System.out.println(sp.getStack());
		
		
	}

}
