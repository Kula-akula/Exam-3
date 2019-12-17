package com.company.Task_2;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Objects;

public class Task_2 {
  static LinkedList<Person> list = new LinkedList<>();

    public static void main(String[] args) {
        Person person=new Person("Ivanov","Petya","Valentinvich");
//        try {
//           list.add(person);
//
//
//        }
    }
//    public static void addList(Person person){
//    if (person instanceof list){
//
//    }
//    }
}
class Person{
    private String LastName;
    private String FirstName;
    private String FatherName;

    public Person() {
    }

    public Person(String lastName, String firstName, String fatherName) {
        LastName = lastName;
        FirstName = firstName;
        FatherName = fatherName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return LastName.equals(person.LastName) &&
                FirstName.equals(person.FirstName) &&
                FatherName.equals(person.FatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LastName, FirstName, FatherName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", FatherName='" + FatherName + '\'' +
                '}';
    }
}