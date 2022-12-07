
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;


 public class Lab3Int2 extends JPanel {

    
    public void paintComponent(Graphics g) {
        g.drawLine( 100, getHeight()-100, getWidth()-100, getHeight()-100);
        g.drawLine( 100, getHeight()-100, 100, 100);
        g.setColor(Color.RED);
        g.fillRect(150, getHeight()-270, 50, 170);
        g.setColor(Color.YELLOW);
        g.fillRect(210, getHeight()-175, 50, 75);
        g.setColor(Color.GREEN);
        g.fillRect(270, getHeight()-375, 50, 275);
        g.setColor(Color.BLUE);
        g.fillRect(330, getHeight()-325, 50, 225);
        g.setFont(new Font("serif", Font.ITALIC, 18));
        g.setColor(Color.BLUE);
        g.drawString("250", 155, (getHeight() / 3)+100);
        g.drawString("150", 215, (getHeight() / 3)+100);
        g.drawString("450", 275, (getHeight() / 3)- 10);
        g.drawString("290", 335, (getHeight() / 3)+40);
        g.drawString("х", getWidth()-100, getHeight()-100);
        g.drawString("у", 100, 95);
        g.drawString("Ріст зарплат працвників", (getWidth()/2)-100, getHeight()/6);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new Lab3Int2();
            
            var frame = new JFrame("A simple graphics program");
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}