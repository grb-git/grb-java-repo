import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends Frame implements ItemListener{
    Checkbox cbRed, cbBlue, cbGreen;

    public CheckBoxDemo(){
        super("Checkbox Demo");
        setBounds(100, 100, 300, 200);
        Panel p1 = new Panel();
        add(p1, BorderLayout.NORTH);
        CheckboxGroup cg = new CheckboxGroup();
        cbRed = new Checkbox("Red", cg, true);
        cbRed.addItemListener(this);
        p1.add(cbRed);
        cbGreen = new Checkbox("Green", cg, false);
        cbGreen.addItemListener(this);
        p1.add(cbGreen);
        cbBlue = new Checkbox("Blue", cg, false);
        cbBlue.addItemListener(this);
        p1.add(cbBlue);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==cbRed)
            setBackground(Color.red);
        else if(ie.getSource()==cbBlue)
            setBackground(Color.blue);
        else if(ie.getSource()==cbGreen)
            setBackground(Color.green);
    }
    
    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
