import javax.swing.*;

public class JTableDemo extends JFrame{
    public JTableDemo(){
        super("JTree Demo");
        setBounds(100, 100, 400, 300);

        String[][] data = {
            {"E001", "Mohan", "20000"}, 
            {"E002", "Hari", "10000"},
            {"E003", "Kumar", "30000"},
            {"E004", "Sravan", "50000"},
            {"E005", "Hemanth", "40000"}
        };

        String header[] = {"Employee ID", "Employee Name", "Salary"};

        JTable jt = new JTable(data, header);
        JScrollPane jsp = new JScrollPane(jt);
        add(jsp);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}
