
import java.awt.FlowLayout;
import javax.swing.*;

public class RadioCheckBox{
    public static void main(String[] args) {
        RadioCheck rb = new RadioCheck();
    }
}
class RadioCheck extends JFrame{
    JTextField txt;
    JRadioButton r1,r2;
    JButton btn;
    JLabel lbl;
    JCheckBox cb1,cb2;
    public RadioCheck(){
        txt = new JTextField(20);
        btn = new JButton("OK");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        lbl = new JLabel("Greeting");
        cb1 = new JCheckBox("Dancing");
        cb2 = new JCheckBox("Singing");
        
        
        
        add(txt);      
        add(r1);
        add(r2);
        add(cb1);
        add(cb2);
        add(btn);
        add(lbl);
        
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        btn.addActionListener(ae ->
        {
            String name = txt.getText();
            if(r1.isSelected()){
               name = "Mr. " + name;
            }
            else{
                name = "Ms. " + name;
            }
            if(cb1.isSelected()){
                name = name + " Dancer";
            }
            if(cb2.isSelected()){
                name = name + " Singer";
            }
            lbl.setText(name);
            
        }
        );
        
        
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
}
