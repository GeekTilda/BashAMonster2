import javax.swing.*;
import java.awt.*;

public class Healthbar extends JPanel {
    int hp;

    public Healthbar() {

    }

    public Healthbar(int hp) {
        this.hp = hp * 3;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    /*protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(10, 50, 300, 100);
    } */

    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(25, 25, hp, 50);
    }

    protected void changeHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(25, 25, 300, 100);
    }
}