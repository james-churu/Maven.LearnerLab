package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public final class ZipCodeWilmington{

    private static final ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
    private Students students;


    private ZipCodeWilmington(){
        students = Students.getInstance();
    }
    public static ZipCodeWilmington getInstance(){
        return zipCodeWilmington;
    }

    public void hostLecture(Teacher teacher , double numberOfHours){

        teacher.lecture(students.toArray() , numberOfHours);

    }
    public HashMap<Student , Double> getStudyMap(){

        HashMap<Student , Double> stuToHours = new HashMap<Student, Double>();
        for(Student student : students.toArray()){

            stuToHours.put(student , student.getTotalStudyTime());
        }

        return stuToHours;
    }

}
