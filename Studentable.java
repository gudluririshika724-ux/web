import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

// static table in Swings.
public class Studentable {
    public static void main(String[]args){
        JFrame frame =new JFrame("Student table example ");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(500,500);
        String[] columns={"roll no","Name","Branch","Marks"};
        Object[][] data ={
            {"101","Ravi kumar","CSE",85},
            {"102","Anjali","ECE",89}
        };

        DefaultTableModel model = new DefaultTableModel(data,columns);
        JTable table =new JTable(model);
        JScrollPane scrollpane= new JScrollPane(table);
        frame.add(scrollpane,BorderLayout.CENTER);
        frame.setVisible(true);

    }
    
}
