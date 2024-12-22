package pessoa;

public class PessoaJuridica extends Pessoa{

    private String nomeEmpresa;

    private String cnpj;

    private Boolean situacao;

    private String dataDeAbertura;

    public PessoaJuridica(String nome, String dataNascimento, String cnpj, String dataDeAbertura, String nomeEmpresa) {
        super(nome, dataNascimento);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public Boolean validaCnpj(String cnpj) {

        if (cnpj.length() != 14) {
            return false;
        }
        return true;
    }

    public String removerPontuacao(String cpf) {
        return cpf.replaceAll("[^0-9]", "");
    }
}
