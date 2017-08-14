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
