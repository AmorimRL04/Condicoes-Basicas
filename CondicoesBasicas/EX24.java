package Exercicios.CondicoesBasicas;

import javax.swing.*;

public class EX24 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX24 - Faça um algoritmo que pergunte a distância que um" +
                "\npassageiro deseja percorrer em Km. Calcule o preço da" +
                "\npassagem, cobrando R$0.50 por Km para viagens até 200Km e" +
                "\nR$0.45 para viagens mais longas.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao usuário a distância desejada para a viagem.");
        String distanciaStr = JOptionPane.showInputDialog("Digite a distância em Km que deseja percorrer:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato americano, caso seja digitado com vírgula.");
        distanciaStr = distanciaStr.replace(',', '.');
        double distancia = Double.parseDouble(distanciaStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar o preço da passagem com base na distância.");
        double preco;

        if (distancia <= 200) {
            JOptionPane.showMessageDialog(null, "3º Passo - Se a distância for menor ou igual a 200 Km, aplica o preço de R$0,50 por Km");
            preco = distancia * 0.50;
        } else {
            JOptionPane.showMessageDialog(null, "3º Passo - Caso contrário, se a distância for maior que 200 Km");
            preco = distancia * 0.45;
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir o preço da passagem com base na distância.");
        JOptionPane.showMessageDialog(null, "Distância: " + distancia + " Km\nPreço da passagem: R$ " + String.format("%.2f", preco));
    }
}
