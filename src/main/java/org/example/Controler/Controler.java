package org.example.Controler;

import org.example.Model.StudeGroup;
import org.example.Model.Student;
import org.example.Model.Teacher;
import org.example.Model.User;
import org.example.Service.GropService;
import org.example.Service.UserService;
import org.example.View.StudentView;

import java.util.List;

public class Controler {
    private UserService userService;
    private GropService groupService;
    private StudentView studentView;

    public Controler() {
        this.userService = new UserService();
        this.studentView = new StudentView();
        this.groupService = new GropService();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudeGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.CreateGroup(num, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}