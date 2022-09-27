public class Friend {
    int hp = 100;
    String name = "Friend";
    boolean friend = true;

    public Friend () {}

    public Friend(String name) {
        this.name = name;
    }

    public void PrintFriend() {
        System.out.println("Ditt monster heter " + name);
    }
}
