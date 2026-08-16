
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class MouseListenerTry {
    public static void main(String[] args) {
        MListner ml = new MListner();
    }
}
class MListner extends JFrame{

    public MListner(){
        
        addMouseListener(new MouseAdapter() {
                   public void mousePressed(MouseEvent e) {
                       int x = e.getX();
                       int y = e.getY();
                       System.out.println(x + "," + y);
                   }
        });
        
        
        
        
        
        setLayout(new FlowLayout());        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

   
}
