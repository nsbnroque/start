package desafio1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args){

        double salario;
        double percentual;

        Scanner sc = new Scanner(System.in);

        salario = sc.nextDouble();
        if (salario >0 && salario <= 280){
            percentual = 0.2;
        }else if (salario < 700){
            percentual = 0.15;
        } else if (salario < 1500){
            percentual = 0.1;
        }else if ( salario >=1500){
            percentual = 0.05;
        }else{
            System.out.println("Valor inválido.");
            percentual = 0;
        }

        double novoSalario = (salario*percentual) + salario;

        System.out.println("Salário atual: " + salario +
                "\n Percentual do reajuste: " + percentual +
                "\n Valor do reajuste: "+ (salario*percentual) +
                "\n Novo salário: " + novoSalario);
    }
}
