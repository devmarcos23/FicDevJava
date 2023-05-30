
package desafio02;

import java.util.Scanner;


public class Desafio02 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p = new Pessoa(System.in);
        System.out.println("Digite seu nome:");
        String nome = input.next();
        
        System.out.println("Digite sua idade:");
        int idade = input.nextInt();
        System.out.println("Seu nome e: " + nome + " e sua idade: " + idade);
        
        MinhaClasse mc = new MinhaClasse(3, 5);
        System.out.println("Soma: " + mc.somar() +"\nSubtracao: " +mc.subtrair());
        
        
    }
    
}
