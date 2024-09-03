package com.example.workingwithcollection;

import com.example.workingwithcollection.model.Address;
import com.example.workingwithcollection.model.Person;

import java.util.Comparator;

public class SortByStreet implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAddress().getStreet().compareTo(p2.getAddress().getStreet());
    }
}
