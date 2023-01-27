import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutEDemo extends JFrame implements ActionListener{
	JPanel p, p1, p2, p3, p4, p5, p6;
	JLabel l1, l2, l3, l4;
	JButton nx, pr, ft, lt;
	CardLayout cl;
	
    public CardLayoutEx() {
    	setBounds(100,100,300,400);
    	cl = new CardLayout();
    	p = new JPanel(cl);
    	p1 = new JPanel();
    	l1=new JLabel("Fist Card");
    	p1.add(l1);
    	p.add(p1);
    	 
    	p2 = new JPanel();
    	l2=new JLabel("Second Card");
    	p2.add(l2);
    	p.add(p2);
    	
    	p3 = new JPanel();
    	l3=new JLabel("Third Card");
    	p3.add(l3);
    	p.add(p3);
    	
    	p4 = new JPanel();
    	l4=new JLabel("Forth Card");
    	p4.add(l4);
    	p.add(p4);
    	add(p, BorderLayout.CENTER);
    	
    	p5 = new JPanel(new GridLayout(1,4));
    	
    	ft = new JButton("First");
    	ft.addActionListener(this);
    	p5.add(ft);
    	
    	
    	pr = new JButton("Previous");
    	pr.addActionListener(this);
    	p5.add(pr);
    	
    	nx = new JButton("Next");
    	nx.addActionListener(this);
    	p5.add(nx);
    	
    	lt = new JButton("Last");
    	lt.addActionListener(this);
    	p5.add(lt);
    	
    	add(p5, BorderLayout.NORTH);
    	
    	setDefaultCloseOperation(EXIT_ON_CLOSE);	
    	setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource()==ft)
    		cl.first(p);
    	else if(ae.getSource()==nx)
    		cl.next(p);
    	else if(ae.getSource()==lt)
    		cl.last(p);
    	else
    		cl.previous(p);
    }
    
    public static void main(String[] args){
    	new CardLayoutEx();
    }
    
}