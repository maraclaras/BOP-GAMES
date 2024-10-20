package com.atividade.model;

import java.time.Duration;
import java.util.ArrayList; 
import java.util.List;

public class Ciclista extends Participante {
    private static final int ETAPAS = 21;
    public List<Etapa> etapas;
    private int etapasRegistradas;

    public Ciclista(String nome, int numero, String cidadeOrigem) {
        super(nome, numero, cidadeOrigem);
        this.etapas = new ArrayList<>();
        this.etapasRegistradas = 0;
    }

    public void registrarEtapa(Etapa etapa) {
        if (etapasRegistradas < ETAPAS) {
            etapas.add(etapa);
            etapasRegistradas++;
        } else {
            System.out.println("Não é possível registrar mais etapas.");
        }
    }

    public int calcularTempoTotalEtapas() {
        int total = 0;
        for (Etapa etapa : etapas) {
            total += etapa.getDuracao().toMinutes();
        }
        return total;
    }

    public String difTempoEntreCiclistas(Ciclista outro) {
        int tempoThis = this.calcularTempoTotalEtapas();
        int outroTempo = outro.calcularTempoTotalEtapas();
        
        if (tempoThis > outroTempo) {
            return "Este ciclista gastou mais tempo: Diferença de " + (tempoThis - outroTempo) + " minutos.";
        } else if (tempoThis < outroTempo) {
            return "Outro ciclista gastou mais tempo: Diferença de " + (outroTempo - tempoThis) + " minutos.";
        } else {
            return "Os ciclistas gastaram o mesmo tempo.";
        }
    }
    
    
    public Ciclista vencedorDaEtapa(Ciclista outro, int etapa) {
        Duration minhaEtapa = this.etapas.get(etapa - 1).getDuracao();
        Duration outraEtapa = outro.etapas.get(etapa - 1).getDuracao();
        return minhaEtapa.compareTo(outraEtapa) < 0 ? this : outro;
    }
}
