/*import javax.swing.*;
import java.awt.*;

public class ncrSwingprac {
    JFrame f;
    JPanel p;
    JLabel lb1, lb2, re, output;
    JTextField t1, t2;
    JButton b1;

    

    ncrSwingprac() {
        f = new JFrame("nCr Calculator");
        p = new JPanel();
        p.setLayout(new GridLayout(4, 2));

        lb1 = new JLabel("Enter n (total items):");
        lb2 = new JLabel("Enter r (selected items):");
        re = new JLabel("Result:");
        output = new JLabel("");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Calculate nCr");

        p.add(lb1);
        p.add(t1);
        p.add(lb2);
        p.add(t2);
        
        p.add(re);
        p.add(output);
        p.add(b1);

        f.add(p);
        f.setSize(300, 400);
        f.setLocation(300, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        b1.addActionListener(e -> ncr_calculation());
    }

    public void ncr_calculation() {
        try {
            int n = Integer.parseInt(t1.getText());
            int r = Integer.parseInt(t2.getText());

            if (r > n || n < 0 || r < 0) {
                output.setText("Invalid input!");
                return;
            }

            int ncr = fact(n) / (fact(r) * fact(n - r));
            output.setText(String.valueOf(ncr));

        } catch (NumberFormatException e) {
            output.setText("Enter valid numbers!");
        }
    }

    public static int fact(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
        }
        return p;
    }

    public static void main(String[] args) {
        new ncrSwingprac();
    }
}*/

// to handle large values we use big integer.
import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class ncrSwingprac {
    JFrame f;
    JPanel p;
    JLabel lb1, lb2, re, output;
    JTextField t1, t2;
    JButton b1;

    ncrSwingprac() {
        f = new JFrame("nCr Calculator");
        p = new JPanel();
        p.setLayout(new GridLayout(4, 2));

        lb1 = new JLabel("Enter n (total items):");
        lb2 = new JLabel("Enter r (selected items):");
        re = new JLabel("Result:");
        output = new JLabel("");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Calculate nCr");

        p.add(lb1);
        p.add(t1);
        p.add(lb2);
        p.add(t2);
        p.add(b1);
        p.add(re);
        p.add(output);

        f.add(p);
        f.setSize(400, 200);
        f.setLocation(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        b1.addActionListener(e -> ncr_calculation());
    }

    public void ncr_calculation() {
        try {
            int n = Integer.parseInt(t1.getText());
            int r = Integer.parseInt(t2.getText());

            if (r > n || n < 0 || r < 0) {
                output.setText("Invalid input!");
                return;
            }

            BigInteger ncr = fact(n).divide(fact(r).multiply(fact(n - r)));
            output.setText(ncr.toString());

        } catch (NumberFormatException e) {
            output.setText("Enter valid numbers!");
        }
    }

    public static BigInteger fact(int n) {
        BigInteger p = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            p = p.multiply(BigInteger.valueOf(i));
        }
        return p;
    }

    public static void main(String[] args) {
        new ncrSwingprac();
    }
}


       
