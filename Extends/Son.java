package com.dajung.java.exdend.obj;

public class Son extends Father{  //extends로 인해 아빠의 데이터 상속 받음

	public String wife;
	public String girlfriend;


	public void progress9 (int aaa){ // 아빠 함수와 똑같은 명의 함수 생성 가능. 단, 인자의 타입이나 개수가 달라야함
	// 오버로딩
	}


	@Override   // 자동 생성해 줌 이클립스기준 (오른쪽 버튼 소스 > 오버라이드)
	public void goDestination() {
		super.progress9();  ///아빠꺼
		progress9(); // 내꺼

		//System.out.println("pc방을 갑니다.");
		//super.goDestination();  // 상속관계의 동일한 메소드일 경우 부모의 것을 호출
	}




//	@Override
//	public void goDestination(){
//		System.out.println("pc방을 갑니다.");
//	}


}
