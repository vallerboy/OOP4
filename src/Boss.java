/**
 * Created by Lenovo on 14.08.2017.
 */
public class Boss extends Employee {
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
}
