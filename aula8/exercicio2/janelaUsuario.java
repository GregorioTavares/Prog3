package exercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class janelaUsuario extends JFrame {

    public janelaUsuario() {
        setTitle("Login");
        setSize(300, 180);
        setLocationRelativeTo(null); // centraliza
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        // Label e campo do usuário
        JLabel lblUsuario = new JLabel("Usuário:");
        JTextField txtUsuario = new JTextField(15);

        // Label e campo da senha
        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField(15);

        // Botão Entrar
        JButton btnEntrar = new JButton("Entrar");

        // Ação do botão
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();

                JOptionPane.showMessageDialog(
                    null,
                    "Bem-vindo, " + usuario + "!",
                    "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        // Adicionando componentes
        add(lblUsuario);
        add(txtUsuario);
        add(lblSenha);
        add(txtSenha);
        add(btnEntrar);
    }

    public static void main(String[] args) {
        new janelaUsuario().setVisible(true);
    }
}

