/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex3_6 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio 3.6");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex3_6();
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
            g2.translate(0, 100);
            
          
            
            Font font = new Font("Serif", Font.BOLD, 300);
            FontRenderContext frc = g2.getFontRenderContext();
            GlyphVector gv = font.createGlyphVector(frc, "F");
            Shape ff = gv.getOutline(100, 200);
            
            frc = g2.getFontRenderContext();
            gv = font.createGlyphVector(frc, "G");
            Shape gg = gv.getOutline(100, 200);
            Area ng = new Area(gg);
            Area nf = new Area(ff);
            AffineTransform tr = new AffineTransform();
            tr.rotate(-Math.PI / 4);
            tr.translate(-150, 120);
            ng.transform(tr);
            g2.setColor(Color.white);
            g2.fill(ng);
            g2.setColor(Color.red);
            g2.fill(nf);
            nf.subtract(ng);

            g2.setColor(Color.black);
            g2.fill(nf);

    }
    }
}
