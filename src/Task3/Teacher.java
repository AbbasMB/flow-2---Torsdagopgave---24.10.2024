package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList <String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList <String>();
    }

    @Override
    public boolean addCourse(String course){
        for(String c : canTeach){
            if(course.equals(c)){
                currentCourses.add(course);
                return true;
            }
        }
        return false;
    }
}
