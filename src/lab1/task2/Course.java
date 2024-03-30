package lab1.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private String description;
    private List<Student> students = new ArrayList<>();

    public List<Student> filterYear(Integer year){
        List<Student> students1 = new ArrayList<>();
        for(int i=0; i<students.size(); i++){
            if(year.equals(students.get(i).getYear())){
                students1.add(students.get(i));
            }
        }
        return students1;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", students=" + students +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
