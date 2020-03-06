package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();



    private Instructors(){
        Instructor dolio = new Instructor(1010,"dolio");
        Instructor chris = new Instructor(2020,"chris");
        Instructor roberto = new Instructor(3030,"roberto");
        Instructor kris = new Instructor(4040,"kris");
        add(dolio);
        add(chris);
        add(roberto);
        add(kris);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }


    @Override
    public Instructor[] toArray() {
        return getPersonList().toArray(new Instructor[0]);
    }
}
