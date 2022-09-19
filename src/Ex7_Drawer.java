import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Ex7_Drawer extends JComponent {
    public  void paint(Graphics g) {
        Rectangle y=new Rectangle(105,110,200,80);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.blue);
        g2.fill(y);

        g2.setColor(Color.red);
        g2.drawString("Younis",100,300);

    }
}
