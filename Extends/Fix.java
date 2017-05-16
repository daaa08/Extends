package com.dajung.java.exdend.obj;

public abstract class Fix {
	// 추상 클래스의 특징
	// 인터페이스와 동일하지만 인터페이스에 코드를 추가 가

	public void process9(){  // 로직이 구상될 때 abstract를 사
		disassemble();
		for(int i = 0; i<3; i++){
			replacePart();  // 항상 세번씩 교체
		}
		replacePart();
		clean();
		assemble();
		runLogic();
	}

	private void runLogic(){
		// 이 로직은 바뀌면 안되고 내부적으로만 써야됨..
	}

	public abstract void disassemble(); // 분해 // {} 생략 가능

	public abstract void replacePart();   // 교체

	public abstract void clean(); // 청소

	public abstract void assemble();  // 조립

}
