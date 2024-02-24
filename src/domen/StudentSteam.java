/**
 * Класс описывающий потоки с уникальными полями
 */
package domen;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private int idStudentSteam; //ID потока
    private List<StudentGroup> steamList; // Список групп входящих в поток

    /**
     * Конструктор класса со всеми полями
     * @param idStudentSteam ID потока
     * @param steamList Список групп входящих в поток
     */
    public StudentSteam(int idStudentSteam, List<StudentGroup> steamList) {
        this.idStudentSteam = idStudentSteam;
        this.steamList = steamList;
    }

    /**
     * Метод для получения ID потока
     * @return ID потока
     */
    public int getIdStudentSteam() {
        return idStudentSteam;
    }

    /**
     * Метод для изменения ID потока
     * @param idStudentSteam новый ID потока
     */
    public void setIdStudentSteam(int idStudentSteam) {
        this.idStudentSteam = idStudentSteam;
    }

    /**
     * Метод получения списока групп входящих в поток
     * @return Список групп
     */
    public List<StudentGroup> getSteamList() {
        return steamList;
    }

    /**
     * Метод для изменения списока групп входящих в поток
     * @param steamList список групп
     */
    public void setSteamList(List<StudentGroup> steamList) {
        this.steamList = steamList;
    }

    /**
     * Метод для получения данных о потоке
     * @return ID потока
     */
    @Override
    public String toString() {
        return "StudentSteam" + "idStudentSteam=" + idStudentSteam + ", ";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(steamList);
    }
}
