
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Nuzulurrahmah (2108107010012)
 * @version 19.11.2022
 */
public class GrLayout {

    JFrame frame=new JFrame("Layout Tester");
    JPanel panel=new JPanel();
    JButton b1=new JButton("One");
    JButton b2=new JButton("Two");
    JButton b3=new JButton("Three");
    JButton b4=new JButton("Four");
    JButton b5=new JButton("Five");
    
    public GrLayout(){
        panel.setLayout(new GridLayout(3,2,3,3)); 
        panel.add(b1);
        panel.add(b2);
        panel.add(b3); 
        panel.add(b4);
        panel.add(b5);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

