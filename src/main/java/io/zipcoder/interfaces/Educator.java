package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO(new Instructor(1010,"dolio")),
    CHRIS(new Instructor(2020, "chris")),
    ROBERTO(new Instructor(3030,"roberto")),
    KRIS(new Instructor(4040,"kris"))
    ;

    final private Instructor instructor;
    double timeWorked;
    Educator(Instructor instructor){
        this.instructor = instructor;
        timeWorked =0;
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked += numberOfHours;
        instructor.teach(learner , numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.timeWorked += numberOfHours;
        instructor.lecture(learners , numberOfHours);
    }

}
