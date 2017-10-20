/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex3_5 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio 3.5");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex3_5();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {

        JPanel panel = new Panel();
        getContentPane().add(panel);
    }

    class Panel extends JPanel {

        public Panel() {
            setPreferredSize(new Dimension(400, 400));
            setBackground(Color.gray);



        }

        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            
              
          
            Area area = new Area(new Ellipse2D.Float(00.0f, 00.0f, 400.0f, 400.0f));
            area.subtract(new Area(new Rectangle2D.Double(150 , 150, 100, 100)));

           
            g2.setColor(Color.green);
            g2.fill(area);
            g2.clip(area);
            g2.scale(3, 3);
            g2.translate(-5, -20);
          
            g2.clip(area);
            g2.setColor(Color.blue);
            Font font = new Font("Sans", Font.BOLD, 30);
            String j2d = "Java 2D";
            AffineTransform tr = new AffineTransform();
            tr.rotate(-Math.PI / 4);
            Font theDerivedFont = font.deriveFont(tr);
            g2.setFont(theDerivedFont);
            g2.drawString(j2d, 40, 130);
        }
    }
}
