/**
 * Created by Lenovo on 14.08.2017.
 */
public class CoBoss extends Boss {

    private boolean isHappy;

    public CoBoss(String name, int salary) {
        super(name, salary);
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public CoBoss(String name, int salary, boolean isHappy) {
        this(name, salary);
        this.isHappy = isHappy;
    }

    @Override
    protected void makeVoice() {
        System.out.println("Pracuje, bo szef patrzy mi na rece");
    }
}
