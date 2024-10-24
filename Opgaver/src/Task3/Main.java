package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();


        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Math A");
        Student student1 = new Student("Mads", passedCourses1);
        persons.add(student1);

        ArrayList<String> passedCourses2 = new ArrayList<>();
        Student student2 = new Student("Kreiner", passedCourses2);
        persons.add(student2);

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Java 1.0");
        Teacher teacher1 = new Teacher("Ms. Jackson", canTeach1);
        persons.add(teacher1);

        ArrayList<String> canTeach2 = new ArrayList<>();
        Teacher teacher2 = new Teacher("Mrs. Johnson", new ArrayList<>());
        persons.add(teacher2);

        for (Person person : persons) {
            boolean result = person.addCourse("Java 1.0");
            if (!result) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
