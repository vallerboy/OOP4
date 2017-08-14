/**
 * Created by Lenovo on 14.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Boss boss1 = new CoBoss("Oskar", 10000);
        boss1.makeVoice();
        boss1.kickOut("Wojtek");

        Worker worker = new Worker("Filip", 1200, 230);
        worker.makeVoice();
    }
}
