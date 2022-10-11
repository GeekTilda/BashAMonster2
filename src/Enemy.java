import java.util.Random;

public class Enemy {
    int hp = 100;
    int dmg = 5;
    String name = "Enemy";
    boolean friend = false;

    public Enemy() {
    }

    public Enemy(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return this.hp;
    }

    public int hpLoss() {
        Random rn = new Random();
        dmg = rn.nextInt(10);
        hp -= dmg;
        return hp;
    }
}
