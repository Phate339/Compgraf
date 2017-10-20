/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex2_2 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrame frame = new JFrame();
    frame.setTitle("Exercicio 2.2");
    frame.setDefaultCloseOperation(
	JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Ex2_2();
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
        setBackground(Color.black);
    }
          
          
          public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        Graphics2D g1= (Graphics2D) g;
        //orelhas 
                g1.setColor(Color.green);
                g1.rotate(Math.toRadians(-30),100, 100);
        g1.drawOval (200-150, 190-70, 100, 150);
        ////// 
         
          g1.rotate(Math.toRadians(30), 100,100);
        ////// esquerda
                          g1.setColor(Color.green);
                g1.rotate(Math.toRadians(30),100, 100);
        g1.drawOval (200+40, 190-180, 100, 150);
          
        g1.rotate(Math.toRadians(-30), 100,100);
        //cara
         g2.setColor(Color.black);
         g2.fillOval (100, 190, 200, 200);
             g2.setColor(Color.red);
         g2.drawOval (100, 190, 200, 200);
         ///olhos
        g1.setColor(Color.green);
         g1.fillOval (200-80, 290-60, 50, 50);
         //esq
           g1.fillOval (200+80-50, 290-60, 50, 50);
         //boca
           
      int   x1=200-60;
      int    y=290+10;
       int  x2=200+60;
      for (int i=0;i<50;i++){////preenche linhas da boca e vai enturtando lentamente
          g1.drawLine(x1, y, x2, y);
          y=(int)y+1;
          x1=(int)x1+i/20;
          x2=(int)x2-i/20;
          
      }
          //legenda
 g.setFont(new Font("Verdana", Font.ITALIC, 37));
g.drawString("deadmau5", 120, 70);
          }
  }
}
