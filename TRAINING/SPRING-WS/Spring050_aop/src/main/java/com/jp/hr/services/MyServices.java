package com.jp.hr.services;

public class MyServices {
	
	// Join Points
	public void abcMethod1() {
		System.out.println("\tIn abcMethod1 ()");
	}
	
	// Join Points
	public void abcMethod2(int x) {
		System.out.println("\tIn abcMethod2 (int x)");
	}
	
	// Join Points
	public void abcMethod3 (int x, int y) {
		System.out.println("\tIn abcMethod3 (int x, int y)");
	}
}
