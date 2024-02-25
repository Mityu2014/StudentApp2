/**
 * Класс описывающий методы выполняемые с экземплярами и списком экземпляров класса Teacher
 * В расках данного класса под экземпляром представлен Преподаватель
 */
package services;

import domen.PersonComparator;
import domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher>{
    private int count; // счетчик
    private List<Teacher> teacherList; // список экземпляров класса

    /**
     * Конструктор класса
     */
    public TeacherService() {
        this.teacherList = new ArrayList<Teacher>();
    }

    /**
     * Метод вывода отсортированных экземпляров класса Teacher
     * @param teachList список экземпляров класса Teacher
     * @param <V> экземпляр класса
     */
    public static <V extends Teacher> void sortByFIO(List <V> teachList){
        PersonComparator<V> comparator = new PersonComparator<V>();
        teachList.sort(comparator);
        System.out.println(teachList);
    }

    /**
     * Метод возвращающий список экземпляров класса Teacher
     * @return Список экземпляров
     */
    @Override
    public List<Teacher> getAll() {
        return this.teacherList;
    }

    /**
     * Метод добавления экземпляра в список
     * @param name Имя экземпляра
     * @param age Возраст экземпляра
     */
    @Override
    public void create(String name, int age) {
        Teacher newTeacher = new Teacher(name,age,"degree");
        this.teacherList.add(newTeacher);
        this.count++;
    }
}