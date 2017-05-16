package com.dajung.java.polymorphism;

public class Son extends Father {

	public void goScool(){
		System.out.println("학교에 갑니다");
	}

	@Override
	public void setName(String name) {
		super.setName("s"+ name);   // 부모꺼 상속
	}
}
