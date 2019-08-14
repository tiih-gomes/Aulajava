package net.maromo;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("A marca é = " + marca);
        System.out.println("A cor é = " + cor);
        System.out.println("O modelo é = " + modelo);
        System.out.println("O numero da Serie é = " + numeroSerie);
        System.out.println("O preço é = " + preco);
    }
    public void calcularValor(){
        if(marca.equals("hp")) {
            preco *= 1.3;
            return;
        }
         if(marca.equals("ibm")){
                preco *= 1.5;
        }
    }

    public int alterarValor(double valor){

        if(valor > 0){
            return 1;
        }else{
            return 0;
        }
    }
}
