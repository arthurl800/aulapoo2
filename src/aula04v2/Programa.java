package aula04v2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Programa {
   
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Curso> cursos = new ArrayList<>();
    private static ArrayList<Matricula> matriculas = new ArrayList<>();
	
	public static void main(String[] args) {
   	
		Scanner scanner = new Scanner(System.in);
		
		
        	System.out.println("Digite uma das opcoes: ");
            System.out.println("--------------------------------");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Curso");
            System.out.println("3 - Realizar Matricula");
            System.out.println("4 - Listar Alunos");
            System.out.println("5 - Listar Cursos");
            System.out.println("6 - Sair");
            System.out.println("--------------------------------");
            
            int opcao = scanner.nextInt();
            
            do {
            
            switch (opcao) {
                                
            	case 1:
                	
                	cadastrarAluno(scanner);
                	System.out.println("--------------------------------");
                    
                    break;
                    
                case 2:
  
                	cadastrarCurso(scanner);
                    System.out.println("--------------------------------");
 
                    break;

                case 3:
                	
                	realizarMatricula(scanner);
                    System.out.println("--------------------------------");
                    
                    break;
                    
                case 4:
                	
                	listaAluno();
                    System.out.println("--------------------------------");
                    
                    break;
                    
                case 5:
                	
                	listaCurso();
                    System.out.println("--------------------------------");
                    
                    break;
                    
                case 6:
                    
                	System.out.println("\n");
                    System.out.println("Fechando o programa");
                    System.out.println("--------------------------------");
                    
                    return;
                    
                default:
                	
                    System.out.println("\n");
                    System.out.println("Opcao invalida, tente novamente");
                    System.out.println("--------------------------------");
                    System.out.println("\n");
                 
            }
            
            
       
		}while(opcao != 6);	
		
            scanner.close();
	}

	private static void listaCurso() {

	    for (Curso curso : cursos) {
	        System.out.println("Código do curso: " + curso.getCodigoCurso());
	        System.out.println("Nome do curso: " + curso.getNomeCurso());
	        System.out.println("Data de início: " + curso.getDataInicio());
	        System.out.println();
	    }
	}

	private static void listaAluno() {
		
	    for (Aluno aluno : alunos) {
	        System.out.println("Código do Aluno " + aluno.getMatricula());
	        System.out.println("Nome do Aluno: " + aluno.getNome());
	        System.out.println("Data de nascimento do Aluno: " + aluno.getDataNascimento());
	        System.out.println();
	    }
		
	}

	private static void realizarMatricula(Scanner scanner) {

        System.out.print("Digite o numero de matrícula do aluno: ");
        int numeroMatricula = scanner.nextInt();

        Aluno aluno = buscarAlunoPorNumeroMatricula(numeroMatricula);
        if (aluno == null) {
            System.out.println("Aluno não encontrado!");
            return;
        }

        System.out.print("Código do curso: ");
        int codigoCurso = scanner.nextInt();

        Curso curso = buscarCursoPorCodigo(codigoCurso);
        if (curso == null) {
            System.out.println("Curso não encontrado!");
            return;
        }

        int idadeAluno = Matricula.calculoIdade();
        if (idadeAluno < 18) {
            System.out.println("Aluno não tem idade mínima para matrícula!");
            return;
        }

        Matricula matricula = new Matricula(aluno, curso, LocalDate.now());
        matriculas.add(matricula);

        System.out.println("Matrícula realizada com sucesso!");
        
	}

	private static void cadastrarCurso(Scanner scanner) {

        System.out.print("Digite o codigo do curso: ");
        int codigoCurso = scanner.nextInt();

        System.out.print("Digite o Nome do curso: ");
        String nomeCurso = scanner.next();

        System.out.print("Data de início do curso em (yyyy-MM-dd): ");
        String dataInicioStr = scanner.next();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr);

        Curso curso = new Curso(codigoCurso, nomeCurso, dataInicio);
        cursos.add(curso);

        System.out.println("Curso cadastrado com sucesso!");
		
	}

	private static void cadastrarAluno(Scanner scanner) {
		
		System.out.print("Digite o numero de matricula: ");
        int numeroMatricula = scanner.nextInt();

        System.out.print("Digite o Nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Data de nascimento em (yyyy-MM-dd): ");
        String dataNascimentoStr = scanner.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

        Aluno aluno = new Aluno(numeroMatricula, nome, dataNascimento);
        alunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
		
	}
	
	private static Aluno buscarAlunoPorNumeroMatricula(int numeroMatricula) {
	    for (Aluno aluno : alunos) {
	        if (aluno.getMatricula() == numeroMatricula) {
	            return aluno;
	        }
	    }
	    return null;
	}
	
	private static Curso buscarCursoPorCodigo(int codigoCurso) {
	    for (Curso curso : cursos) {
	        if (curso.getCodigoCurso() == codigoCurso) {
	            return curso;
	        }
	    }
	    return null;
	}
}

//Código para estudo abaixo   
//-----------------------------------------------------------------------------------------------------

/*
            
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o número de matrícula do aluno: ");
int matricula = scanner.nextInt();
scanner.nextLine();

System.out.print("Digite o nome do aluno: ");
String nome = scanner.nextLine();

System.out.print("Digite a data de nascimento do aluno (no formato yyyy-MM-dd): ");
String dataNascimentoStr = scanner.nextLine();
LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

Aluno aluno = new Aluno(matricula, nome, dataNascimento);

System.out.print("Digite o código do curso: ");
int codigoCurso = scanner.nextInt();
scanner.nextLine();

System.out.print("Digite o nome do curso: ");
String nomeCurso = scanner.nextLine();

System.out.print("Digite a data de início do curso (no formato yyyy-MM-dd): ");
String dataInicioStr = scanner.nextLine();
LocalDate dataInicio = LocalDate.parse(dataInicioStr);

Curso curso = new Curso(codigoCurso, nomeCurso, dataInicio);

System.out.print("Digite a data de matrícula (no formato yyyy-MM-dd): ");
String dataMatriculaStr = scanner.nextLine();
LocalDate dataMatricula = LocalDate.parse(dataMatriculaStr);

Matricula matriculaAluno = new Matricula(aluno, curso, dataMatricula);

boolean idadeNaMatricula = matriculaAluno.calcularIdade();
System.out.println("Idade do aluno na data de matrícula: " + idadeNaMatricula + " anos");

scanner.close();
    
*/     