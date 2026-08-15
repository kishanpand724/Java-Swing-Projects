
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButton {
    public static void main(String[] args) {
        Radio rb = new Radio();
    }
}
class Radio extends JFrame{
    JTextField txt;
    JRadioButton r1,r2;
    JButton btn;
    JLabel lbl;
    public Radio(){
        txt = new JTextField(20);
        btn = new JButton("OK");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        lbl = new JLabel("Greeting");
        
        
        
        add(txt);      
        add(r1);
        add(r2);
        add(btn);
        add(lbl);
        
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        btn.addActionListener(ae ->
        {
            String name = txt.getText();
            if(r1.isSelected()){
                lbl.setText("Mr. " + name);
            }
            else{
                lbl.setText("Ms. " + name);
            }
        }
        );
        
        
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
}
