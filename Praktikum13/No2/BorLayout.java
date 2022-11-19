
import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Nuzulurrahmah (2108107010012)
 * @version 19.11.2022
 */
public class BorLayout {
    JFrame frame=new JFrame("Layout Tester");
    JPanel panel=new JPanel();
    JButton b1=new JButton("One");
    JButton b2=new JButton("Two");
    JButton b3=new JButton("Three");
    JButton b4=new JButton("Four");
    JButton b5=new JButton("Five");
    
    public BorLayout(){
        panel.setLayout(new BorderLayout()); 
        panel.add(b1,BorderLayout.NORTH);
        panel.add(b2,BorderLayout.WEST);
        panel.add(b3,BorderLayout.CENTER); 
        panel.add(b4,BorderLayout.EAST);
        panel.add(b5,BorderLayout.SOUTH);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
