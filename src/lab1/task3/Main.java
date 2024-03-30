package lab1.task3;

import lab1.task2.Course;
import lab1.task2.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       Student student1= new Student();
       Student student2= new Student();
       student1.setName("Alex");
       student2.setName("Alex");
       student1.setYear(2001);
       student2.setYear(2001);
       System.out.println(student1.equals(student2));
    }
}
