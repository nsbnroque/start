package desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*3. Faça um programa que receba cinco idades, pesos e Alturas e que calcule
e mostre:
• A média das idades das dez pessoas;
• A quantidade de pessoas com peso superior a 90 quilos e altura inferior
a 1,50;
• A porcentagem de pessoas com idade entre 10 e 30 anos entre as
pessoas que medem mais de 1,90; (vale 2 pontos)*/
public class App {

    public static void main(String[] args){

        List<Integer> idades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //idades
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite cinco idades:");
            int numero = sc.nextInt();
            idades.add(numero);
        }


    }

}
