package com.java;

public class Method_overridingB extends Method_overridingA{


	@Override
	public void studentName(String Name) {
		
		super.studentName(Name);
	}
	
	@Override
	public void studentName(long id) {
		
		super.studentName(id);
	}
	
	public static void main(String[] args) {
		
		Method_overridingB m = new Method_overridingB();
		m.studentName("boomu");
		m.studentName(7601866);
	}
}
