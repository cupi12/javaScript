package com.yedam.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(98));
		scores.add(new Integer(87));
		scores.add(new Integer(75));
		scores.add(new Integer(80));

		for (Integer score : scores) {
			System.out.println(score);
		}
		System.out.println("================");
		NavigableSet<Integer> nSet = scores.descendingSet(); // 역순으로 정렬하는 set
		for (Integer score : nSet) {
			System.out.println(score);
		}
		System.out.println("================");
		// TreeSet은 크다 작다는 기준이 있는데, Person클래스 필드는 비교할 대상이 없음.
		// Person 클래스에서 implements Comparable 한 후, unimplements 해줘야함.
		TreeSet<Person> persons = new TreeSet<>();
		persons.add(new Person("Hong", 39));
		persons.add(new Person("Choi", 28));
		persons.add(new Person("Park", 88));
		for (Person person : persons) {
			System.out.println("이름은 " + person.getName() + " 나이는 : " + person.getAge());
		}
		System.out.println("================");
		TreeSet<Fruit> fruits = new TreeSet<>(new FruitComparator());
		fruits.add(new Fruit("딸기", 1000));
		fruits.add(new Fruit("수박", 2000));
		fruits.add(new Fruit("사과", 1500));
		for(Fruit fruit : fruits) {
			System.out.println(fruit.getName() + " , " + fruit.getPrice());
		}

	}// End Of Main
}// End Of Class
