package com.dajung.java.polymorphism;

public class Father {
	public String name;
	private int age;

	public String getName() {  // 우클릭 > 소스 > 제너레이트 게서세터.... 자동 생성
		return name;
	}
	public void setName(String name) {
		this.name = "f"+ name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;  // this는 상속받지 않아도 쓸 수 있음
	}


}
