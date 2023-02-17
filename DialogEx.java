import java.awt.*;
import java.awt.event.*;

class MyDialog extends Dialog implements ActionListener{
	Label lbl;
	Button b;
	MyDialog(Frame parent, String title){
		super(parent, title, true);
		setBounds(150, 150, 100, 100);
		setLayout(new FlowLayout());
		lbl = new Label("This application is developed by GRB");
		add(lbl);
		b = new Button("OK");
		add(b);
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae){
		dispose();
	}
}


public class DialogEx extends Frame implements ActionListener{
	MenuBar mb;
	Menu file, help;
	MenuItem open, save, exit, about;
	TextArea ta;
	TextField txt;
	
    public DialogEx() {
    	setBounds(100, 100, 400, 300);
    	
    	mb = new MenuBar();
    	setMenuBar(mb);
    	file = new Menu("File");
    	mb.add(file);
    	open = new MenuItem("Open");
    	open.addActionListener(this);
    	file.add(open);
    	save = new MenuItem("Save");
    	save.addActionListener(this);
    	file.add(save);
    	
    	exit = new MenuItem("Exit");
    	exit.addActionListener(this);
    	file.add(exit);
    	help = new Menu("Help");
    	mb.add(help);
    	about = new MenuItem("About");
    	about.addActionListener(this);
    	help.add(about);
    	setVisible(true);
    	
    	ta = new TextArea();
    	add(ta, BorderLayout.CENTER);
    	txt = new TextField();
    	add(txt, BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource()==exit)
    		System.exit(0);
    	else if(ae.getSource()==open){
    		FileDialog fd = new FileDialog(this, "Load", FileDialog.LOAD);
    		fd.setVisible(true);
    		System.out.println(fd.getFile()+" " +fd.getDirectory());
    	} else if(ae.getSource()==save){
    		FileDialog fd = new FileDialog(this, "Save", FileDialog.SAVE);
    		System.out.println(fd.getFile()+" " +fd.getDirectory());
    		fd.setVisible(true);
    		
    	}
    	System.out.println(ae.getActionCommand());
    }
    
    public static void main(String[] args){
    	new DialogEx();
    }
}