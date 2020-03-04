package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor tempTeach = new Instructor(1234, "tempStu");
        Assert.assertTrue(tempTeach instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor tempTeach = new Instructor(1234, "tempStu");
        Assert.assertTrue(tempTeach instanceof Person);
    }

    @Test
    public void testTeach(){
        Student tempStu = new Student(1234,"tempStu");
        Instructor teacher = new Instructor(1234, "tempStu");
        teacher.teach(tempStu , 15);

        Assert.assertEquals(15.0f, tempStu.getTotalStudyTime(), 1e-8);
    }
    @Test
    public void testLecture(){
        Student stu1 = new Student(1111,"stu1");
        Student stu2 = new Student(1111,"stu2");
        Student stu3 = new Student(1111,"stu3");
        Student stu4 = new Student(1111,"stu4");

        Student[] students = {stu1,stu2,stu3,stu4};
        Instructor teacher = new Instructor(1234, "Teacher");

        teacher.lecture(students , 100);

        Assert.assertEquals(25.0f, stu1.getTotalStudyTime(), 1e-8);
        Assert.assertEquals(25.0f, stu2.getTotalStudyTime(), 1e-8);
        Assert.assertEquals(25.0f, stu3.getTotalStudyTime(), 1e-8);
        Assert.assertEquals(25.0f, stu4.getTotalStudyTime(), 1e-8);
    }
}
