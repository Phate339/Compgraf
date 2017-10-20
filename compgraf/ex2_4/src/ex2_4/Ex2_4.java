/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex2_4 extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame frame = new JFrame();
    frame.setTitle("Exercicio 2.4");
    frame.setDefaultCloseOperation(
	JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Ex2_4();
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
          int XUmin=0;
          int YUmin=0;
          int XUmax=10000;
          int YUmax=10000;
          int Max=783;
          int XDmin=20;
          int YDmin=50;
          int XDmax=270;
          int YDmax=300;
          float Fx, Fy;
          float Fe;
          
          // tabela de dados para o exercício 2.4
int[][] Data = {
        {8524, 7479, 122},
        {1358, 7594, 612},
        {2625, 1990, 880},
        {6088, 7404, 266},
        {6809, 2419, 358},
        {8790, 2522, 755},
        {5435, 4974, 145},
        {7332, 8604, 812},
        {5741, 6806, 590},
        {7336, 6944, 783}};
          public Panel(){
       setPreferredSize(new Dimension(400,400));
       setBackground(Color.WHITE);
       Fx=(XDmax-XDmin)/((float)XUmax-XUmin);
       Fy=(YDmax-YDmin)/((float)YUmax-YUmin);
       
       if(Fy<Fy) Fe=Fx;
       Fe=Fy;
      }
          
           public void paintComponent(Graphics g) {
  super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    g2.drawRect(0, 0, 399, 399);
    g2.setColor(Color.RED);
    g2.drawRect(XDmin, YDmin, XDmax-XDmin-1, YDmax-YDmin-1);
    g2.setColor(Color.BLUE);
    
    for (int i=0;i<Data.length;i++){
        
       int x= MapX(Data[i][0]);
        int y= MapY(Data[i][1]);
        int r=(int)((15.0f/Max)*Data[i][2]);
        g2.fillOval(x-r, y-r, 2*r, 2*r);
        
    }
  }
 
      
int MapX(int xU){
       int xD=(int)(Fe*(xU-XUmin)+XDmin);
       return xD;
      }
     int MapY(int yU){
       int yD=(int)(Fe*(yU-YUmin)+YDmin);
       return yD;
      }
      }
      
}
