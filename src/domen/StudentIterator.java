/**
 * Класс осуществляющий перебор студентов в группе
 */
package domen;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private  int counter = 0; //Счетчик
    private List<Student> students; // Группа студентов

    /**
     * Конструктор класса со всеми полями
     * @param students принимает лист из студентов группы
     */
    public StudentIterator(List<Student> students) {
        this.students = students;
    }
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }
    @Override
    public Student next() {
        return students.get(counter++);
    }
}