// FrameDemo1
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;

/*public class FrameDemo1 extends JFrame{
    public FrameDemo1(){
        super("Frame Demo");
    }

    public static void main(String args[]){
        JFrame f=new FrameDemo1();
        f.setSize(500,300);
         f.setLocation(300,300);
        f.setVisible(true);
       
    }

}*/

//BLDemo2.java
public class BLDemo2 extends JFrame implements ActionListener{
    JButton nb,eb,sb,wb,cb;
    public BLDemo2(){
        super("BorderLayout Demo");
        nb=new JButton("north");
         eb=new JButton("east");
          sb=new JButton("south");
           wb=new JButton("west");
          cb=new JButton("center");
    

    getContentPane().add(nb,BorderLayout.NORTH);
     getContentPane().add(eb,BorderLayout.EAST);
      getContentPane().add(sb,BorderLayout.SOUTH);
      getContentPane().add(wb,BorderLayout.WEST);

       getContentPane().add(cb,BorderLayout.CENTER);

       nb.addActionListener(this);
        sb.addActionListener(this);
         eb.addActionListener(this);
          wb.addActionListener(this);
           cb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==nb)
            JOptionPane.showMessageDialog(this, "North button clicked");
        else if(ae.getSource()==sb)
            JOptionPane.showMessageDialog(this,"South button clicked" );
        else if(ae.getSource()==eb)
            JOptionPane.showMessageDialog(this,"east button clicked" );
        else if(ae.getSource()==wb)
            JOptionPane.showMessageDialog(this,"west button clicked" );
        else 
        JOptionPane.showMessageDialog(this,"Center button clicked" );

    }
    public static void main(String args[]){
        JFrame f=new BLDemo2();
        f.setSize(500,300);
         f.setLocation(300,300);
        f.setVisible(true);
       
    }


}