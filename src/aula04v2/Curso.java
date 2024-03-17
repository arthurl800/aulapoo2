package aula04v2;

import java.time.LocalDate;

public class Curso {
    private int codigoCurso;
    private String nomeCurso;
    private LocalDate dataInicio;

    public Curso(int codigoCurso, String nomeCurso, LocalDate dataInicio) {
        this.codigoCurso = codigoCurso;
        this.nomeCurso = nomeCurso;
        this.dataInicio = dataInicio;
    }

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Override
	public String toString() {
		return "Codigo do Curso = " + codigoCurso + ", Nome do Curso = " + nomeCurso + ", Data de Inicio = " + dataInicio + "";
	}
    
}
