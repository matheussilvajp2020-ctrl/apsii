package Exercicio01;

public class Main {
    public static void main(String[] args) {
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

        agenda.adicionarAniversariante("Matheus", 16, 4);
        agenda.adicionarAniversariante("Maria", 16, 4);
        agenda.adicionarAniversariante("Carlos", 20, 8);

        System.out.println("Aniversariantes em 16/04:");
        for (String nome : agenda.obterAniversariantesDoDia(16, 4)) {
            System.out.println(nome);
        }

        agenda.removerAniversariante("Maria");

        System.out.println("\nApós remover Maria:");
        for (String nome : agenda.obterAniversariantesDoDia(16, 4)) {
            System.out.println(nome);
        }
    }
}