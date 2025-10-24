import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleEmployeeForm extends JFrame implements ActionListener {
    JTextField nameField, idField, deptField;
    JButton submitButton;
    JTextArea outputArea;

    SimpleEmployeeForm() {
        setTitle("Employee Information Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        nameField = new JTextField(20);
        add(nameField);

        add(new JLabel("Employee ID:"));
        idField = new JTextField(20);
        add(idField);

        add(new JLabel("Department:"));
        deptField = new JTextField(20);
        add(deptField);

        submitButton = new JButton("Submit");
        add(submitButton);
        submitButton.addActionListener(this);

        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String id = idField.getText();
        String dept = deptField.getText();

        outputArea.setText("Employee Details:\n");
        outputArea.append("-------------------------\n");
        outputArea.append("Name: " + name + "\n");
        outputArea.append("Employee ID: " + id + "\n");
        outputArea.append("Department: " + dept + "\n");
    }

    public static void main(String[] args) {
        new SimpleEmployeeForm();
    }
}