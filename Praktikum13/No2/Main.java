
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class Main {
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                BorLayout borLayout = new BorLayout();
                GrLayout grLayout = new GrLayout();
                FlLayout layout = new FlLayout();
            }
        });
          
    }
}
