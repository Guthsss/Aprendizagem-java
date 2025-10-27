package InfosPessoais;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Central", "100", "89900-000");
        Pessoa pessoa1 = new Pessoa("Ana Maria", "123.456.789-00", endereco1);
        System.out.println("CEP antigo" + pessoa1.obterCep());
        pessoa1.atualizarEndereco(new Endereco("Rua Nova", "200", "89911-000"));
        System.out.println("CEP novo: " + pessoa1.obterCep());

        Curso curso1 = new Curso("Ciência da Computação", 3600);
        Aluno aluno1 = new Aluno("Carlos Silva", "20251234");
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
