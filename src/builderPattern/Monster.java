package builderPattern;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Monster {
    private int attack;
    private int def;
    private int hp;
    private int mana;
    private String name;
    private int rank;
    private boolean isDistanceAttacker;

    public Monster(Builder builder) {
        attack = builder.attack;
        def = builder.def;
        hp = builder.hp;
        mana = builder.mana;
        name = builder.name;
        rank = builder.rank;
        isDistanceAttacker = builder.isDistanceAttacker;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isDistanceAttacker() {
        return isDistanceAttacker;
    }

    public void setDistanceAttacker(boolean distanceAttacker) {
        isDistanceAttacker = distanceAttacker;
    }

    public static class Builder {
        private int attack;
        private int def;
        private int hp;
        private int mana;
        private String name;
        private int rank;
        private boolean isDistanceAttacker;

        public Builder(String name, boolean isDistanceAttacker){
            this.name = name;
            this.isDistanceAttacker = isDistanceAttacker;
        }

        public Builder setAttack(int attack){
            this.attack = attack;
            return this;
        }

        public Builder setDef(int def){
            this.def = def;
            return this;
        }

        public Builder setHp(int hp){
            this.hp = hp;
            return this;
        }

        public Builder setMana(int mana){
            this.mana = mana;
            return this;
        }

        public Builder setRank(int rank){
            this.rank = rank;
            return this;
        }

        public Monster build(){
            return new Monster(this);
        }

    }
}
