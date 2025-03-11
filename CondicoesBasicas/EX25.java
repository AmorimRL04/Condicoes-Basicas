package Exercicios.CondicoesBasicas;

import javax.swing.*;

public class EX25 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX25 - [DESAFIO] Crie um programa que leia o tamanho de três segmentos" +
                "\nde reta. Analise seus comprimentos e diga se é possível formar um" +
                "\ntriângulo com essas retas. Matematicamente, para três segmentos" +
                "\nformarem um triângulo, o comprimento de cada lado deve ser menor" +
                "\nque a soma dos outros dois.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o tamanho dos três segmentos.");
        String aStr = JOptionPane.showInputDialog("Digite o comprimento do primeiro segmento:");
        String bStr = JOptionPane.showInputDialog("Digite o comprimento do segundo segmento:");
        String cStr = JOptionPane.showInputDialog("Digite o comprimento do terceiro segmento:");

        JOptionPane.showMessageDialog(null, "2º Passo - Converter os valores para o formato americano, caso seja digitado com vírgula.");
        aStr = aStr.replace(',', '.');
        bStr = bStr.replace(',', '.');
        cStr = cStr.replace(',', '.');
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar se os segmentos podem formar um triângulo.");
        if (a + b > c && a + c > b && b + c > a) {
            JOptionPane.showMessageDialog(null, "4º Passo - Exibir se os segmentos podem formar um triângulo.");
            JOptionPane.showMessageDialog(null, "Os segmentos podem formar um triângulo.");
        } else {
            JOptionPane.showMessageDialog(null, "4º Passo - Exibir se os segmentos podem formar um triângulo.");
            JOptionPane.showMessageDialog(null, "Os segmentos NÃO podem formar um triângulo.");
        }
    }
}
