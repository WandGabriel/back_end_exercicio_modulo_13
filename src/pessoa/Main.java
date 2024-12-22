package pessoa;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Luzia Melissa Luciana Aragão", "328.449.681-55",
                "28.218.752-2", "03/08/1994");

        PessoaJuridica pj = new PessoaJuridica("Laís Marcela Aparecida da Rocha", "10/07/1994",
                "79.819.928/0001-52", "01/12/2024", "Laís Developer ME");


        System.out.println("------ Pessoa Física ------");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Data de Nascimento: " + pf.getDataNascimento());
        System.out.println("CPF com pountuação: " + pf.getCpf());
        String cpfSemPountuacao = pf.removerPontuacao(pf.getCpf());
        System.out.println("Status do CPF: " + pf.validaCpf(cpfSemPountuacao));
        System.out.println("-----------------------------------------");

        System.out.println("----- Pessoa Juridica ------");
        System.out.println("Nome da empresa: " + pj.getNomeEmpresa());
        System.out.println("Data de abertura: " + pj.getDataDeAbertura());
        System.out.println("Sócios(as): " + pj.getNome());
        System.out.println("CNPJ com pontuação: " + pj.getCnpj());
        String cnpjSemPontuacao = pj.removerPontuacao(pj.getCnpj());
        System.out.println("Status do CNPJ: " + pj.validaCnpj(cnpjSemPontuacao));
    }
}
