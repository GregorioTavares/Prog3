package exercicio3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JanelaCalculadora extends JFrame {

    public JanelaCalculadora() {
        setTitle("Calculadora");
        setSize(350, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        // Campos de números
        JTextField txtNum1 = new JTextField(10);
        JTextField txtNum2 = new JTextField(10);

        // ComboBox de operações
        String[] operacoes = { "Somar", "Subtrair", "Multiplicar", "Dividir" };
        JComboBox<String> cbOperacoes = new JComboBox<>(operacoes);

        // CheckBox
        JCheckBox chkPopup = new JCheckBox("Mostrar resultado em popup");

        // Label para resultado na tela
        JLabel lblResultado = new JLabel("Resultado: ");

        // Botão Calcular
        JButton btnCalcular = new JButton("Calcular");

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(txtNum1.getText());
                    double n2 = Double.parseDouble(txtNum2.getText());
                    double resultado = 0;

                    String operacao = cbOperacoes.getSelectedItem().toString();

                    switch (operacao) {
                        case "Somar":
                            resultado = n1 + n2;
                            break;
                        case "Subtrair":
                            resultado = n1 - n2;
                            break;
                        case "Multiplicar":
                            resultado = n1 * n2;
                            break;
                        case "Dividir":
                            if (n2 == 0) {
                                JOptionPane.showMessageDialog(
                                    null,
                                    "Não é possível dividir por zero",
                                    "Erro",
                                    JOptionPane.ERROR_MESSAGE
                                );
                                return;
                            }
                            resultado = n1 / n2;
                            break;
                    }

                    if (chkPopup.isSelected()) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Resultado: " + resultado
                        );
                    } else {
                        lblResultado.setText("Resultado: " + resultado);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Digite apenas números válidos",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        // Adicionando componentes
        add(new JLabel("Número 1:"));
        add(txtNum1);

        add(new JLabel("Número 2:"));
        add(txtNum2);

        add(cbOperacoes);
        add(chkPopup);
        add(btnCalcular);
        add(lblResultado);
    }

    public static void main(String[] args) {
        new JanelaCalculadora().setVisible(true);
    }
}
