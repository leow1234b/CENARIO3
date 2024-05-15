package br.edu.up.modelos;


    import java.util.HashMap;
import java.util.Map;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Map<String, Mes> meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new HashMap<>();
        inicializarMeses();
    }

    private void inicializarMeses() {
        meses.put("Janeiro", new Mes(31, "Janeiro"));
        meses.put("Fevereiro", new Mes(bissexto ? 29 : 28, "Fevereiro"));
        meses.put("Março", new Mes(31, "Março"));
        // Adicione os outros meses de forma similar
    }

    public void adicionarMes(Mes mes) {
        meses.put(mes.nome, mes);
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        if (meses.containsKey(nomeMes)) {
            meses.get(nomeMes).excluirCompromisso(diaMes, hora);
        }
    }

    public String listarCompromissos(String nomeMes) {
        if (meses.containsKey(nomeMes)) {
            return meses.get(nomeMes).listarCompromissos();
        }
        return "Nenhum compromisso encontrado.";
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses.values()) {
            sb.append("Mes ").append(mes.nome).append(":\n");
            sb.append(mes.listarCompromissos()).append("\n");
        }
        return sb.toString();
    }
    public void adicionarCompromisso(String nomeMes, String pessoa, String local, String assunto, int diaMes, int hora) {
        // Cria um novo compromisso
        Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
        
        // Verifica se o mês existe no mapa
        if (meses.containsKey(nomeMes)) {
            // Adiciona o compromisso ao mês e dia específicos
            meses.get(nomeMes).adicionarCompromisso(compromisso, diaMes);
        } else {
            System.out.println("Mês inválido: " + nomeMes);
        }
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    public Map<String, Mes> getMeses() {
        return meses;
    }

    public void setMeses(Map<String, Mes> meses) {
        this.meses = meses;
    }
    
}

