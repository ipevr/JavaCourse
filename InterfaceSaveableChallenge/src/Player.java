import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int level;
    private int health;
    private int mana;
    private String weapon;

    public Player(String name, int level, int health, int mana, String weapon) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.weapon = "Fists";
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<>();
        values.add(0, "" + level);
        values.add(1, "" + health);
        values.add(2, "" + mana);
        values.add(3, weapon);
        return values;
    }

    @Override
    public void load(List<String> values) {
        this.level = Integer.parseInt(values.get(0));
        this.health = Integer.parseInt(values.get(1));
        this.mana = Integer.parseInt(values.get(2));
        this.weapon = values.get(3);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", health='" + health + '\'' +
                ", mana='" + mana + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
