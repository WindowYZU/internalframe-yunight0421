/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class VetoableSample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JDesktopPane jdesktopPane = new JDesktopPane();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setContentPane(jdesktopPane);
        frame.setSize(800, 600);
        final JInternalFrame[] iframes = new JInternalFrame[3];
        for (int i = 0; i < 3; i++) {
            iframes[i] = new JInternalFrame("frame" + i, true, true, true, true);
            iframes[i].setLocation(100 * i, 100 * i);
            frame.add(iframes[i]);
            iframes[i].setSize(300, 300);
            iframes[i].setVisible(true);
        }
        for (int i = 0; i < 3; i++) {
            iframes[i].addVetoableChangeListener(new VetoableChangeListener() {
                @Override
                public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                    if (evt.getPropertyName().equals(JInternalFrame.IS_ICON_PROPERTY)) {
                        //implement veto status: at least one internalframe should be
                        //in normal state
                        
                        //////////////////////////
                    }
                }
            });

        }
        frame.setVisible(true);
    }
}
