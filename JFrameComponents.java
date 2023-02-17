import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameComponents extends JFrame implements ActionListener{
	JLabel lbl1, lbl2, lbl3;
	JTextField txt1, txt2, txt3;
	JButton sum, clear;
	
	
    public JFrameComponents() {
    	setTitle("Swing Example");
    	setBounds(100, 100, 400, 200);
    	setResizable(false);
    	setLayout(new GridLayout(4, 2));
    	
    	lbl1 = new JLabel("Enter First Number: ");
    	add(lbl1);
    	txt1 = new JTextField();
    	add(txt1);
    	
    	lbl2 = new JLabel("Enter First Number: ");
    	add(lbl2);
    	txt2 = new JTextField();
    	add(txt2);
    		
    	
    	lbl3 = new JLabel("Enter First Number: ");
    	add(lbl3);
    	txt3 = new JTextField();
    	add(txt3);
    	
    	sum = new JButton("Add");
    	sum.addActionListener(this);
    	add(sum);
    	
    	clear = new JButton("Clear");
    	clear.addActionListener(this);
    	add(clear);
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==sum){
			int x = Integer.parseInt(txt1.getText());
			int y = Integer.parseInt(txt2.getText());
			
			int z = x + y;
			
			txt3.setText(String.valueOf(z));
		} else {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");	
		}
	}    
    public static void main(String[] args){
    	new JFrameComponents();
    }
}