package desafio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){


        Colaborador colaborador = new Colaborador(1000);


        if (colaborador.getSalario() <= 280){
            colaborador.setReajuste(0.2);
        }else if (colaborador.getSalario()< 700){
            colaborador.setReajuste(0.15);
        } else if (colaborador.getSalario() <1500){
            colaborador.setReajuste(0.1);
        }else if ( colaborador.getSalario() >=1500){
            colaborador.setReajuste(0.05);
        }

        System.out.println(colaborador.getReajuste());

        System.out.println(colaborador);

    }
}
