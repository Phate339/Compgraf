/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex2_5 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
    frame.setTitle("Exercicio 2.5");
    frame.setDefaultCloseOperation(
	JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Ex2_5();
    applet.init();
    frame.getContentPane().add(applet);
    frame.pack();
    frame.setVisible(true);
    }
     public void init() {

       JPanel panel = new Panel();
    getContentPane().add(panel);
    }
     
      class Panel extends JPanel{
            
        
          public Panel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.lightGray);
        
        
        
    }
          
          
          public void paintComponent(Graphics g) {
              
              super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        GeneralPath ca = new GeneralPath();
        g2.setColor(Color.red);
        
        
        ca.moveTo(100, 100);
        ca.lineTo(250,100);
       // ca.quadTo(400, 200, 250, 300);
       ca.curveTo(350, 150, 350, 250,250, 300);
        ca.lineTo(100, 300);
        ca.lineTo(100, 100);
        
        g2.draw(ca);
        
              
          }
      }
    
}
