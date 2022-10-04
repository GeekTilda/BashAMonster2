public class Enemy {
    int hp = 100;
    int dmg = 5;
    String name = "Enemy";
    boolean friend = false;

    public Enemy() {}

    public Enemy(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int hpLoss() {
        hp -= dmg;
        return hp;
    }
}
