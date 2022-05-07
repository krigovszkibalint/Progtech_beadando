import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MainWindow extends JDialog{
    private JPanel mainPanel;
    private JList listCarsProduced;
    private JPanel headerPanel;
    private JPanel carsProducedPanel;
    private JPanel settingsPanel;
    private JComboBox cbTypeProduce;
    private JTextField tfCountProduce;
    private JTextField tfDelayProduce;
    private JButton btnProduce;
    private JButton btnLogout;
    private JButton btnClear;
    private JLabel lblCarsProduced;

    public MainWindow(JFrame parent) {
        super(parent);
        setTitle("Autók gyártása");
        setContentPane(mainPanel);
        setMinimumSize(new Dimension(600, 600));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cbTypeProduce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Tesla Model 3",
                "Tesla Model 3 Performance",
                "Toyota Celica",
                "Toyota Celica TS" }));
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm = new LoginForm(null);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfCountProduce.setText("");
                tfDelayProduce.setText("");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(null);
    }
}
