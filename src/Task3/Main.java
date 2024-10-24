package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList <Person>();
        persons.add(new Student("Abbas", new ArrayList <> (List.of("Java 1.0"))));
        persons.add(new Student("Thomas", new ArrayList <> ()));
        persons.add(new Teacher("Signe", new ArrayList <> (List.of("Java 1.0"))));
        persons.add(new Teacher("Tine", new ArrayList <> ()));

        for(Person p : persons){
            if(!p.addCourse ("Java 1.0")){
                if(p instanceof Student){
                    System.out.println(p.getName());
                    System.out.println("har allerede bestået dette kursus.");
                }
                if(p instanceof Teacher){
                    System.out.println(p.getName());
                    System.out.println("Kan ikke undervise i dette fag");
                }
            }
        }


    }
}
