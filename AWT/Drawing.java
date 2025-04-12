import java.awt.*;
import java.awt.event.*;

public class Drawing extends Frame {
    int x1, y1, x2, y2;

    public Drawing() {
        setSize(400, 400);
        setTitle("Draw Rectangle");

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                repaint();
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
        g.drawString("Area: " + Math.abs(x2 - x1) * Math.abs(y2 - y1), 10, 50);
    }

    public static void main(String[] args) {
        new Drawing();
    }
}
