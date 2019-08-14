package net.maromo;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public int sacar(double valor) {
        saldo = saldo - valor;
        if (saldo < 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public void depositar(double valor) {
         saldo = saldo + valor;
    }
    public void imprimir() {
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nome do Cliente = " + nomeCliente);
    }
}