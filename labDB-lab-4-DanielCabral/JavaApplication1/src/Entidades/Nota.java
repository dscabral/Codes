package Entidades;
// Generated Jun 4, 2013 9:45:51 PM by Hibernate Tools 3.2.1.GA



/**
 * Nota generated by hbm2java
 */
public class Nota  implements java.io.Serializable {


     private Integer nota;
     private Aluno aluno;
     private float valor;

    public Nota() {
    }

    public Nota(Aluno aluno, float valor) {
       this.aluno = aluno;
       this.valor = valor;
    }
   
    public Integer getNota() {
        return this.nota;
    }
    
    public void setNota(Integer nota) {
        this.nota = nota;
    }
    public Aluno getAluno() {
        return this.aluno;
    }
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }




}


