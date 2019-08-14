package net.maromo;

public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("O nome é = " + nome);
        System.out.println("A equipe é = " + equipe);
        System.out.println("A idade é = " + idade);
    }

    public void separarGrupo(){
        if(idade<=5){
            equipe = ' ';
        }else{
            if(idade<=10){
                equipe = 'A';
            }else{
                if(idade<=20){
                    equipe = 'B';
                }else{
                    equipe = 'C';
                }
            }
        }

    }
}
