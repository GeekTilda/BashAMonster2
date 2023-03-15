import java.util.Random;

public class Friend {
    //Instans variabler
    int hp = 100;
    int dmg;
    String name = "Friend";
    boolean friend; //final boolean???

    //Konstruktor
    public Friend(boolean friend) {
        this.friend = friend;
    }

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, boolean friend) {
        this.name = name;
        this.friend = friend;
    }


    public void PrintFriend() {
        System.out.println("Ditt monster heter " + name);
    }

    //Metoder

    //Getter/Setter
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setFriend(boolean friend) {
        this.friend = friend;
    }

    public int getHp() {
        return this.hp;
    }

    public int hpLoss() {
        Random rn = new Random();
        dmg = rn.nextInt(1, 10);
        System.out.println(dmg);
        hp -= dmg;
        return hp;
    }

    public String theString() {
        return "" + hp;
    }
}
