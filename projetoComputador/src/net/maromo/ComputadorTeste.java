package net.maromo;

import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
        Computador computador = new Computador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca do computador");
        computador.marca = sc.nextLine();
        System.out.println("Digite a cor: ");
        computador.cor = sc.nextLine();
        System.out.println("Digite o modelo: ");
        computador.modelo = sc.nextLine();
        System.out.println("Digite o numero da serie: ");
        computador.numeroSerie = Long.parseLong(sc.nextLine());
        System.out.println("Digite o preco: ");
        computador.preco = Double.parseDouble(sc.nextLine());
        computador.calcularValor();
        computador.imprimir();
    }
}
