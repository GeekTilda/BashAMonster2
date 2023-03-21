import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

public class Game extends JFrame {

    public Game() {
    }

    /*
     *   Start method.
     *   Here the user sets the name of their monster.
     *   An introduction to the evil monster Filip.
     *   Sets Filip as an enemy and calls on the method "drawWindow", which will draw the window where the healthbars will be displayed.
     */
    public void start() {
        Scanner inLine = new Scanner(System.in);
        Friend FirstFriend = new Friend(true);
        Friend Filip = new Friend("Filip");

        System.out.println("Vad vill du att ditt monster ska heta? ");
        String namn = inLine.next();

        FirstFriend.setName(namn);  //Sets the name the user wanted as the friendly monsters name.
        System.out.println("Ena monstret heter " + FirstFriend.getName() + " och har " + FirstFriend.getHp() + " hp!");
        System.out.println("Andra monstret heter " + Filip.getName() + " och har " + Filip.getHp() + " hp!");
        System.out.println();
        System.out.println(Filip.getName() + " säger 'Du är ful!'");
        System.out.println(FirstFriend.getName() + " säger 'Du är elak, du är nu min fiende!'");
        System.out.println();
        System.out.println("Klicka på liv-mätaren för att slå!");
        FirstFriend.setFriend(false); //This was supposed to make the friend into an enemy, but was later changed. So this is not nessesary anymore. (Just ignore it :))
        drawWindow(FirstFriend, Filip);
    }

    /*
     *   drawWindow method.
     *   Makes "this" (the Game class) a canvas for our healthbars.
     *   Creates a new healthbar where we add our friendly monster and evil monster Filip. We then add this healthbar into the frame (this.add(healthbar)).
     *   Sets size, visibility and finally adds the healthbar into our frame.
     */
    public void drawWindow(Friend friend, Friend enemy) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        this.setTitle("Healthbars!"); //Name of the frame. Will stand at the top as a title.
        Healthbar healthbar = new Healthbar(friend, enemy); //Create the canvas
        healthbar.setPreferredSize(new Dimension(350, 175)); //Size of the window
        this.add(healthbar); //Adds the canvas to the frame
        this.pack(); //Package everything
        this.setVisible(true); //Makes everything visible
    }
}

