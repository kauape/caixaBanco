public class Usuario {
    private Double saldo;
    private String cpf;
    private String senha;
    private String nome;

    public Usuario(Double saldo, String cpf, String senha, String nome) {
        this.saldo = saldo;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getName() {
        return nome;
    }
}
