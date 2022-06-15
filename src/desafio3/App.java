package desafio3;

import java.util.ArrayList;
import java.util.Iterator;
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

        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>() {};

        //Adicionando pessoas na lista
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a idade:");
            int idade = sc.nextInt();
            System.out.println("Digite o peso:");
            double peso = sc.nextDouble();
            System.out.println("Digite a altura:");
            double altura = sc.nextDouble();
            pessoas.add(new Pessoa(idade,peso,altura));
        }

        //A média das idades das dez pessoas;

        Iterator<Pessoa> iterator = pessoas.iterator();

        double soma = 0d;
        while (iterator.hasNext()) {
            Pessoa next = iterator.next();
            soma += next.getIdade();
        }

        System.out.println("A média das idades é: " + soma/pessoas.size());


        //A quantidade de pessoas com peso superior a 90 quilos e altura inferior
        //a 1,50;

        int quantidade = 0;

        while (iterator.hasNext()) {
            Pessoa next = iterator.next();
             if (next.getAltura() < 1.5 && next.getPeso() > 90) quantidade ++;
        }

        System.out.println("Pessoas com peso superior a 90 quilos e altura inferior a 1.5: " + soma/pessoas.size());


        //A porcentagem de pessoas com idade entre 10 e 30 anos entre as
        //pessoas que medem mais de 1,90;

        int count = 0;

        while (iterator.hasNext()) {
            Pessoa next = iterator.next();
            if (next.getIdade() > 10 && next.getIdade() < 30 && next.getAltura() > 1.90) count++;
        }

        System.out.println("A percentagem de pessoas com idade entre 10 e 30 anos que medem mais de 1.90 é: "
                + (count/ pessoas.size())*100);



    }

}
