package ObjetosDTO;
// Generated Jun 4, 2013 9:45:51 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Aluno generated by hbm2java
 */
public class Aluno  implements java.io.Serializable {


     private Integer matricula;
     private Curso curso;
     private String nome;
//     private Set notas = new HashSet(0);
//     private Set disciplinas = new HashSet(0);

    public Aluno() {
    }

	
    public Aluno(Curso curso, String nome) {
        this.curso = curso;
        this.nome = nome;
    }
//    public Aluno(Curso curso, String nome, Set notas, Set disciplinas) {
//       this.curso = curso;
//       this.nome = nome;
//       this.notas = notas;
//       this.disciplinas = disciplinas;
//    }
   
    public Integer getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
//    public Set getNotas() {
//        return this.notas;
//    }
//    
//    public void setNotas(Set notas) {
//        this.notas = notas;
//    }
//    public Set getDisciplinas() {
//        return this.disciplinas;
//    }
//    
//    public void setDisciplinas(Set disciplinas) {
//        this.disciplinas = disciplinas;
//    }




}


