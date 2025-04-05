package br.faj.proj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Exercicio> listaExercicios = new ArrayList<>();
        ArrayList<EntregaExercicio> notasEntregues = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        System.out.println("    Nome: Yuri Chrystian de Oliveira");
        System.out.println("               RA:12427365");

        while (check) {
            System.out.println("********* Selecione uma opção: *****");
            System.out.println("****** 1 - Cadastrar Aluno *********");
            System.out.println("****** 2 - Cadastrar Diciplina *****");
            System.out.println("****** 3 - Cadastrar Exercício *****");
            System.out.println("****** 4 - Entrega de exercício ****");
            System.out.println("****** 5 - Exibir disciplina *******");
            System.out.println("****** 6 - Exibir alunos ***********");
            System.out.println("****** 7 - Exibir exercicios *******");
            System.out.println("****** 8 - Sair ********************");

            Scanner sc = new Scanner(System.in);
            String cat = sc.nextLine();
            switch (cat) {
                case "1":
                    System.out.println("Aluno");
                    cadastrarAluno(sc, listaAlunos);
                    break;
                case "2":
                    System.out.println("Diciplina");
                    newDiciplina(sc, disciplinas);
                    break;
                case "3":
                    System.out.println("Exercício");
                    criarExercicios(sc, listaExercicios);
                    break;
                case "4":
                    System.out.println("Entrega de exercício");
                    break;
                case "5":
                    exibirDisciplina(disciplinas);
                    break;
                case "6":
                    exibirAlunos(listaAlunos);
                    break;
                case "7":
                    exibirExecicio(listaExercicios);
                    break;
                case "8":
                    check = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }

    public static void exibirAlunos(ArrayList<Aluno> list) {
        for (Aluno aluno : list) {
            System.out.println(aluno);
        }
    }

    public static void exibirDisciplina(ArrayList<Disciplina> listDc) {
        for (Disciplina disciplina : listDc) {
            System.out.println(disciplina);
        }
    }

    public static void exibirExecicio(ArrayList<Exercicio> listex) {
        for (Exercicio exercicio : listex) {
            System.out.println(exercicio);
        }
    }

    public static void newDiciplina(Scanner sc, ArrayList<Disciplina> listDc) {
        Disciplina dc = new Disciplina();
        System.out.println("Informe o ID da disciplina: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o nome da disciplina: ");
        String nome = sc.nextLine();
        System.out.println("Informe o dia da semana da disciplina: ");
        String dia = sc.nextLine();
        System.out.println("Informe a descrição disciplina: ");
        String desc = sc.nextLine();

        dc.setDescricao(desc);
        dc.setId(id);
        dc.setDia_semana(dia);
        dc.setNome(nome);

        listDc.add(dc);

    }

    public static void cadastrarAluno(Scanner scAluno, ArrayList<Aluno> list) {
        Aluno aluno = new Aluno();
        System.out.println("Informe o nome do aluno: ");
        String nome = scAluno.nextLine();
        System.out.println("Informe o RA do aluno: ");
        Integer ra = scAluno.nextInt();
        scAluno.nextLine();
        System.out.println("Informe o Turma do aluno: ");
        String turma = scAluno.nextLine();

        aluno.setNome(nome);
        aluno.setRA(ra);
        aluno.setTurma(turma);

        list.add(aluno);
    }

    public static void criarExercicios(Scanner scEx, ArrayList<Exercicio> listEx) {
        Exercicio ex = new Exercicio();
        System.out.println("Informe o ID do exercicio: ");
        Integer id = scEx.nextInt();
        scEx.nextLine();
        System.out.println("Informe o titulo do exercicio: ");
        String titulo = scEx.nextLine();
        System.out.println("Informe a descricão do exercicio: ");
        String desc = scEx.nextLine();
        System.out.println("Informe a data de inicio do exercicio: ");
        String data_inicio = scEx.nextLine();
        System.out.println("Informe a data de fim do exercicio: ");
        String data_fim = scEx.nextLine();
        System.out.println("Informe a nota maxima do exercicio: ");
        Float nota_max = scEx.nextFloat();

        ex.setData_fim(data_fim);
        ex.setData_inicio(data_inicio);
        ex.setId(id);
        ex.setDescricao(desc);
        ex.setTitulo(titulo);
        ex.setNota_maxima(nota_max);

        listEx.add(ex);
    }

    public static void entregaExercicio(Scanner scEx, ArrayList<EntregaExercicio> entregas) {
        EntregaExercicio entEx = new EntregaExercicio();
        System.out.println("Informe o ID do exercicio: ");
        Integer id = scEx.nextInt();
        System.out.println("Informe o RA do aluno: ");
        Integer ra_aluno = scEx.nextInt();
        System.out.println("Informe a sua nota da correção: ");
        Float nota = scEx.nextFloat();

        entEx.setId(id);
        entEx.setRa_aluno(ra_aluno);
        entEx.setNota_correcao(nota);

        entregas.add(entEx);
    }
}