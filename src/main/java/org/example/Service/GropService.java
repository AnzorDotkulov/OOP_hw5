package org.example.Service;
import java.util.ArrayList;
import org.example.Model.StudeGroup;
import org.example.Model.Student;
import org.example.Model.Teacher;

public class GropService {

    public StudeGroup CreateGroup(Integer num, Teacher teacher, Student... students) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        return new StudeGroup(num, teacher, listStudents);
    }
}