package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);//centralizar na tela

        JButton botao = new JButton("Clicar!");
        janela.add(botao);
        botao.addActionListener(new ActionListener() {
            public int cont=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                cont++;
                System.out.println(cont);
            }
        });
        janela.setVisible(true);
    }
}
