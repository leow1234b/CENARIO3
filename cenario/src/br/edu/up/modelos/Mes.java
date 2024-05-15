package br.edu.up.modelos;

    import java.util.HashMap;
import java.util.Map;

public class Mes {
    public String nome;
    private int qtdeDias;
    private Map<Integer, Dia> dias;

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
        this.dias = new HashMap<>();
        for (int i = 1; i <= qtdeDias; i++) {
            dias.put(i, new Dia(i));
        }
    }

    public void adicionarDia(Dia dia) {
        dias.put(dia.diaMes, dia);
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (dias.containsKey(diaMes)) {
            dias.get(diaMes).adicionarCompromisso(comp);
        }
    }

    public Compromisso consultarCompromisso(int diaMes, int hora) {
        if (dias.containsKey(diaMes)) {
            return dias.get(diaMes).consultarCompromisso(hora);
        }
        return null;
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (dias.containsKey(diaMes)) {
            dias.get(diaMes).excluirCompromisso(hora);
        }
    }

    public String listarCompromissos(int diaMes) {
        if (dias.containsKey(diaMes)) {
            return dias.get(diaMes).listarCompromissos();
        }
        return "Nenhum compromisso encontrado.";
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Dia dia : dias.values()) {
            sb.append("Dia ").append(dia.diaMes).append(":\n");
            sb.append(dia.listarCompromissos()).append("\n");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public Map<Integer, Dia> getDias() {
        return dias;
    }

    public void setDias(Map<Integer, Dia> dias) {
        this.dias = dias;
    }
    
}

