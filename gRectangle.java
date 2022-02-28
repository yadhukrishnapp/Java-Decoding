import java.awt.*;
import javax.swing.JFrame;

public class gRectangle extends Canvas {
    public void paint(Graphics g) {
        g.drawString("WELCOME", 50, 70);
        setBackground(Color.BLACK);
        g.drawRect(30, 30, 100, 80);
        g.drawOval(40, 30, 80, 80);
        g.drawOval(36, 30, 80, 80);
        setForeground(Color.GREEN);
    }

    public static void main(String[] args) {
        gRectangle m = new gRectangle();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(500, 400);
        // f.setLayout(null);
        f.setVisible(true);
    }
}