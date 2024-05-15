package br.edu.up.modelos;


    import java.util.HashMap;
import java.util.Map;

public class Dia {
    public int diaMes;
    private Map<Integer, Compromisso> compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new HashMap<>();
    }

    public void adicionarCompromisso(Compromisso comp) {
        compromissos.put(comp.getHora(), comp);
    }

    public Compromisso consultarCompromisso(int hora) {
        return compromissos.get(hora);
    }

    public void excluirCompromisso(int hora) {
        compromissos.remove(hora);
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Compromisso comp : compromissos.values()) {
            sb.append(comp.toString()).append("\n");
        }
        return sb.toString();
    }
}

