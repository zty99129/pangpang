package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	int age;

	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ":" +age;
	}
}
public class HashSet_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<Person> hs=new HashSet<Person>();
		Person p1=new Person("waa", 18);
		Person p2=new Person("hjv", 17);
		Person p3=new Person("wuh", 20);
		Person p4=new Person("waa", 18);
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		System.out.println(hs);
	}


}
