import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Object> usuarios = new ArrayList();
        usuarios.add(new Usuario( 100.00, "111.222.333-11", "123", "novotec"));

        CaixaBanco caixa1 = new CaixaBanco(usuarios);
        Scanner  scan = new Scanner(System.in);
//        caixa1.logar("111.222.333-11",  "22",  "kauapereira");
//        caixa1.Depositar(100.00);


//        caixa1.Sacar(800.00);


        System.out.printf("%s", user1.getCpf());



    }
}
