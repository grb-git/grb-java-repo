import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame{
    JTree tree;

    public JTreeDemo(){
        super("JTree Demo");
        setBounds(100, 100, 400, 300);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Java GUI");
        
        DefaultMutableTreeNode awt = new DefaultMutableTreeNode("AWT Controls");
        root.add(awt);
        DefaultMutableTreeNode label = new DefaultMutableTreeNode("Label");
        awt.add(label);
        DefaultMutableTreeNode textfield = new DefaultMutableTreeNode("TextField");
        awt.add(textfield);
        DefaultMutableTreeNode button = new DefaultMutableTreeNode("Button Control");
        awt.add(button);

        DefaultMutableTreeNode swing = new DefaultMutableTreeNode("Swing Controls");
        root.add(swing);
        DefaultMutableTreeNode jlabel = new DefaultMutableTreeNode("JLabel");
        swing.add(jlabel);
        DefaultMutableTreeNode jtextfield = new DefaultMutableTreeNode("JTextField");
        swing.add(jtextfield);
        DefaultMutableTreeNode jbutton = new DefaultMutableTreeNode("JButton Control");
        swing.add(jbutton);
        
        tree = new JTree(root);
        JScrollPane jsp = new JScrollPane(tree);
        add(jsp);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTreeDemo();
    }
}
