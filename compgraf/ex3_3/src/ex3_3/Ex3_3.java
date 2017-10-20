/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
public class Ex3_3 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio 3.3");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex3_3();
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
                for (int i = 0; i < 1000; i++) {
        Color c = new Color(0, (int) (200*Math.random())+30, 0);
        g2.setColor(c);
g2.fillRect((int) (600*Math.random())-200, (int) (600*Math.random())-200, (int) (100*Math.random()), (int) (100*Math.random()));
        }
              
            Area olho = new Area(new Rectangle2D.Double(0, 0 , 50, 50));

  Area p1 = new Area(new Rectangle2D.Double(0, 25 , 50, 200));            
  Area p2 = new Area(new Rectangle2D.Double(50, 0 , 75, 100));
  Area p3 = new Area(new Rectangle2D.Double(125, 25 , 50, 200)); 
  
  p1.add(p2);
  p1.add(p3);
            
            g2.translate(200-125, 100);
            g2.setColor(Color.black);
            g2.fill(olho);
            g2.translate(175, 0);
            g2.setColor(Color.black);
            g2.fill(olho);
            
            
             g2.translate(-150, 100);
            g2.setColor(Color.black);
            g2.fill(p1);
            
            
            
    }
    }
}
