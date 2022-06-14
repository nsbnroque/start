package desafio4;
/*Escreva um programa que pergunte o dia, mês e ano do aniversário de uma
pessoa e diga se a data é válida ou não. Caso não seja, diga o motivo.
Suponha que todos os meses têm 31 dias e que estejamos no ano de 2000.
Caso a data esteja correta imprima “Data válida”. (vale 2 pontos)*/

import javax.swing.*;

public class App{
    public static void main(String[] args){
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu aniversario: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu aniversário: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu aniversario: "));

        if (dia > 31 || mes > 12 || ano > 2000){
            System.out.println("Data inválida: " +dia+ "/" +mes+ "/" + ano);

            if (dia >31){
                System.out.println("Dia inválido.");

            }else if (mes >12){
                System.out.println("Mês inválido.");
            } else if(ano >2000){
                System.out.println("Ano inválido.");
            }else{

            }

        } else {
            System.out.println("Data válida: " +dia+ "/" +mes+ "/" + ano);
        }

    }



}
