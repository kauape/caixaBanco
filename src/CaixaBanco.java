import java.util.ArrayList;
public class CaixaBanco {
    private String usuarioLogado;
    private Boolean logado = false;

//    private ArrayList<Object> usuarios = new ArrayList();
//
//    public CaixaBanco(ArrayList<Object> usuarios) {
//        this.usuarios = usuarios;
//    }

    Usuario user1 = new Usuario( 100.00, "111.222.333-11", "123", "novotec");

    public Boolean verificaLogin(String cpf, String nomeDeUsuario, String senha) {
        if (logado) {
            if (user1.setCpf() == cpf) {
                return true;
            }
            else {
                logado=true;
                user1.setCpf(cpf);
                user1.setSenha(senha);
                this.usuarioLogado= user1.getNome();
                return true;
            }
        }

        logado=true;
        user1.setCpf(cpf);
        user1.setSenha(senha);
        this.usuarioLogado= user1.getNome();

        return true;
    }
    public void logar(String cpf, String senha, String nomeDeUsuario) {
        verificaLogin(cpf, nomeDeUsuario, senha);
        System.out.printf("usuario logado: %s", this.usuarioLogado);

    }

    public void setSaldo(Double valor) {
        user1.setSaldo(valor);

    }

    public Double gatSaldo(){
        return user1.getSaldo();

    }

    public void Depositar(Double valor){
        user1.setSaldo(valor);
        System.out.printf("\nsaldoatual; %.2f",gatSaldo());
    }

    public void Sacar(Double valor) {
        if(user1.getSaldo()- valor < -600){

            System.out.println("\nultrapassou o limite de credito");

        }

        else {
            setSaldo(gatSaldo()- valor );
            System.out.printf("\nsaldoatual: %.2f", gatSaldo());
        }
    }

}