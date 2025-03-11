package Exercicios.CondicoesBasicas;

import javax.swing.*;

public class EX20 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX20 - Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.");

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário que digite um número inteiro.");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar se o número é par ou ímpar");
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "4º Passo - Se o número for par, exibir a mensagem correspondente");
            JOptionPane.showMessageDialog(null, "O número " + numero + " é PAR.");
        } else {
            JOptionPane.showMessageDialog(null, "4º Passo - Se o número for impar, exibir a mensagem correspondente");
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ÍMPAR.");
        }
    }
}
