package one.digitalinnovation.gof.strategy;

import java.util.HashMap;
import java.util.Map;

public class Robo {
    private Comportamento comportamento;

    private static Map<String,Comportamento> comportamentos;

    static
    {
        comportamentos = new HashMap<>();
        comportamentos.put("Normal", new ComportamentoNormal());
        comportamentos.put("Defensivo", new ComportamentoDefensivo());
        comportamentos.put("Agressivo", new ComportamentoAgressivo());
    }

    public Robo() {
        comportamento = comportamentos.get("Normal");
    }


    public void serNormal() {
        comportamento = comportamentos.get("Normal");
    }

    public void serAgressivo() {
        comportamento = comportamentos.get("Agressivo");
    }

    public void serDefensivo() {
        comportamento = comportamentos.get("Defensivo");
    }

    public void mover(){
        comportamento.mover();
    }
}
