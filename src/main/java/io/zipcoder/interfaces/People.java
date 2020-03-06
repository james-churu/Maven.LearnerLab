package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class People<E extends Person> implements Iterable<E>{

    ArrayList<E> personList = new ArrayList<E>();


    public void add(E person){
        this.personList.add(person);
    }


    public E findById(long id){
        E personToReturn = null;
        for(E person : personList){
            if(person.getID() == id){
                personToReturn = person;
                break;
            }
        }
        return personToReturn;
    }
    public boolean contains(E person) {
        return personList.contains(person);
    }
    public void remove(E person){
        personList.remove(person);
    }
    public void remove(long id){
        E personToRemove = findById(id);
        personList.remove(personToRemove);
    }
    public void removeAll(){
        personList.clear();
    }
    public Integer count(){
        return personList.size();
    }
    public abstract E[] toArray();

    public ArrayList<E> getPersonList(){
        return this.personList;
    }
    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }

    // Iterator implemented methods

}
