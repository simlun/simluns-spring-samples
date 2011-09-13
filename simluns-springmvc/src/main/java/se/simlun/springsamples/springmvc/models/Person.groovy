package se.simlun.springsamples.springmvc.models

class Person {
	String name
	int age

	Person(name, age) {
		this.name = name
		this.age = age
	}

	String toString() {
		"${name} is ${age} years old"
	}
}