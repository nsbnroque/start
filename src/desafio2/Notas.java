package desafio2;
/*Faça um programa que apresente o menu de opções a seguir:
Menu de opções:

1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar
a média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.*/

import javax.swing.*;

public class Notas {
    public static void main(String[] args){
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:  \n 1-Média aritmética " +
                "\n 2-Média Ponterada \n3-Sair "));


        if(op==1){
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 2:"));
            double mediaAritmetica = (nota1+nota2)/2;

            System.out.println("A média das notas é: " + mediaAritmetica);

        }else if(op==2){
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 1:"));
            double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da nota 1:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 2:"));
            double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da nota 2:"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a Nota 3:"));
            double peso3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso da nota 3:"));

            System.out.println((peso1*nota1+peso2*nota2+peso3*nota3)/(peso1+peso2+peso3));


        }else if(op==3){


        }else{

        }

    }
}
