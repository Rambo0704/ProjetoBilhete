package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;
// os padroes usados nessa classe são:
// Padrao Controller esta classe coordena o fluxo do sistema e recebe as requisições da View.
// Padrao Creator o Controller cria instâncias de Evento e Bilhete, pois possui as informações e a responsabilidade de gerenciar essas entidades.
// Padrao  Low Coupling trabalha com a abstração Evento, sem depender diretamente das subclasses.
public class SistemaController {

    private List<Evento> eventos = new ArrayList<>();

    public void criarEventosPadrao() {
        eventos.add(new Show("Rock in Rio", "Rio de Janeiro", "10/12/2025", 350.0, 100, "Imagine Dragons","Rock"));
        eventos.add(new Teatro("Hamlet", "São Paulo", "20/11/2025", 120.0, 80, "Drama", "Shakespeare"));
        eventos.add(new EventoTecnologico("Tech Summit", "Campinas", "15/03/2026", 200.0, 150, "Inteligência Artificial"));
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public Bilhete comprarBilhete(Evento evento) {
        if (evento.venderIngresso()) {
            return new Bilhete(evento);
        } else {
            System.out.println("Ingressos esgotados!");
            return null;
        }
    }
}
