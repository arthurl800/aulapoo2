package aula04v2;

import java.time.LocalDate;
import java.time.Period;

public class Matricula {
	
	private Aluno aluno;
    private Curso curso;
    private LocalDate dataMatricula;

    public Matricula(Aluno aluno, Curso curso, LocalDate dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public int calculoIdade() {
		
        LocalDate dataNascimento = aluno.getDataNascimento();

        Period periodo = Period.between(dataNascimento, dataMatricula);

        int anos = periodo.getYears();
        int dias = periodo.getDays();

        if (dias == 0) {
            return anos;
        }

        return anos - 1;
	}

	@Override
	public String toString() {
		return "Matricula [aluno=" + aluno + ", curso=" + curso + ", dataMatricula=" + dataMatricula + "]";
	}
    
	
}

/*
public boolean calcularIdade() {

LocalDate dataNascimento = aluno.getDataNascimento();

Period periodo = Period.between(dataNascimento, dataMatricula);

int anos = periodo.getYears();

return anos >= 18;
}
*/