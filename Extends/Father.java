package com.dajung.java.exdend.obj;

public class Father extends Fix implements Cook{

	public String lastName;
	public String name;

	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;  // 상속을 안할경우 private

	public void progress9(){
		// 코드 9줄

	}
	public void goDestination(){

		progress9();

		System.out.println("9줄 코드");
	}
	@Override
	public void boil() {
		// TODO Auto-generated method stub

	}
	@Override
	public void gril() {
		// TODO Auto-generated method stub

	}
	@Override
	public void fry() {
		// TODO Auto-generated method stub

	}
	@Override
	public void steam() {
		// TODO Auto-generated method stub

	}
	@Override
	public void disassemble() {
		System.out.println("분해 하였습니다.");

	}
	@Override
	public void replacePart() {
		System.out.println("교체 하였습니다.");

	}
	@Override
	public void clean() {
		System.out.println("청소 하였습니다.");

	}
	@Override
	public void assemble() {
		System.out.println("조립 하였습니다.");

	}

}
