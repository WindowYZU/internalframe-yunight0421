/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class TestScaledImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        JDesktopPane desktopPane = new ImageIconDesktopPane();
        frame.setContentPane(desktopPane);
        //experiment with JDesktopPane.xxxLAYER
        JButton button1=new JButton("button1");
        button1.setBounds(0, 0, 100, 50);
        desktopPane.add(button1, JDesktopPane.DRAG_LAYER);
        
        JButton button2=new JButton("button2");
        button2.setBounds(50, 0, 100, 50);
        desktopPane.add(button2, JDesktopPane.DEFAULT_LAYER);
        ///////////////////////////////////////////////////////

        frame.setVisible(true);
    }
    
}
