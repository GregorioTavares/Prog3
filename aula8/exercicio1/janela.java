package exercicio1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class janela extends JFrame {
    public janela(){
        this.setTitle("Primeira janela");
        this.setSize(800, 600);
        this.setLocation(0, 0);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.green);

        this.setLayout(new FlowLayout(FlowLayout.LEFT, 370, 280));

        JButton btnFechar = new JButton("Fechar");
        this.add(btnFechar);


        // Ação do botão
        btnFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // fecha a janela
            }
        });

        // Adicionando o botão à janela
        this.add(btnFechar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        janela janela1 = new janela();
        janela1.setVisible(true);
    }
}
