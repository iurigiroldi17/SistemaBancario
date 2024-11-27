import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaBancario {
    private JPanel SistemaBancario;
    private JButton btnLimpar;
    private JButton btnRealizarDeposito;
    private JButton btnRealizarSaque;
    private JTextField a500TextField;
    private JTextField tfValorSaque;
    private JTextField tfValorDeposito;


    public SistemaBancario() {


        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               btnLimpar.setText("Limpar");
            }
        });
        btnRealizarDeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnRealizarDeposito.setText("Realizar Deposito");
            }
        });
        btnRealizarSaque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnRealizarSaque.setText("");
            }
        });
        tfValorSaque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfValorSaque.setText("");
            }
        });
        tfValorDeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfValorDeposito.setText("");
            }
        });
        a500TextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a500TextField.setText("500");
            }
        });
    }

    private void SistemaBancario() {
        double valorSaque = Double.parseDouble(tfValorSaque.getText());
        if (valorSaque >= 0 && valorSaque <= 500);
    }

    private void SistemaBancarioo() {
        double valorDeposito = Double.parseDouble(tfValorDeposito.getText());
        if (valorDeposito >= 0 && valorDeposito <= 1000);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("SistemaBancario");
        frame.setContentPane(new SistemaBancario().SistemaBancario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
