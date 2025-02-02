package ch06;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JFrame;

class Person extends Object {
	String name;
	int age;
	
	public Person(String name, int age) {
		super(); // Object 객체를 생성
		this.name = name;
		this.age = age;
	}
	
	void displqyInfo() {
		System.out.println(name + age);
	}
}

class Employee extends Person{
	String department;
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	@Override
	void displqyInfo() {
		super.displqyInfo(); // 부모의 메소드 사용
		System.out.println(department);
	}
}


public class ConstructorEx4{

	public static void main(String[] args) {
		Person pr = new Person("홍길동", 20);
		Employee em = new Employee("홍길동", 20, "개발자");
		em.displqyInfo();
	}

}
