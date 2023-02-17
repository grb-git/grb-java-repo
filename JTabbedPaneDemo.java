import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JTabbedPaneDemo extends JFrame implements ItemListener, ActionListener{
    JCheckBox c, java, python, cpp;
    JRadioButton rc, rjava, rpython, rcpp;
    JLabel msg1, msg2;

    public JTabbedPaneDemo(){
        super("JTabbedPane Demo");
    	setBounds(100,100, 400, 300);
    	
        JTabbedPane jtp = new JTabbedPane();
        JScrollPane jsp = new JScrollPane(jtp);
        add(jsp, BorderLayout.CENTER);
    	
        JPanel prog = new JPanel();
        c = new JCheckBox("C");
        c.addItemListener(this);
        prog.add(c);
        python = new JCheckBox("Python");
        python.addItemListener(this);
        prog.add(python);
        java = new JCheckBox("Java");
        java.addItemListener(this);
        prog.add(java);
        cpp = new JCheckBox("C++");
        cpp.addItemListener(this);
        prog.add(cpp);
        msg1 = new JLabel();
        prog.add(msg1);
        jtp.addTab("Programming Languages", prog);  
       
        
        JPanel favourite = new JPanel();
    
        rc = new JRadioButton("C");
        favourite.add(rc);
        rpython = new JRadioButton("Python");
        favourite.add(rpython);
        rjava = new JRadioButton("Java");
        favourite.add(rjava);
        rcpp = new JRadioButton("CPP");
        favourite.add(rcpp);
        jtp.addTab("Favourite Language", favourite);  
        ButtonGroup rbg = new ButtonGroup();
        rbg.add(rc);
        rbg.add(rjava);
        rbg.add(rcpp);
        rbg.add(rpython);
        rc.addActionListener(this);
        rcpp.addActionListener(this);
        rjava.addActionListener(this);
        rpython.addActionListener(this);
        msg2 = new JLabel();
        favourite.add(msg2);
       
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie){
        String item = "";
        if(c.isSelected())
        item += c.getText() + " ";
        if(python.isSelected())
        item += python.getText() + " ";
        if(java.isSelected())
        item += java.getText() + " ";
        if(cpp.isSelected())
        item += cpp.getText() + " ";
        msg1.setText("Selected Items: " + item);
    }

    public void actionPerformed(ActionEvent ae){
        msg2.setText("Selected Item: " );
        if(ae.getSource()==rc)
        msg2.setText("Selected Item: " + "C");
        else if(ae.getSource()==rcpp)
        msg2.setText("Selected Item: " + "CPP");
        else if(ae.getSource()==rjava)
        msg2.setText("Selected Item: " + "Java");
        else if(ae.getSource()==rpython)
        msg2.setText("Selected Item: " + "Python");
    }

    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }
}
