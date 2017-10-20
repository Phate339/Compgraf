/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex3_1 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio 3.1");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex3_1();
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
        Color c = new Color((int) (255*Math.random()), (int) (255*Math.random()), (int) (255*Math.random()));
        g2.setColor(c);
g2.fillRect((int) (600*Math.random())-200, (int) (600*Math.random())-200, (int) (100*Math.random()), (int) (100*Math.random()));
        }
        }
    }
}
