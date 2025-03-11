package Exercicios.CondicoesBasicas;

import javax.swing.*;
import java.time.LocalDate;

public class EX22 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX22 - Escreva um programa que leia o ano de nascimento de um rapaz e\n" +
                "\nmostre a sua situação em relação ao alistamento militar." +
                "\n• Se estiver antes dos 18 anos, mostre em quantos anos" +
                "\nfaltam para o alistamento." +
                "\n• Se já tiver depois dos 18 anos, mostre quantos anos já" +
                "\nse passaram do alistamento.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao usuário que digite o ano de nascimento.");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento:"));

        JOptionPane.showMessageDialog(null, "2º Passo - Calcular a idade do rapaz.");
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar a situação do alistamento militar.");
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "4º Passo (a) - Se a idade for menor que 18, calcular quantos anos faltam para o alistamento.");
            int anosFaltando = 18 - idade;
            JOptionPane.showMessageDialog(null, "Ainda faltam " + anosFaltando + " ano(s) para o alistamento.");
        } else if (idade == 18) {
            JOptionPane.showMessageDialog(null, "4º Passo (b) - Se a idade for exatamente 18, informar que é o ano do alistamento.");
            JOptionPane.showMessageDialog(null, "Você tem 18 anos, é o ano do seu alistamento.");
        } else {
            JOptionPane.showMessageDialog(null, "4º Passo (c) - Se a idade for maior que 18, calcular quantos anos já passaram do alistamento.");
            int anosPassados = idade - 18;
            JOptionPane.showMessageDialog(null, "Você já passou " + anosPassados + " ano(s) do seu alistamento.");
        }
    }
}
