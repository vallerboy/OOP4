package task10;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Punkt3D extends Punkt2D {

    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Punkt3D{" +
                "z=" + z +
                '}';
    }
}
