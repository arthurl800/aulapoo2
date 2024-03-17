package aula04v2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();

        while (true) {
            System.out.println("Opções:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Curso");
            System.out.println("3. Realizar Matrícula");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	
                    System.out.println("--------------------------------");
                    break;
                case 2:
                	
                    System.out.println("--------------------------------");
                    break;
                case 3:
                	Matricula.calcularIdadeNaMatricula();
                    System.out.println("--------------------------------");
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Até logo!");
                    System.out.println("--------------------------------");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("--------------------------------");
            }
        }
  /*      
        // Exemplo de cadastro de aluno:
        Aluno aluno1 = new Aluno(1, "Maria Silva", LocalDate.of(2000, 5, 15));
        alunos.add(aluno1);

        // Exemplo de cadastro de curso:
        Curso curso1 = new Curso(101, "Programação Java", LocalDate.of(2024, 3, 20));
        cursos.add(curso1);

        // Exemplo de matrícula:
        Matricula matricula1 = new Matricula(aluno1, curso1, LocalDate.now());

        // Exemplo de cálculo da idade na matrícula:
        int idadeAluno1 = matricula1.calcularIdadeNaMatricula();
        System.out.println("Idade do aluno na matrícula: " + idadeAluno1 + " anos");

    }
*/
}
	
}
    