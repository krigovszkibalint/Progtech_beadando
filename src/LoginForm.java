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
    public User user;

    // User autentikáció
    private User getAuthenticatedUser(String username, String password) {
        User user = null;

        // DB kapcsolat
        final String DB_URL = "jdbc:mysql://localhost/progtech_beadando";
        final String USERNAME = "root";
        final String PASSWORD = "";

        // Felhasználó adatainak lekérdezése
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.username = resultSet.getString("username");
                user.email = resultSet.getString("email");
                user.password = resultSet.getString("password");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm(null);
    }
}
