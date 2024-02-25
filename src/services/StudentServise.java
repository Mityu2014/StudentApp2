package services;

import domen.PersonComparator;
import domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServise implements iPersonService<Student> {
    private int count;
    private List<Student> studentList;

    public StudentServise() {
        this.studentList = new ArrayList<Student>();
    }
    private void sortByFIO(){
        PersonComparator<Student> comparator = new PersonComparator<Student>();
        this.studentList.sort(comparator);
    }
    @Override
    public List<Student> getAll() {
        return this.studentList;
    }

    @Override
    public void create(String name, int age) {
        Student newStudent = new Student(name,age);
        this.studentList.add(newStudent);
        this.count++;
    }
}
