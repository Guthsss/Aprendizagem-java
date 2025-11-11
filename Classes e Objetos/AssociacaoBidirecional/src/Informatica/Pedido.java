package Informatica;

import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate data;
    private StatusPedido status;
    private Tecnico tecnico;

    public Pedido(int numero, LocalDate data, StatusPedido status, Tecnico tecnico) {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.tecnico = tecnico;
    }

    public int getNumero() {return numero;}
    public LocalDate getData() {return data;}
    public StatusPedido getStatus() {return status;}
    public Tecnico getTecnico() {return tecnico;}

    public void atualizarStatus (StatusPedido status) {
        this.status = status;
    }
}
