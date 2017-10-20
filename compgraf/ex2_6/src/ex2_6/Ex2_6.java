/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex2_6 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio 2.5");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex2_6();
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
            g2.setBackground(Color.DARK_GRAY);


            //bola fora preto
            Shape s1 = new Ellipse2D.Float(0.0f, 0.0f, 400.0f, 400.0f);
            Area a1 = new Area(s1);
            ///bola m preta

            Shape s2 = new Ellipse2D.Float(100.0f, 200.0f, 200.0f, 200.0f);
            Area a2 = new Area(s2);
            //semicirculo branco
            Shape ss = new Arc2D.Double(0, 0, 400, 400, 90, -180, Arc2D.CHORD);
            Area as = new Area(ss);

            //bola m branca
            Shape s3 = new Ellipse2D.Float(100.0f, 0.0f, 200.0f, 200.0f);
            Area a3 = new Area(s3);
            //bola pequena cima
            Shape bc = new Ellipse2D.Float(180.0f, 80.0f, 20.0f, 20.0f);
            Area ac = new Area(bc);
            //bola pequena baixo

            Shape bb = new Ellipse2D.Float(180.0f, 280.0f, 20.0f, 20.0f);
            Area ab = new Area(bb);



            g2.setColor(Color.black);
            g2.fill(a1);
            g2.draw(a1);


            g2.setColor(Color.white);
            g2.fill(as);
            g2.fill(a3);
            as.add(a3);

            g2.fill(ab);
            as.add(ab);
            g2.setColor(Color.black);

            g2.fill(ac);
            as.subtract(ac);
            g2.fill(a2);
            as.subtract(a2);
            
            g2.setColor(Color.white);
             g2.fill(ab);
            as.add(ab);
            g2.draw(as);



        }
    }
}
