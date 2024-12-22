package pessoa;

public class PessoaFisica extends Pessoa {

    private String cpf;

    private String rg;

    public PessoaFisica(String nome, String cpf, String rg, String dataNascimento) {
        super(nome, dataNascimento);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Boolean validaCpf(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        return true;
    }
}