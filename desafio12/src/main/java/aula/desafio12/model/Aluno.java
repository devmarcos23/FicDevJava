/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.desafio12.model;

/**
 *
 * @author marcos
 */
public class Aluno {
    private int id;
    private String nome;
    private double coeficiente;

    

    public Aluno(String nome, double coeficiente) {
        this.nome = nome;
        this.coeficiente = coeficiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }
    
}
