package pessoa;

public class Pessoa {

    private String nome;

    private String dataNascimento;

    private Boolean isValido;

    public Pessoa (String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEmpresa() {
        return nome;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nome = nomeEmpresa;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String removerPontuacao(String cpf) {
        return cpf.replaceAll("[^0-9]", "");
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
