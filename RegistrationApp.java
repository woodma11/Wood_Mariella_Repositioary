import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationInfo().setVisible(true);
            }
        });
    }

    public static class RegistrationInfo extends JFrame {
        private JTextField nameField;
        private JTextField emailField;
        private JPasswordField passwordField;
        private JPasswordField confirmPasswordField;

        public RegistrationInfo() {
            super("User Registration");
            initComponents();
        }

        private void initComponents() {
            JPanel panel = new JPanel(new GridLayout(5, 2, 9, 9));
            panel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

            panel.add(new JLabel("Name:"));
            nameField = new JTextField();
            panel.add(nameField);

            panel.add(new JLabel("Email:"));
            emailField = new JTextField();
            panel.add(emailField);

            panel.add(new JLabel("Password:"));
            passwordField = new JPasswordField();
            panel.add(passwordField);

            panel.add(new JLabel("Confirm Password:"));
            confirmPasswordField = new JPasswordField();
            panel.add(confirmPasswordField);

            JButton submitButton = new JButton("Submit");
            JButton clearButton = new JButton("Clear");

            JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
            buttons.add(submitButton);
            buttons.add(clearButton);

            panel.add(new JLabel());
            panel.add(buttons);

            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    onSubmit();
                }
            });

            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    onClear();
                }
            });

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setContentPane(panel);
            pack();
            setLocationRelativeTo(null);
        }

        private void onSubmit() {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());
            String confirm = new String(confirmPasswordField.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please fill in all fields.",
                        "Missing Information",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!password.equals(confirm)) {
                JOptionPane.showMessageDialog(this,
                        "Passwords do not match, please re-enter.",
                        "Password Mismatch",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            String message = "Registration Successful!\n\n"
                    + "Name: " + name + "\n"
                    + "Email: " + email + "\n"
                    + "Password: " + password;

            JOptionPane.showMessageDialog(this,
                    message,
                    "Registration",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        private void onClear() {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
        }
    }
}

