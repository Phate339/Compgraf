/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Ex3_4 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio 3.4");
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Ex3_4();
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
            
            AffineTransform tr = new AffineTransform();
Graphics2D g1 = (Graphics2D) g;



String texto = "Java Graphics";

Font font2 = new Font("Serif", Font.BOLD, 80);
FontRenderContext frc = g1.getFontRenderContext();
g1.setFont(font2);
g1.setColor(Color.black);
char[] msg = texto.toCharArray();
for (int i = 0; i < 13;i++){

g1.drawString(msg[i]+"", 150, 350);

g1.rotate(-0.45,190,190);
    }
    }
    }}