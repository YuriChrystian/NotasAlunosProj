package br.faj.proj;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;

        while(check) {
            System.out.println("**Selecione uma opção: **");
            System.out.println("*****1 - Aluno*****");
            System.out.println("****2 - Diciplina****");
            System.out.println("**3 - Exercício**");
            System.out.println("**4 - Entrega de exercício**");
            System.out.println("**5 - Meu nome e RA**");
            System.out.println("*******6 - Sair******");

            Scanner sc = new Scanner(System.in);
            String cat = sc.nextLine();
            switch (cat) {
                case "1":
                    System.out.println("Aluno");
                    break;
                case "2":
                    System.out.println("Diciplina");
                    break;
                case "3":
                    System.out.println("Exercício");
                    break;
                case "4":
                    System.out.println("Entrega de exercício");
                    break;
                case "5":
                    System.out.println("Nome: Yuri Chrystian de Oliveira");
                    System.out.println("RA:12427365");
                    break;
                case "6":
                    check = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }

    public static void CadastrarAluno(){
        Aluno aluno = new Aluno();

    }

}