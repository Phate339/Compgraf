/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello2d;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Filipe Garcia
 */
public class Hello2d extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Hello 2D");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Hello2d();
    applet.init();
    frame.getContentPane().add(applet);
    frame.pack();
    frame.setVisible(true);
  }
  


     public void init() {

       JPanel panel = new Hello2DPanel();
    getContentPane().add(panel);
    }
}
