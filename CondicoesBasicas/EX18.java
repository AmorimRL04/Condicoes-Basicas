package Exercicios.CondicoesBasicas;

import javax.swing.*;
import java.util.Calendar;

public class EX18 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX18 - Escreva um programa que leia o ano de nascimento de uma pessoa," +
                "\ncalcule a idade dela e depois mostre se ela pode ou não votar.");

        JOptionPane.showMessageDialog(null, "1ºPasso - Solicitar ao usuário o ano de nascimento.");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));

        JOptionPane.showMessageDialog(null, "2ºPasso - Obter o ano atual.");
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        JOptionPane.showMessageDialog(null, "3ºPasso - Calcular a idade da pessoa.");
        int idade = anoAtual - anoNascimento;

        JOptionPane.showMessageDialog(null, "4ºPasso - Verificar se a pessoa tem idade para votar.");
        if (idade >= 16) {
            JOptionPane.showMessageDialog(null, "5ºPasso - Exibir se a pessoa pode ou não votar.");
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + " anos. Você pode votar!");
        } else {
            JOptionPane.showMessageDialog(null, "5ºPasso - Exibir se a pessoa pode ou não votar.");
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + " anos. Você não pode votar.");
        }
    }
}
