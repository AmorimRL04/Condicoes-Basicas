package Exercicios.CondicoesBasicas;

import javax.swing.*;

public class EX19 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX19 - Crie um algoritmo que leia o nome e as duas notas de um aluno," +
                "\ncalcule a sua média e mostre na tela. No final, analise a média e" +
                "\nmostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicitar o nome do aluno.");
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");

        JOptionPane.showMessageDialog(null, "2ºPasso - Solicitar as duas notas do aluno.");
        String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota do aluno:");
        String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota do aluno:");

        JOptionPane.showMessageDialog(null, "3ºPasso -  Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        nota1Str = nota1Str.replace(",", ".");
        nota2Str = nota2Str.replace(",", ".");
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);

        JOptionPane.showMessageDialog(null, "4ºPasso - Calcular a média das notas.");
        double media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "5ºPasso - Verificar se a média é superior a 7.0 para avaliar o aproveitamento.");
        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "6ºPasso - Exibir o nome, a média e o resultado da avaliação.");
            JOptionPane.showMessageDialog(null, "Aluno: " + nomeAluno + "\nMédia: " + media + "\nAproveitamento: Bom");
        } else {
            JOptionPane.showMessageDialog(null, "6ºPasso - Exibir o nome, a média e o resultado da avaliação.");
            JOptionPane.showMessageDialog(null, "Aluno: " + nomeAluno + "\nMédia: " + media + "\nAproveitamento: Ruim");
        }
    }
}
