package desafio3;

public class Pessoa {
        //Atributos
        private int idade;
        private double peso;
        private double altura;

        //Construtor

        public Pessoa(int idade, double peso, double altura){
            super();
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
        }




        //Metodos

        //Getters and Setters
        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }


    }

