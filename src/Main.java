import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inLine = new Scanner(System.in);
        Friend FirstFriend = new Friend();
        Friend Filip = new Friend("Filip");

        //FirstFriend.PrintFriend();
        //Filip.PrintFriend();
        //eller
        //System.out.println(Filip.name);
        //eller
        //System.out.println(Filip.getName()); //Skyddar informationen bättre, detta gör att man kan kolla om en person bör ha tillgång till informationen
        System.out.println("Vad vill du att ditt monster ska heta? ");
        String namn = inLine.next();

        FirstFriend.setName(namn);
        System.out.println("Ena vännen heter " + FirstFriend.getName() + " och har " + FirstFriend.getHp() + " hp!");
        System.out.println("Andra vännen heter " + Filip.getName() + " och har " + Filip.getHp() + " hp!");
        System.out.println();
        System.out.println(Filip.getName() + " säger 'Du är ful!'");
        System.out.println(FirstFriend.getName() + " säger 'Du är elak, du är nu min fiende!'");
        FirstFriend.friend = false;

        Enemy FirstEnemy = new Enemy(FirstFriend.getHp(), FirstFriend.getName());

        while (FirstEnemy.getHp() > 0 && Filip.getHp() > 0) {
            System.out.println();
            System.out.println(FirstEnemy.getName() + " slår " + Filip.getName() + ". " + Filip.getName() + " har nu " + Filip.hpLoss() + " hp.");
            System.out.println(Filip.getName() + " slår " + FirstEnemy.getName() + ". " + FirstEnemy.getName() + " har nu " + FirstEnemy.hpLoss() + " hp.");
            if (FirstEnemy.getHp() <= 0) {
                System.out.println(FirstEnemy.getName() + " är död!");
            }
            else if (Filip.getHp() <= 0) {
                System.out.println(Filip.getName() + " är död!");
            }
        }
    }
}