/**
 * Created by Lenovo on 14.08.2017.
 */
public class Boss extends Employee implements IManagment {
    public Boss(String name, int salary) {
        super(name, salary);
    }

    @Override
    protected void makeVoice() {
        System.out.println("DOOOOOOOOOOO PRACY !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public void kickOut(String who){
        System.out.println("Zwolniłem: " + who + ", bo nie pracował!");
    }

    @Override
    public void getNewPerson() {
        System.out.println("Zrekrutowalem osobe, bo mam solidne plecy w firmach");
    }

    @Override
    public void kickOutPerson() {
        System.out.println("Wyrzucilem osobe bo narazila firme na starty i jej nie lubialem");;
    }

    @Override
    public void callTheBoard() {
        System.out.println("Nie obchodzi mnie ze macie wakacje, jutro punkt 10 w firmie");
    }
}
