import java.awt.geom.Arc2D;
import java.util.ArrayList;
public class CaixaBanco {
    private Integer usuarioLogado;
    private Boolean logado = false;

    private ArrayList<Usuario> usuarios = new ArrayList();

    public void setUsuarios() {
        usuarios.add(new Usuario( 100.00, "111.222.333-11", "123", "novotec"));
    }

    public Integer verificaLogin(String cpf) {
        if (logado) {
            return -2;
        }

        Integer i = 0, userExist = -1;

        for (i=0; i < usuarios.size(); i++) {
            if (cpf.equals(usuarios.get(i).getCpf())){
                userExist = i;
                break;
            }
        }

        return userExist;
    }
    public void logar(String cpf, String senha) {
        Integer userExist = verificaLogin(cpf);

        if (userExist == -1) {
            System.out.println("usuario digitado nao existe");
        } else if (userExist == -2) {
            System.out.println("ja existe um usuario logado no sistema.\npor favor faça logout primeiro");
        }
        else{
            if (senha.equals(usuarios.get(userExist).getSenha())) {
                usuarioLogado = userExist;
                logado = true;
                System.out.printf("usuario logado: %s\n", usuarios.get(usuarioLogado).getNome());
            }
            else{
                System.out.println("senha incorreta");
            }
        }
    }

    public void Depositar(Double valor){
        usuarios.get(usuarioLogado).setSaldo(usuarios.get(usuarioLogado).getSaldo() + valor);
        System.out.printf("\nSaldo atual; %.2f", usuarios.get(usuarioLogado).getSaldo());
    }

    public void Sacar(Double valor) {
        if((usuarios.get(usuarioLogado).getSaldo() - valor) < -600){
            System.out.println("\nultrapassou o limite de credito");
        }

        else {
            usuarios.get(usuarioLogado).setSaldo(usuarios.get(usuarioLogado).getSaldo() - valor);
            System.out.printf("\nsaldo atual: %.2f", usuarios.get(usuarioLogado).getSaldo());
        }
    }
    void registra (String cpf, String senha, String nome){
        usuarios.add(new Usuario(00.00, cpf, senha, nome));
        System.out.printf("Usuario %s foi registrado", nome);


    }

}