/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex2_1 extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
    frame.setTitle("Exercicio 2.1");
    frame.setDefaultCloseOperation(
	JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Ex2_1();
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
            
          int  n = 400;
          public Panel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.BLACK);
        
        
        
    }
              
 public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
         g2.translate(200, 200);
         g2.setColor(Color.RED);
         
        int X1 = 0;
        int Y1 = 0;
        int X2;
        int Y2;
 
        for (int i = 0; i < n; i++) {
            double t = (i * (2 * Math.PI)) / n;
            X2 = (int) (100 * Math.sin(t));
            Y2 = (int) (100 * Math.cos(3*t));
            if(i!=0) g2.drawLine(X1, Y1, X2, Y2);
            X1 = X2;
            Y1 = Y2;

        }
    }
      }
}
