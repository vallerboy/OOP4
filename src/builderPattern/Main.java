package builderPattern;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster.Builder("Dziki pies", false)
                .setAttack(10)
                .setDef(20)
                .setHp(500)
                .setMana(300)
                .build();
    }
}
