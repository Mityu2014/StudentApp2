/**
 * @author Dmitriy
 * @version 2.0
 */

import domen.Student;
import domen.StudentGroup;
import domen.StudentSteam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>(); // Создание групп студентов
        List<Student> students2 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        Student student6 = new Student("Oleg", 19);
        Student student1 = new Student("Ivan", 20);
        Student student2 = new Student("Anna", 19);
        Student student3 = new Student("Vova", 24);
        Student student4 = new Student("Sergei", 19);
        Student student5 = new Student("Dima", 22);
        Student student7 = new Student("Dasha", 22);
        Student student8 = new Student("Olga", 23);
        students1.add(student6);
        students2.add(student1);
        students3.add(student2);
        students1.add(student3);
        students1.add(student4);
        students3.add(student5);
        students3.add(student7);
        students3.add(student8);
        StudentGroup studentGroup1 = new StudentGroup(1, students1);
        StudentGroup studentGroup2 = new StudentGroup(2, students2);
        StudentGroup studentGroup3 = new StudentGroup(3, students3);
        List<StudentGroup> groups = new ArrayList<>(); // Создание потоков из групп
        groups.add(studentGroup1);
        groups.add(studentGroup2);
        groups.add(studentGroup3);
        StudentSteam studentSteam = new StudentSteam(1, groups);
        //Вывод групп студентов
        for (StudentGroup studentGroup : studentSteam) {
            for (Student student : studentGroup) {
                System.out.print(studentGroup);
                System.out.println(student);
            }
        }
        System.out.println("_____________");
        //Вывод потоков
        Collections.sort(studentSteam.getSteamList()); //Сортировка потока по количеству студентов в группе и идентификатору группы
        for (StudentGroup studentGroup : studentSteam) {
            Collections.sort(studentGroup.getStudentList()); //Сортировка группы по возросту и ID студента
            for (Student student : studentGroup) {
                System.out.print(studentSteam);
                System.out.print(studentGroup);
                System.out.println(student);
            }
        }
    }
}