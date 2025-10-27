package InfosPessoais;

public class Endereco {
    private String logradouro;
    private String numero;
    private String cep;

    public Endereco(String logradouro, String numero, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public String getLogradouro() { return logradouro; }
    public String getNumero() { return numero; }
    public String getCep() { return cep; }

    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
    public void setNumero(String numero) { this.numero = numero; }
    public void setCep(String cep) { this.cep = cep; }
}