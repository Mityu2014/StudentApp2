/**
 * Класс описывающий создание студента с уникальными полями
 */
package domen;
public class Student extends Person implements Comparable<Student>{
private int id; //ID студента
private static int idGenerator; /**{@value} Статичное поле генерирующее уникальные ID */
    /**
     * Конструктор класса со всеми полями
     * @param name Имя
     * @param age Возраст
     */
    public Student(String name, int age) {
        super(name, age);
        idGenerator ++;
        this.id = idGenerator;
    }

    /**
     * Метод для получения ID
     * @return ID студента
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для получения информации об экземпляте класса
     * @return ID, имя и возраст студента
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +", name " +super.getName() + ", age " + super.getAge() +
                '}';
    }

    /**
     * Метод сравнивает текущий объект с указанным объектом для упорядочения.
     * @param o the object to be compared.
     * @return отрицательное целое число, ноль или положительное целое число,
     * поскольку этот объект меньше, равен или больше указанного объекта.
     */
    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()){
            return 1;
        }else if (this.getAge() < o.getAge()){
            return -1;
        }else if (this.getId() > o.getId()) {
            return 1;
        }else if (this.getId() < o.getId()) {
            return -1;
        }else
            return 0;
        }
}
