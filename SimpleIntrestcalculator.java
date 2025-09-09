import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener.*;
public class SimpleIntrestcalculator {
    public static void main(String args[]){
        JFrame jf= new JFrame("SimpleIntrestcalculator");
        jf.setLayout(new GridLayout(4,2));

        JLabel l1=new JLabel("principal");
        JTextField t1 = new JTextField("0");

        JLabel l2=new JLabel("time");
        JTextField t2 = new JTextField("0");

        JLabel l3=new JLabel("rate");
        JTextField t3 = new JTextField("0");

        JButton b1=new JButton("calculate");
        JTextField t4 = new JTextField(" ");

        //adding components to grid

        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(t3);
        t4.setEditable(false);
        jf.add(b1);
        jf.add(t4);

        jf.setSize(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        //event registration
        b1.addActionListener (new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae){
                int p=Integer.parseInt(t1.getText());
                int t=Integer.parseInt(t2.getText());
                int r=Integer.parseInt(t3.getText());

                if(p<=0||t<=0||r<=0){
                    JOptionPane.showMessageDialog(jf,"invalid data!" ,"error" ,JOptionPane.ERROR_MESSAGE);
                    return;
                }
                float si=0.0f;
                si=(p*t*r)/100.0f;
                t4.setText(""+si);
            }
        });

        
    }
    
}
