package com.dajung.java.polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		Father son = new Son();  // 상속받은 상태에서는 부모타입으로 써줘도 됨
		// 부모 타입으로 바꿔주는 이유: 선택지를 줄여줌 ( 부모 속성만 불러오기 때문)
		son.setName("홍길동");
		System.out.println(son.getName());

		Father daughter = new Daughter();


//		son.goScool();  // 타입을 부모로 바꾸면 son에 있는 정보는 불러오지 못 함



	}

}
