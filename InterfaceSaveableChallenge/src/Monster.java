import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private String level;
    private String health;
    private String mana;
    private String weapon;

    public Monster(String name, String level, String health, String mana, String weapon) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.weapon = "Fists";
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
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
        values.add(level);
        values.add(health);
        values.add(mana);
        values.add(weapon);
        return values;
    }

    @Override
    public void load(List<String> values) {
        this.level = values.get(0);
        this.health = values.get(1);
        this.mana = values.get(2);
        this.weapon = values.get(3);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", health='" + health + '\'' +
                ", mana='" + mana + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
