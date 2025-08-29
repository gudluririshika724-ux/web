import javax.swing.*;
public class Swingexample 
{
    JFrame f;
    JLabel lb1;
    JTextField t1;
    JButton b1;
    JPanel p;
    Swingexample()
    {
        f=new JFrame("hello swing");
        lb1=new JLabel("enter your name:");
        t1=new JTextField(20);
        b1=new JButton("OK");
        p=new JPanel();
        p.add(lb1);
        p.add(t1);
        p.add(b1);
        f.add(p);
        f.setSize(500,800);
        f.setLocation(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        b1.addActionListener(e->show());
    }
    public void show()
    {
        String s=t1.getText();
        int i=0,j=s.length()-1;
        String msg="Palindrome";
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                msg=" Not a Palindrome";
                break;
            }
            i++;
            j--;
        }

        JOptionPane.showMessageDialog(null,"hello "+msg);
    }
    public static void main(String[] args)
    {
        new Swingexample();
    }

}