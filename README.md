#### 상속 Extends

- 부모 클래스를 extends로 상속받아 자식 클래스에서 내 것처럼 사용할 수 있음.
- 부모 클래스(parent)와 자식 클래스(child)는 자바 지정예약어 extends에 의하여 상속 가능.
- 접근 제한자가 없을경우 같은 상속에 있을때만 상속 가능.
=> 상속은 public 해줘야 함.
- 상속은 단순히 메모리를 확장하는 것.
- 여러개의 상속은 불가능.
- 자식 클래스는 부모 클래스로부터 받은 정보를 모두 사용 가능.
- 상속을 하고싶지 않을 경우 부모 클래스의 접근 제한자를 private로 지정하면 됨.
- 부모 클래스가 상속 받은 것도 자식 클래스가 사용 가능.

```java
// 부모 클래스
public class Father {

	public String lastName;
	public String name;
	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;  // 상속을 안할경우 private

}

// 자식 클래스
public class Son extends Father{  
  //extends로 인해 아빠의 데이터 상속 받음

//// 아빠 클래스의 정보들은 보이지 않아도 이미 다 들어와 있음 ////

	public String girlfriend; // 아빠 클래스 외의 또다른 정보를 추가

  ```


#### 오버라이딩

- 상위 클래스가 가지고있는 메소드를 하위 클래스가 재정의해서 사용

```java
// 부모 클래스
public void goDestination(){
  System.out.println("회사를 갑니다.");
}

// 자식 클래스에서의 사용
	@Override
	public void goDestination(){
		System.out.println("pc방을 갑니다.");
	}

```
이때 Main에서

```java
Son son = new Son();
super.goDestination();  
// 상속관계의 동일한 메소드일 경우 부모의 것을 호출
```
할 경우 자식의 "pc방을 갑니다"가 호출 됨.


#### 오버로딩

- 같은 이름의 메소드를 여러개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술

```java
public void progress9 (int aaa){
  // 아빠 함수와 똑같은 명의 함수 생성 가능.
  //단, 인자의 타입이나 개수가 달라야함
	}
````
#### 인터페이스
