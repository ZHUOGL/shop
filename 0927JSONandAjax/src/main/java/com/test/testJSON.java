package com.test;

import com.entity.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testJSON {
    @Test
    public void testJSON() {
        Person person = new Person(110, 18, "张三", 'M');
        Gson gson = new Gson();
        String personToJSON = gson.toJson(person);
        System.out.println(personToJSON);
        Person p = gson.fromJson(personToJSON, Person.class);
        System.out.println(p.toString());
    }
    @Test
    public void testList() {
        List<Person> people = new ArrayList<Person>();
        Person person = new Person(110, 18, "张三", 'M');
        Person person2 = new Person(2, 22, "Tom", 'M');
        people.add(person);
        people.add(person2);
        Gson gson = new Gson();
        String peopleListToJSON = gson.toJson(people);
        System.out.println(peopleListToJSON);
        List<Person> list = gson.fromJson(peopleListToJSON, new TypeToken<List<Person>>() {
        }.getType());
        System.out.println(list);
    }
}
