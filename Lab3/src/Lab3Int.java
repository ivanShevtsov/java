import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;


 public class Lab3Int extends JPanel {

    
    public void paintComponent(Graphics g) {
        
        var radius = Math.min(getWidth() /3, getHeight() / 3) - 5;
        var diameter = radius ;
        int x[] = { getWidth(), getWidth()-180, getWidth()-140, getWidth() };
        int y[] = { getHeight()/3, getHeight()/3, (getHeight()/3)*2, (getHeight()/3)*2};
        g.setColor(Color.RED);
        g.fillOval(0, (getHeight() / 3), diameter, diameter);
        g.setColor(Color.BLUE);
        g.fillRect((getWidth()/3), (getHeight() / 3), getWidth() /3, getHeight() / 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(x, y,4 );
        g.setFont(new Font("serif", Font.BOLD, 16));
        g.setColor(Color.GRAY);
        g.drawString("Червоний круг", 40, (getHeight() / 3)-10);
        g.drawString("Синій квадрат", (getWidth()/3), (getHeight() / 3)-10);
        g.drawString("Зелена трапеція",getWidth()-180 , (getHeight() / 3)-10);
        g.drawString("Шевцов Іван 4 курс",getWidth()-150 , getHeight()-5);
    }

    /**
     * A little driver in case you want a stand-alone application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new Lab3Int();
            var frame = new JFrame("A simple graphics program");
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}