import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Healthbar extends JPanel implements MouseListener {

    Friend myFriend;
    Friend myEnemy;

    public Healthbar() {
    }

    /*
     *  Sets the enemy as our enemy.
     *  Sets the friend as our friend.
     *  Adds MouseListener to be able to "hear" clicks.
     */
    public Healthbar(Friend friend, Friend enemy) {
        myFriend = friend;
        myEnemy = enemy;
        this.addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }
    
    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(25, 25, myFriend.getHp() * 3, 50);
        g.drawString(myFriend.theString(), 25, 25);
        g.setColor(Color.RED);
        g.fillRect(25, 75, myEnemy.getHp() * 3, 50);
        g.drawString(myEnemy.theString(), 25, 75);
    }

    public void getHit() {
        myEnemy.hpLoss();
        myFriend.hpLoss();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (myFriend.getHp() > 0 && myEnemy.getHp() > 0) {
            getHit();

            if (myEnemy.getHp() <= 0 && myFriend.getHp() <= 0) {
                myFriend.hp = 0;
                myEnemy.hp = 0;
            } else if (myEnemy.getHp() <= 0) {
                myEnemy.hp = 0;
            } else if (myFriend.getHp() <= 0) {
                myFriend.hp = 0;
            }

            System.out.println();
            System.out.println(myFriend.getName() + " slår " + myEnemy.getName() + ". " + myEnemy.getName() + " har nu " + myEnemy.getHp() + " hp.");
            System.out.println(myEnemy.getName() + " slår " + myFriend.getName() + ". " + myFriend.getName() + " har nu " + myFriend.getHp() + " hp.");

            if (myEnemy.getHp() <= 0 && myFriend.getHp() <= 0) {
                System.out.println("Båda dog! ");
            } else if (myEnemy.getHp() <= 0) {
                System.out.println(myEnemy.getName() + " är död!");
            } else if (myFriend.getHp() <= 0) {
                System.out.println(myFriend.getName() + " är död!");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}