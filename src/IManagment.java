/**
 * Created by Lenovo on 14.08.2017.
 */
public interface IManagment {
    void getNewPerson();
    void kickOutPerson();
    void callTheBoard();

    default void closeCompany() {
        System.out.println("Zamknieto firme");
    }
}
