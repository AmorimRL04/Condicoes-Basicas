package Exercicios.CondicoesBasicas;

import javax.swing.*;

public class EX21 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX21 - Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao usuário que digite um ano.");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano:"));

        JOptionPane.showMessageDialog(null, "2º Passo - Verificar se o ano é bissexto.");
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "3º Passo - Se o ano for bissexto, exibir a mensagem correspondente.");
            JOptionPane.showMessageDialog(null, "O ano " + ano + " é BISSEXTO.");
        } else {
            JOptionPane.showMessageDialog(null, "3º Passo - Se o ano não for bissexto, exibir a mensagem correspondente.");
            JOptionPane.showMessageDialog(null, "O ano " + ano + " não é BISSEXTO.");
        }
    }
}
