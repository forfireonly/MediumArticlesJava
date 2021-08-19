package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<SchoolSubject> schedule = new ArrayList<>();
        schedule.add(new SchoolSubject("math", true,true));
        schedule.add(new SchoolSubject("reading", true, true));
        schedule.add(new SchoolSubject("choir",false,false));
        //print(schedule, new HomeworkChecker());
        //print(schedule,subject -> subject.homeworkIsExpected());
        print(schedule,(SchoolSubject subject) -> {return subject.homeworkIsExpected();});
        // System.out.println();
        // print(schedule,subject -> subject.suppliesAreNeeded());



        //print(schedule,subject -> !subject.homeworkIsExpected());
        System.out.println();
        //print(schedule,subject -> !subject.suppliesAreNeeded());
    }

    static void print(List<SchoolSubject> schedule, CheckSubject checker) {
        for (SchoolSubject subject : schedule) {
            if (checker.check(subject)) {
                System.out.println(subject);
            }
        }

    }
}


class SchoolSubject {

    //instance variabls
    private String subjectName;
    private boolean supplies;
    private boolean expectHomework;

    //constructor, sets instance variables
    public SchoolSubject (String subjectName, boolean supplies, boolean expectHomework) {
        this.subjectName = subjectName;
        this.supplies = supplies;
        this.expectHomework = expectHomework;
    }

    public boolean suppliesAreNeeded() {
        return this.supplies;
    }

    public boolean homeworkIsExpected() {
        return this.expectHomework;
    }
    public String toString() {
        return this.subjectName;
    }
}

interface CheckSubject{
    boolean check(SchoolSubject subject);
}

class HomeworkChecker implements CheckSubject{

    @Override
    public boolean check(SchoolSubject subject) {
        return subject.homeworkIsExpected() ;
    }
}