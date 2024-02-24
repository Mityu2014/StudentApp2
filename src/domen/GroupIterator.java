/**
 * Класс осуществляющий перебор групп студентов в потоке
 */
package domen;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup> {

    private  int counter = 0; // Счетчик
    private List<StudentGroup> groups; // Поток групп

    /**
     * Конструктор класса
     * @param groups принимает лист групп входящий в поток
     */
    public GroupIterator(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /**
     * Метод проверяющий наличие следующего студента в группе
     * @return Истину или ложь в зависимости от наличия следующего студента в группе
     */
    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }

    /**
     * Метод возращающий текущего студента в момент перебора
     * @return Текущий студент
     */
    @Override
    public StudentGroup next() {
        return groups.get(counter++);
    }
}
