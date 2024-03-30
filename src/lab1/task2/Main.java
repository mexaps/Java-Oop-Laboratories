package lab1.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        course.setTitle("analiza matematica");
        course.setDescription("teroare pura");
        course.getStudents().add(student1);
        course.getStudents().add(student2);
        course.getStudents().add(student3);
        student1.setName("Alex");
        student2.setName("Andrei");
        student3.setName("Rares");
        student1.setYear(2001);
        student2.setYear(2003);
        student3.setYear(2003);
        List<Student> students = course.filterYear(2003);
        for (int i = 0; i < students.size(); ++i) {
            System.out.println(students.get(i));
        }
        System.out.println(course);
    }
}
