package com.example.workingwithcollection;

import com.example.workingwithcollection.model.Address;
import com.example.workingwithcollection.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WorkingWithCollectionApplication {

	public static void main(String[] args) {
		Address address1 = new Address("X1" , "Y1" , "Iran");
		Address address2 = new Address("X2" , "Y2" , "Iran");
		Address address3 = new Address("X3" , "Y3" , "Iran");
		Person person1 = new Person("P1" , "p2", 23 , address1);
		Person person2 = new Person("P2" , "p3", 24 , address2);
		Person person3 = new Person("P3" , "p4", 25 , address3);

		List<Person> persons = new ArrayList();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);


		Person person4 = new Person("P3" , "p4", 25 , address3);
		persons.contains(person4);

		int index = persons.indexOf(person4);
		System.out.println(index);

		System.out.println("Binary Search for P1 : "+ Collections.binarySearch(persons , person1));


		Collections.sort(persons , new SortByStreet());
	}

}
