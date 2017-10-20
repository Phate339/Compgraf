/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.TexturePaint;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex3_2 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio 3.2");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex3_2();
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
          try {  
            int r1 = 50;
            int lq = 40;
          
            Area area = new Area(new Ellipse2D.Float(-50.0f, -50.0f, 100.0f, 100.0f));
            area.subtract(new Area(new Rectangle2D.Double(-lq / 2, -lq / 2, lq, lq)));

            g2.translate(70, 200);
            g2.setColor(Color.green);
            g2.fill(area);
            
            GradientPaint gp = new GradientPaint(0, -50, Color.red, 0, 50, Color.blue);
            g2.setPaint(gp);
            g2.translate(120, 0);
            g2.fill(area);
            
            URL url = getClass().getClassLoader().getResource("txt.jpg");
            BufferedImage imagem;
            
                imagem = ImageIO.read(url);
                  TexturePaint tp = new TexturePaint(imagem, new Rectangle2D.Double(0, 0, 400, 300));
            g2.setPaint(tp);
             g2.translate(120, 0);
            g2.fill(area);
            } catch (IOException ex) {
                Logger.getLogger(Ex3_2.class.getName()).log(Level.SEVERE, null, ex);
            }
          
           
           
        }
    }
}
