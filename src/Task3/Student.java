package Task3;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList <String> passedCourses;
    private ArrayList <String> currentCourses;

    public Student(String name, ArrayList <String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList <String>();
    }
    @Override
    public boolean addCourse(String course){
        for(String c : passedCourses){
            if(course.equals(c)){
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }
}
