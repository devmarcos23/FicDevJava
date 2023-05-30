
package desafio02;

import java.util.Scanner;


public class Desafio02 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = input.next();
        
        System.out.println("Digite sua idade:");
        int idade = input.nextInt();
        System.out.println("Seu nome é: " + nome + "e sua idade: " + idade);
    }
    
}
