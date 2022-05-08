import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class MainWindow extends JDialog{

    DefaultListModel<String> model;
    int producedCar;

    private JPanel mainPanel;
    private JList<String> listCarsProduced;
    private JPanel headerPanel;
    private JPanel carsProducedPanel;
    private JPanel settingsPanel;
    private JComboBox<String> cbTypeProduce;
    private JTextField tfCountProduce;
    private JTextField tfDelayProduce;
    private JButton btnProduce;
    private JButton btnLogout;
    private JButton btnClear;
    private JLabel lblCarsProduced;
    private JScrollPane jScrollPane;
    private JLabel lblProduced;
    private JButton btnListClear;

    public MainWindow(JFrame parent) {
        super(parent);
        setTitle("Autók gyártása");
        setContentPane(mainPanel);
        setMinimumSize(new Dimension(800, 600));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        model = new DefaultListModel<>();
        listCarsProduced = new JList(model);
        listCarsProduced.setModel(model);
        listCarsProduced.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane.setViewportView(listCarsProduced);

        producedCar = 0;
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

        btnProduce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                final int produceDelay = tfDelayProduce.getText() != "" ? Integer.parseInt(tfDelayProduce.getText()) : 0;
                final int produceCount = tfCountProduce.getText() != "" ? Integer.parseInt(tfCountProduce.getText()) : 0;
                final int produceType = cbTypeProduce.getSelectedIndex();
                System.out.println(produceType);

                if(produceDelay > 0 && produceCount > 0) {
                    java.util.Timer timer = new Timer();
                    timer.schedule(new TimerTask() {

                        int amount = produceCount;
                        Factory factory = null;

                        @Override
                        public void run() {

                            switch(produceType) {
                                case 0: factory = new TeslaFactory(); break;
                                case 1: factory = new TeslaModel3Factory(); break;
                                case 2: factory = new ToyotaFactory(); break;
                                case 3: factory = new ToyotaCelicaTSFactory(); break;
                            }

                            if(factory != null && amount >= 1) {
                                Car newCar = factory.Make();
                                model.add(0, producedCar+". "+newCar.Info());

                                producedCar++;
                                lblProduced.setText(Integer.toString(producedCar));

                                amount--;
                            } else {
                                timer.cancel();
                            }
                        }
                    }, produceDelay, produceDelay);
                }
            }
        });
            btnListClear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultListModel model = (DefaultListModel) listCarsProduced.getModel();
                    model.removeAllElements();
                    lblProduced.setText("0");
                }
            });
        setVisible(true);
    }
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(null);
    }
}
