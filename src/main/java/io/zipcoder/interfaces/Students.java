package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People<Student>{


    private static final Students INSTANCE = new  Students();



    private Students(){
        Student jimmy =  new Student(1111,"jimmy");
        Student james =  new Student(2222,"james");
        Student churu =  new Student(3333,"churu");
        Student king =  new Student(4444,"king");

        add(jimmy);
        add(james);
        add(churu);
        add(king);
    }
    public static Students getInstance(){
       return INSTANCE;
    }



    @Override
    public Student[] toArray() {
        return getPersonList().toArray(new Student[0]);
    }


}
