/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.desafio12.controler;

import aula.desafio12.model.Aluno;
import aula.desafio12.model.AlunoDAO;

/**
 *
 * @author marcos
 */
public class AlunoController {
    private AlunoDAO alunoDAO;
    private Aluno aluno;
    public AlunoController() {
        this.alunoDAO = new AlunoDAO();
    }

    public AlunoDAO buscarAlunoPorId(int id) {
        return alunoDAO.buscarPorId(id);
    }

    public void atualizarCoeficiente(int id, double novoCoeficiente) {
        
        if (aluno.getId() != 0) {
            this.aluno.setCoeficiente(novoCoeficiente);
            alunoDAO.atualizarCoeficiente(aluno);
        }
    }
}
