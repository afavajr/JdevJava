package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculada;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;

    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }


    public String getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public String getNomeEscola() {
        return nomeEscola;
    }
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
    public String getSerieMatriculada() {
        return serieMatriculada;
    }
    public void setSerieMatriculada(String serieMatriculada) {
        this.serieMatriculada = serieMatriculada;
    }
   /*  public List<disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }*/

    /* @Override
    public boolean pessoaMaiorIdade() {
        return idade >= 21;
    } */
    
    public String msgMaiorIdade() {
        return this.pessoaMaiorIdade()  ? "Aluno maior de idade" : "Menor de idade";
    }
    @Override
    public double salario() {
        return 1500.90;
    }

    

    
}
