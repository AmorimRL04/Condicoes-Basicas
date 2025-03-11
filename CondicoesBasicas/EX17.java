package Exercicios.CondicoesBasicas;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX17 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Escreva um programa que pergunte a velocidade de um carro." +
                "\nCaso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário" +
                "\nfoi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por" +
                "\ncada Km acima da velocidade permitida.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("PT", "BR");

        JOptionPane.showMessageDialog(null, "2ºPasso - Definir a velocidade máxima permitida e do valor da multa por km excedido");
        int VELOCIDADE_MAXIMA = 80;
        int MULTA_POR_KM = 5;

        JOptionPane.showMessageDialog(null, "3ºPasso - Solicitar que o usuário digite a velocidade do carro");
        int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do carro (Km/h):"));

        JOptionPane.showMessageDialog(null, "4ºPasso - Verificar a velocidade e calcular a multa");
        if (velocidade > VELOCIDADE_MAXIMA) {
            int excesso = velocidade - VELOCIDADE_MAXIMA;
            int valorMulta = excesso * MULTA_POR_KM;

            JOptionPane.showMessageDialog(null, "5ºPasso - Em caso de multa, exibir a velocidade registrada, o limite permitido quanto excedeu e o valor da multa.");
            JOptionPane.showMessageDialog(null, "Você foi multado!" +
                    "\nVelocidade registrada: " + velocidade + " Km/h\n" +
                    "\nLimite permitido: " + VELOCIDADE_MAXIMA + " Km/h\n" +
                    "\nExcesso: " + excesso + " Km\n" +
                    "\nValor da multa: " + NumberFormat.getCurrencyInstance(Brasil).format(valorMulta) + ".");
        } else {
            JOptionPane.showMessageDialog(null, "5ºPasso - Caso não haja multa, exibir uma mensagem que a velocidade está dentro do limite permitido");
            JOptionPane.showMessageDialog(null, "Velocidade dentro do limite permitido. Boa viagem!");
        }
    }
}
