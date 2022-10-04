public class Friend {
    //Instans variabler
    int hp = 100;
    int dmg = 10;
    String name = "Friend";
    boolean friend = true;

    //Konstruktor
    public Friend () {}

    public Friend(String name) {
        this.name = name;
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

    public int getHp() {
        return this.hp;
    }

    public int hpLoss() {
        hp -= dmg;
        return hp;
    }
}
