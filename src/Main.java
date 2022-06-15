import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner  scan = new Scanner(System.in);


        caixa1.setUsuarios();
        caixa1.logar("111.222.333-11", "123");

        caixa1.registra("111.222.333-11", "123", "novotec");




    }
}
