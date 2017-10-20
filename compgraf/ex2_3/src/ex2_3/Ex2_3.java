/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex2_3 extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrame frame = new JFrame();
    frame.setTitle("Exercicio 2.3");
    frame.setDefaultCloseOperation(
	JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Ex2_3();
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
        setBackground(Color.gray);
        
        
        
    }
          
          
          public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        
   
	g2.setColor(Color.yellow);	
	Arc2D.Double cabeca = new Arc2D.Double(10,10,210,210,0,360,Arc2D.PIE);		
	g2.fill(cabeca);
	g2.setColor(Color.white);
	Arc2D.Double bocad = new Arc2D.Double(40,40,150,150,200,140,Arc2D.CHORD);
	g2.fill(bocad);
	// chord fecha o arco

	g2.setColor(Color.black);	//preto pro resto
	Arc2D.Double od = new Arc2D.Double(60,59,20,20,0,360,Arc2D.PIE);
	g2.fill(od);	
	// olhos			
	Arc2D.Double oe = new Arc2D.Double(149,59,20,20,0,360,Arc2D.PIE);
	g2.fill(oe);
        // linha por de fora da boca
	Arc2D.Double bocaf = new Arc2D.Double(40,40,150,150,200,140,Arc2D.CHORD);
	g2.draw(bocaf);	
          }
      }
    
}
