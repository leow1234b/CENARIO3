package br.edu.up.modelos;
public class Agenda {
    private Ano ano;

    public Agenda(int ano, boolean bissexto) {
        this.ano = new Ano(ano, bissexto);
    }

    public void adicionarCompromisso(String nomeMes, Compromisso compromisso, int diaMes) {
        if (ano.getMeses().containsKey(nomeMes)) {
            ano.getMeses().get(nomeMes).adicionarCompromisso(compromisso, diaMes);
        } else {
            System.out.println("Mês inválido: " + nomeMes);
        }
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        ano.excluirCompromisso(nomeMes, diaMes, hora);
    }
}