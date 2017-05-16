package com.dajung.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {

		int array[] = new int [6];

		try{
		array[0] = 5;
		array[5] = 10;
		array[6] = 11;

		int x = 1/0;

		String s = "137";
		int a = Integer.parseInt(s);

		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();  // 새로운 스레드를 생성해서 에러를 출력

		}catch(ArithmeticException e){  // 산술에러 int x =1/0에러 표시
			e.printStackTrace();

		}finally{
			System.out.println("다섯번째 값은=" +array[5]);
		}
		System.out.println("시스템이 완료되었습니다.");
	}

}
