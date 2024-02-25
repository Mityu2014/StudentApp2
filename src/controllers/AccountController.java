/**
 * Класс описывающий контрольные статические методы
 */
package controllers;

import domen.Person;
import domen.WorkingPerson;

import java.util.List;
public class AccountController {
    /**
     * Статический метод возвращающий данные о зарплате
     * @param person передаваемый экземпляр отсящийся к классу WorkingPerson
     * @param salary Размер ЗП
     * @param <T> передаваемый экземпляр отсящийся к классу WorkingPerson
     * @param <V> Размер ЗП
     */
    public static <T extends WorkingPerson,V> void paySalery(T person, V salary){
        System.out.println(person.getName() + " выплаченная зарплата: " + salary);
    }

    /**
     * Статический метод возвращающий данные о среднем возрасте
     * @param list Передаваемый список из экземпляров одного из подкласса Person
     * @param <T> передаваемый экземпляр отсящийся к классу Person
     */
    public static <T extends Person> void averageAge(List<T> list){
        double sum = 0;
        for (T o : list) {
            sum = sum + o.getAge();
        }
        System.out.println("Средний возраст " + sum/list.size());
    }
}
