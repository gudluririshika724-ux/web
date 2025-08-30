
    
import javax.swing.*;
import java.awt.*;
class Prac{
    JFrame f;
    JPanel p;
    JLabel lb1,lb2, re, output;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    Prac(){
        f = new JFrame("Calculator");
        p = new JPanel();
        p.setLayout(new GridLayout(5,2));
        lb1 = new JLabel("Enter first number:");
        lb2 = new JLabel("Enter second number:");
        re = new JLabel("Result:");
        output = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3=new JButton("multiply");
        b4= new JButton("divide");
        p.add(lb1);
        p.add(t1);
        p.add(lb2);
        p.add(t2);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(re);
        p.add(output);
        
        f.add(p);
        f.setSize(300,400);
        f.setLocation(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        b1.addActionListener(e->add());
        b2.addActionListener(e->subtract());
        b3.addActionListener(e->mul());
        b4.addActionListener(e->divide());
    }
   
       
    
    public void add(){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1 + num2;
        output.setText(String.valueOf(sum));
    }
    public void subtract(){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int diff = num1 - num2;
        output.setText(String.valueOf(diff));
    }
    public void mul(){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int multiply=num1*num2;
         output.setText(String.valueOf(multiply));

    }
    public void divide(){
         int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int div=num1/num2;
         output.setText(String.valueOf(div));


    }
    public static void main(String [] args){
        Prac c1;
        c1=new Prac();
        c1.f.setLocation(100,100);
        
        new Prac();
    }
}