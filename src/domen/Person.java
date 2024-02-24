/**
 * Абстрактный класс, описывающий стандартные поля всех взаимодействующих людей с ВУЗом
 */
package domen;
public abstract class Person {
    private String name;// Имя человека
    private int age; // Возраст человека

    /**
     * Конструктор класса со всеми полями
     * @param name Имя
     * @param age Возраст
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод для получения имени человека
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для изменения имени
     * @param name Измененное имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод для получения возраста человека
     * @return возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для изменения возраста
     * @param age измененный возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Метод вывода на экран
     * @return данные об имени и возрасте человека
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
