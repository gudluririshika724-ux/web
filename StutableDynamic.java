import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class StutableDynamic {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Table - Add Row Dynamically");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Table setup
        String[] columns = {"Roll No", "Name", "Branch", "Marks"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Input panel
        JPanel inputPanel = new JPanel(new GridLayout(2, 5, 5, 5));

        JTextField rollField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField branchField = new JTextField();
        JTextField marksField = new JTextField();
        JButton addButton = new JButton("Add Student");

        // Labels
        inputPanel.add(new JLabel("Roll No"));
        inputPanel.add(new JLabel("Name"));
        inputPanel.add(new JLabel("Branch"));
        inputPanel.add(new JLabel("Marks"));
        inputPanel.add(new JLabel("")); // empty cell

        // Input fields
        inputPanel.add(rollField);
        inputPanel.add(nameField);
        inputPanel.add(branchField);
        inputPanel.add(marksField);
        inputPanel.add(addButton);

        // Add row action
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String roll = rollField.getText().trim();
                String name = nameField.getText().trim();
                String branch = branchField.getText().trim();
                String marksheet = marksField.getText().trim();

                if (roll.isEmpty() || name.isEmpty() || branch.isEmpty() || marksheet.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int marks = Integer.parseInt(marksheet);
                    model.addRow(new Object[]{roll, name, branch, marks});

                    rollField.setText("");
                    nameField.setText("");
                    branchField.setText("");
                    marksField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Marks must be a number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        // Show window
        frame.setVisible(true);
    }
}
