package io.zipcoder.interfaces;

public class Person {
    final long id;
    String name;

    public Person(long id, String newName){
        this.id = id;
        this.name = newName;
    }
    public long getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newname){
        this.name = newname;
    }
}
