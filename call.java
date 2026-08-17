
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Call {
    public static void main(String[] args) {
        Open o = new Open();
    }
}
class Open extends JFrame implements ActionListener{
    JButton btn;
    JProgressBar pb;
    int i=0;
    Timer t = new Timer(20, this);
    public Open() {
        btn = new JButton("Click");
        pb = new JProgressBar(0,20);
        btn.addActionListener(this);
        
        add(btn);
        add(pb);
        
        setLayout(new FlowLayout());        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){  
            t.start();
            
        }
        if(e.getSource() == t){
            i++;
            pb.setValue(i);
            if(i == 20){
                new RadioCheck();
                dispose();
            }
            
        }
    }
    
}
