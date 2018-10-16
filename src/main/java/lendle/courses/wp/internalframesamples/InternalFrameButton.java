/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class InternalFrameButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        
        JDesktopPane desktopPane=new JDesktopPane();
        frame.setContentPane(desktopPane);
        JInternalFrame internalFrame=new JInternalFrame("internalframe1", true, true, true, true);
        internalFrame.setSize(300, 300);
        internalFrame.setVisible(true);
        frame.add(internalFrame);
        
        //add a button to the frame
        //try to make it visible
        
        ////////////////////////////
        frame.setVisible(true);
    }
    
}
