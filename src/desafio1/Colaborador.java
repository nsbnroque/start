package desafio1;

public class Colaborador {


    private double salario;
    private double reajuste;


    private double aumento;

    Colaborador(double salario) {
        this.salario = salario;
    }

    public double calcularReajuste(double salario) {
        return this.salario*this.reajuste;
    }

    //Getters and setters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    @Override
    public String toString(){
        return "Salario atual: "+ getSalario()+"" +
                "\nPercentual do Reajuste:"+getReajuste() +
                "\n Valor do aumento: " +getAumento();
    }



}
