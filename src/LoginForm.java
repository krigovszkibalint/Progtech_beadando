import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginForm extends JDialog {
    private JPanel mainPanel;
    private JPanel headerPanel;
    private JPanel loginPanel;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin;
    private JButton btnClose;

    public LoginForm(JFrame parent) {
        super(parent);
        setTitle("Bejelentkezés");
        setContentPane(mainPanel);
        setMinimumSize(new Dimension(550, 450));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm(null);
    }
}
