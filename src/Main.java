import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner  scan = new Scanner(System.in);

        Integer escolha = 0;
//        System.out.printf("1- login\n2- registro\n3- saque\n4- deposito\n");
//        escolha = scan.nextInt();
//        scan.nextLine();

        while (escolha != 5){

            System.out.printf("\n1- login\n2- registro\n3- saque\n4- deposito\n\n");
            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    String cpf = "0";
                    System.out.printf("digite o cpf: ");
                    cpf = scan.nextLine();

                    String senha = "0";
                    System.out.printf("digite a senha: ");
                    senha = scan.nextLine();

                    caixa1.logar(cpf, senha);
                    escolha = 0;
                    break;

                case 2:
                    String _cpf;
                    System.out.printf("me passe o cpf: ");
                    _cpf = scan.nextLine();

                    String _nome;
                    System.out.printf("qual o nome: ");
                    _nome = scan.nextLine();

                    String _senha;
                    System.out.println("me passe a senha: ");
                    _senha = scan.nextLine();
                    caixa1.registra(_cpf, _senha, _nome);
                    escolha = 0;
                    break;

                case 3:
                    caixa1.Sacar(00.00);
                    escolha = 0;
                    break;

                case 4:
                    caixa1.Depositar(00.00);
                    escolha = 0;
                    break;

                case 5:
                    System.out.println("sua sessão está encerrada");
                    break;
            }
        }
    }
}
