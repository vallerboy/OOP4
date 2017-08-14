import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss("Oskar", 10000);
        boss1.makeVoice();
        boss1.kickOut("Wojtek");

        CoBoss boss2 = new CoBoss("Marta", 4000, true);

        Worker worker = new Worker("Filip", 1200, 230);
        worker.makeVoice();

        List<IManagment> managment = new ArrayList<>();
        managment.add(boss1);
        managment.add(boss2);

    }
}
