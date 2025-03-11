package Exercicios.CondicoesBasicas;

import javax.swing.*;

public class EX23 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX23 - Numa promoção exclusiva para o Dia da Mulher, uma loja quer" +
                "\ndar descontos para todos, mas especialmente para mulheres. Faça" +
                "\num programa que leia nome, sexo e o valor das compras do cliente" +
                "\ne calcule o preço com desconto. Sabendo que:" +
                "\n• Homens ganham 5% de desconto" +
                "\n• Mulheres ganham 13% de desconto");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar o nome do cliente.");
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar o sexo do cliente.");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):").toUpperCase();

        JOptionPane.showMessageDialog(null, "3º Passo - Validar o sexo do cliente.");
        if (!sexo.equals("M") && !sexo.equals("F")) {
            JOptionPane.showMessageDialog(null, "Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
            return;
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Solicitar o valor das compras.");
        double valorCompras = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das suas compras:"));

        JOptionPane.showMessageDialog(null, "5º Passo - Verificar se o valor das compras é maior que 0.");
        if (valorCompras <= 0) {
            JOptionPane.showMessageDialog(null, "O valor das compras deve ser positivo. Tente novamente.");
            return;
        }

        JOptionPane.showMessageDialog(null, "6º Passo - Guardar a variável desconto.");
        double desconto = 0;

        JOptionPane.showMessageDialog(null, "7º Passo - Verificar o sexo do cliente e calcular o desconto.");

        if (sexo.equals("M")) {
            JOptionPane.showMessageDialog(null, " 7º Passo - Se o sexo for 'M' (masculino), o desconto será 5%.");
            desconto = 5;

        } else if (sexo.equals("F")) {
            JOptionPane.showMessageDialog(null, " 7º Passo - Se o sexo for 'F' (feminino), o desconto será 13%.");
            desconto = 13;
        }

        JOptionPane.showMessageDialog(null, "8º Passo - Calcular o desconto obtido.");
        double valorDesconto = valorCompras * (desconto / 100);
        double valorFinal = valorCompras - valorDesconto;

        JOptionPane.showMessageDialog(null, "9º Passo - Exibir o nome, o valor original, o desconto e o valor final.");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor das Compras: R$ " + valorCompras + "\nDesconto: " + desconto + "%" +
                "\nValor com Desconto: R$ " + String.format("%.2f", valorFinal));
    }
}
