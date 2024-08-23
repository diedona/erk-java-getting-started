import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("====================================");
        System.out.println("     Isso aqui vem do App.java!");
        System.out.println("====================================");

        String nomeAluno; // para guardar o nome
        int idadeAluno; // para guardar idade
        Scanner leitorDeConsole = new Scanner(System.in); // para ler dados digitados no console

        try {
            System.out.println("Qual o nome do aluno?");
            nomeAluno = leitorDeConsole.nextLine();   
            
            System.out.println("Qual a idade do aluno?");
            idadeAluno = leitorDeConsole.nextInt();
        } finally {
            leitorDeConsole.close();
        }

        System.out.printf("O aluno se chama: %s\n", nomeAluno);
        System.out.printf("O aluno tem %d anos\n", idadeAluno);        
    }

}
