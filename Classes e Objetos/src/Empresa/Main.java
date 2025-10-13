package Empresa;

import Escola.Pessoa;

public class Main {
    public static void main(String[] args) {
        Funcionario obj1 = new Funcionario("Pedro", 1334.00);
        Progamador obj2 = new Progamador("Gregory", 1343, "Java", 23, 1234.56);
        Gerente obj3 = new Gerente("Guilherme", 1232.00, 6545.09);

        obj1.trabalhar();
        obj2.exibirDados();
        obj3.exibirDados();
    }
}
