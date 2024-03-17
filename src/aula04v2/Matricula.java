package aula04v2;

import java.time.LocalDate;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private LocalDate dataMatricula;
    int x;

    public Matricula(Aluno aluno, Curso curso, LocalDate dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

    public static int calcularIdadeNaMatricula() {
        LocalDate dataNascimentoAluno = aluno.getDataNascimento();
        x = LocalDate.now().getYear() - dataNascimentoAluno.getYear();
        
        if (x < 18) {        	
            System.out.println("Matricula nao pode ser realizada");
            System.out.println("--------------------------------");
        }else {
            return x;
        }
		return x;
    }
}
