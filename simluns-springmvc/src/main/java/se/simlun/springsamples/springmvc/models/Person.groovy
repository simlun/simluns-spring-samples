package se.simlun.springsamples.springmvc.models

public class Person {
	String name
	int age

	public Person(name, age) {
		this.name = name
		this.age = age
	}

	public String toString() {
		"${name} is ${age} years old"
	}
}