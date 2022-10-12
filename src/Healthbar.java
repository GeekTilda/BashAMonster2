import javax.swing.*;
import java.awt.*;

public class Healthbar extends JPanel {

    Friend myFriend;
    Friend myEnemy;

    public Healthbar() {
    }

    public Healthbar(Friend friend, Friend enemy) {
        myFriend = friend;
        myEnemy = enemy;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    /*protected void addHealthbar(Graphics g) { //Original addHealthbar
        g.setColor(Color.GREEN);
        g.fillRect(10, 50, 300, 100);
    } */

    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(25, 25, myFriend.getHp() * 3, 50);
        g.setColor(Color.RED);
        g.fillRect(25, 75, myEnemy.getHp() * 3, 50);
    }

    public void getHit() {

    }
}