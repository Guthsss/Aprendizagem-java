package InfosPessoais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String endereco = null;
        String numero = null;
        String cep = null;

        Endereco endereco1 = new Endereco(endereco, numero, cep);
        Pessoa pessoa1 = new Pessoa("Ana Maria", "123.456.789-00", endereco1);
        System.out.println("CEP antigo" + pessoa1.obterCep());
        pessoa1.atualizarEndereco(new Endereco("Rua Nova", "200", "89911-000"));
        System.out.println("CEP novo: " + pessoa1.obterCep());

        Curso curso1 = new Curso("Ciência da Computação", 3600);
        Aluno aluno1 = new Aluno("Carlos Silva", "20251234");

        var sc = new Scanner(System.in);

        System.out.println("Digite seu endereço: ");
        String linha = sc.nextLine();
        String[] partes = linha.split("\\s*,\\s*");
        endereco = partes[0];
        numero = partes[1];
        cep = partes[2];
        sc.close();
        endereco1.
        aluno1.exibirDados();
        System.out.println(curso1.descrever());

        Matricula matricula1 = new Matricula(1, aluno1, curso1, true);
        matricula1.gerarComprovante();
        matricula1.mudarStatus();

        PlanoSaude plano = new PlanoSaude("Unimed");
        Paciente paciente = new Paciente("Marta Souza", plano);
        Consulta consulta = new Consulta(paciente);

        System.out.println("Consulta criada para paciente: " + paciente.getNome()); // vai precisar do getter em Paciente
    }
}
