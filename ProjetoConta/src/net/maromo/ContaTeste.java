package net.maromo;

import java.util.Scanner;



public class ContaTeste {
 public Conta cc = new Conta();
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTeste teste = new ContaTeste();
        int op=0;
        do {
            System.out.println(" Escolha uma opção: ");
            System.out.println(" 1.. para a opção sacar");
            System.out.println("2.. para a opção depositar");
            System.out.println("3.. para a opção consultar");
            System.out.println("4.. para a opção cadastrar");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    teste.execSacar();
                    break;
                case 2:
                    teste.execDepositar();
                case 3:
                    teste.execConsultar();
                case 4:
                    teste.execCadastrar();
            }
        }
        while(op!=9);
    }

    public void execCadastrar() {
        System.out.println("Digite o número da conta: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite o número da agência: ");
        cc.agencia = sc.nextLine();
        System.out.println("Digite o saldo: ");
        cc.saldo = Double.parseDouble(sc.nextLine());
        System.out.println("Digite seu nome: ");
        cc.nomeCliente = sc.nextLine();
    }
    public void execConsultar() {
        cc.imprimir();
    }

    public void execSacar() {
        double valor;
        System.out.println("Entre com um valor: ");
        valor = Double.parseDouble(sc.nextLine());
        cc.sacar(valor);
        if(cc.saldo == 1){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saque não realizado");
        }
    }
    public void execDepositar() {
        double valor;
        System.out.println("Deposite um valor: ");
        valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
    }
}
