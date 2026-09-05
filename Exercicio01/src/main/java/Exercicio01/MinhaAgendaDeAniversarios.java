package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novo = new Aniversariante(nome, dia, mes);
        this.aniversariantes.add(novo);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> aniversariantesDoDia = new ArrayList<>();
        DataAniversario dataBusca = new DataAniversario(dia, mes);

        for (Aniversariante a : this.aniversariantes) {
            if (a.getDataAniversario().equals(dataBusca)) {
                aniversariantesDoDia.add(a.getNome());
            }
        }
        return aniversariantesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        this.aniversariantes.removeIf(a -> a.getNome().equalsIgnoreCase(nomeAniversariante));
    }
}