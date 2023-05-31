/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioDoDia;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class volumeEsfera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o raio da esfera em metros:");
        double raio = teclado.nextDouble();
        
        double volume = (4 * Math.PI*Math.pow(raio, 3))/3;
        
        System.out.println("O volume da esfera e: " + volume + " metros cubicos");
    }
}
