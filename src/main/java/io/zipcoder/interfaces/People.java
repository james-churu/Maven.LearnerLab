package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable<Person> {

    ArrayList<Person> personList = new ArrayList<Person>();


    public void add(Person person){
        this.personList.add(person);
    }
    public Person findById(long id){
        Person personToReturn = null;
        for(Person person : personList){
            if(person.getID() == id){
                personToReturn = person;
                break;
            }
        }
        return personToReturn;
    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(long id){
        Person personToRemove = findById(id);
        personList.remove(personToRemove);
    }
    public void removeAll(){
        personList.clear();
    }
    public Integer count(){
        return personList.size();
    }
    public Person[] toArray(){

        Person[] personArray = new Person[personList.size()];
        Integer index  = 0;
        for(Person element : personList){
            personArray[index] = element;
            index++;
        }
        return personArray;

    }

    public Iterator<Person> iterator() {
        return null;
    }

    // Iterator implemented methods

}
