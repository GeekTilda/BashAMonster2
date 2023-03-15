import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

public class Game extends JFrame {

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
        drawWindow(Filip, FirstFriend);
    }


    public void drawWindow(Friend friend, Friend enemy) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        Healthbar healthbar = new Healthbar(friend, enemy); //Create the canvas
        healthbar.setPreferredSize(new Dimension(350, 200));
        this.add(healthbar); // add the canvas to the frame
        this.pack(); // Package everything
        this.setVisible(true); //make everything visible
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

