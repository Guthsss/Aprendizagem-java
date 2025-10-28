package Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var vetor = new ArrayList<Pessoa>();
        var sc = new Scanner(System.in);
        System.out.print("Digite o nome do primeiro pessoa: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade do primeiro pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do segundo pessoa:");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade do segundo pessoa:");
        int idade2 = sc.nextInt();
        Pessoa p1 = new Pessoa(nome1, idade1, Profissao.Estudante);
        Pessoa p2 = new Pessoa(nome2, idade2, Profissao.Docente);
        sc.close();

        vetor.add(p1);
        vetor.add(p2);

        for (Pessoa p : vetor) {
            System.out.println(p);
        }
    }
}
