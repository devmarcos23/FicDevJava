/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.desafio12.view;

import aula.desafio12.model.Aluno;

/**
 *
 * @author marcos
 */
public class AlunoView {
    public void exibirDetalhesAluno(Aluno aluno) {
        if (aluno != null) {
            System.out.println("ID: " + aluno.getId());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Coeficiente de Rendimento: " + aluno.getCoeficiente());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
