package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;


    public Student(long id, String newName) {
        super(id, newName);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;

    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
