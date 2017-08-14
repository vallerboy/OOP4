/**
 * Created by Lenovo on 14.08.2017.
 */
public class Worker extends Employee {

    private int hourCount;


    public Worker(String name, int salary, int hourCount) {
        super(name, salary);
        this.hourCount = hourCount;
    }


    public int getHourCount() {
        return hourCount;
    }

    public void setHourCount(int hourCount) {
        this.hourCount = hourCount;
    }

    @Override
    protected void makeVoice() {
        System.out.println("Pracuje jak tylko moge szefie");
    }
}
