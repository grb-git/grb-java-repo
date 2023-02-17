import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame implements MouseListener, MouseMotionListener{
	
	JPanel p;
	String s = "";
	JLabel lbl;
	
    public MouseListenerEx() {
    	setBounds(100,100,300,400);
    	p = new JPanel();
		lbl = new JLabel();
		this.add(lbl, BorderLayout.NORTH);
    	p.addMouseListener(this);
    	p.addMouseMotionListener(this);
    	add(p);	
    	setDefaultCloseOperation(EXIT_ON_CLOSE);	
    	setVisible(true);
    }
    
    public void mouseClicked(MouseEvent me){
    	lbl.setText( "Clicked");
    
    }
    public void mouseEntered(MouseEvent me){
    	lbl.setText("Entered") ;
		p.setBackground(Color.blue);
   
    }
    public void mouseExited(MouseEvent me){
    	
		lbl.setText("Exited") ;
		p.setBackground(Color.black);
    
    }
    public void mousePressed(MouseEvent me){
    	lbl.setText("Pressed") ;
    	
    }
    public void mouseReleased(MouseEvent me){
    	lbl.setText("Released") ;
   
    }
    
    public void mouseMoved(MouseEvent mme){
    	lbl.setText("Moved") ;
    	
    }
   	public void mouseDragged(MouseEvent mme){
    	lbl.setText("Dragged") ;
    
    }
   	
   	public void paint(Graphics g){
   		g.drawString(s, 50, 50);
   	}
   	
    public static void main(String[] args){
    	new MouseListenerEx();
    }
    
}