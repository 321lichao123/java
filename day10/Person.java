
package com.baidu;
public class Person {
	String name;
	int age;
	
	public Person(){}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
