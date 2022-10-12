import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Game {

    Healthbar healthbar;
    Friend friend;

    public Game() {
    }

    public void start() {
        Scanner inLine = new Scanner(System.in); //Lägger in scannern
        Friend FirstFriend = new Friend(true); //
        Friend Filip = new Friend("Filip");

        System.out.println("Vad vill du att ditt monster ska heta? ");
        String namn = inLine.next();

        FirstFriend.setName(namn);
        System.out.println("Ena vännen heter " + FirstFriend.getName() + " och har " + FirstFriend.getHp() + " hp!");
        System.out.println("Andra vännen heter " + Filip.getName() + " och har " + Filip.getHp() + " hp!");
        System.out.println();
        System.out.println(Filip.getName() + " säger 'Du är ful!'");
        System.out.println(FirstFriend.getName() + " säger 'Du är elak, du är nu min fiende!'");
        FirstFriend.setFriend(false);

        while (FirstFriend.getHp() > 0 && Filip.getHp() > 0) {
            System.out.println();
            System.out.println(FirstFriend.getName() + " slår " + Filip.getName() + ". " + Filip.getName() + " har nu " + Filip.hpLoss() + " hp.");
            System.out.println(Filip.getName() + " slår " + FirstFriend.getName() + ". " + FirstFriend.getName() + " har nu " + FirstFriend.hpLoss() + " hp.");
            if (FirstFriend.getHp() <= 0) {
                System.out.println(FirstFriend.getName() + " är död!");
            } else if (Filip.getHp() <= 0) {
                System.out.println(Filip.getName() + " är död!");
            } else if (Filip.getHp() <= 0 && FirstFriend.getHp() <= 0) {
                System.out.println("Båda dog! ");
            }
            /*JFrame frame = */
            drawWindow(Filip, FirstFriend);
            //startGame(Filip, FirstFriend);
            /*
            synchronized (args) {
                try {
                    args.wait(500);
                } catch (InterruptedException e) {

                }
            }
            */

            //frame.dispose();
        }
    }


    public static JFrame drawWindow(Friend friend, Friend enemy) {
        JFrame frame = new JFrame("Healthbar: " + friend.getName() + " & " + enemy.getName()); //create the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        Healthbar healthbar = new Healthbar(friend, enemy); //Create the canvas
        healthbar.setPreferredSize(new Dimension(350, 200));
        frame.getContentPane().add(healthbar); // add the canvas to the frame
        frame.pack(); // Package everything
        frame.setVisible(true); //make everything visible
        return frame;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AJ");
        String in = scanner.nextLine();
        if (in.equals("y")) {
            //Healthbar.getHit();
        }
    }
}

