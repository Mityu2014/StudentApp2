/**
 * Класс описывающий создание группы студентов с уникальными полями
 */
package domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private int idStudentGroup; //ID группы
    private List<Student> studentList; //Список студентов входящий в группу

    /**
     * Конструктор класса со всеми полями
     * @param idStudentGroup ID группы
     * @param studentList Список студентов входящий в группу
     */
    public StudentGroup(int idStudentGroup, List<Student> studentList) {
        this.idStudentGroup = idStudentGroup;
        this.studentList = studentList;
    }

    /**
     * Метод для получения ID группы
     * @return ID группы
     */
    public int getIdStudentGroup() {
        return idStudentGroup;
    }

    /**
     * Метод для изменения ID группы
     * @param idStudentGroup новый ID группы
     */
    public void setIdStudentGroup(int idStudentGroup) {
        this.idStudentGroup = idStudentGroup;
    }

    /**
     * Метод получения списока студентов входящий в группу
     * @return Список студентов входящий в группу
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Метод для изменения списока студентов входящий в группу
     * @param studentList Список студентов входящий в группу
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * Метод для получения данных о группе
     * @return ID группы и количество студентов в группе
     */
    @Override
    public String toString() {
        return "StudentGroup{" +
                "idStudentGroup=" + idStudentGroup +
                ", Size group=" + this.getStudentList().size() + ", ";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }


    @Override
    public int compareTo(StudentGroup o) {
        if (this.getStudentList().size() > o.getStudentList().size()) {
            return 1;
        }else if (this.getStudentList().size() < o.getStudentList().size()) {
            return -1;
        }else if (this.getIdStudentGroup() > o.getIdStudentGroup()) {
            return 1;
        }else if (this.getIdStudentGroup() < o.getIdStudentGroup()) {
            return -1;
        }else
            return 0;
    }
}
