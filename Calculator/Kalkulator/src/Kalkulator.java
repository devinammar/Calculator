import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private JTextField tfBilanganPertama;
    private JTextField tfBilanganKedua;
    private JTextField tfHasil;
    private JButton Tambah;
    private JButton Kurang;
    private JButton Kali;
    private JButton Bagi;
    private JButton Persen;
    private JPanel Kalkulator;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Kalkulator");
        frame.setContentPane(new Kalkulator().Kalkulator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Kalkulator() {
        Tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(tfBilanganPertama.getText());
                    double angka2 = Double.parseDouble(tfBilanganKedua.getText());
                    double hasil = angka1 + angka2;
                    tfHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Kurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(tfBilanganPertama.getText());
                    double angka2 = Double.parseDouble(tfBilanganKedua.getText());
                    double hasil = angka1 - angka2;
                    tfHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Kali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(tfBilanganPertama.getText());
                    double angka2 = Double.parseDouble(tfBilanganKedua.getText());
                    double hasil = angka1 * angka2;
                    tfHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Bagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(tfBilanganPertama.getText());
                    double angka2 = Double.parseDouble(tfBilanganKedua.getText());
                    if (angka2 == 0) {
                        JOptionPane.showMessageDialog(null, "Tidak bisa membagi dengan nol.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        double hasil = angka1 / angka2;
                        tfHasil.setText(String.valueOf(hasil));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Persen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double angka1 = Double.parseDouble(tfBilanganPertama.getText());
                    double angka2 = Double.parseDouble(tfBilanganKedua.getText());
                    double hasil = (angka1 / angka2) * 100;
                    tfHasil.setText(String.valueOf(hasil) + "%");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
