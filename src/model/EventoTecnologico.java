package model;
// Estou usando o padrao High Cohesion pois utiliza apenas informações especificas de eventos tecnologico
//estou usando polimorfismo pois a classe tem sua propria versao de exibirDetalhes()
public class EventoTecnologico extends Evento {
    private String tema;

    public EventoTecnologico(String nome, String local, String data, double preco, int ingressosDisponiveis, String tema) {
        super(nome, local, data, preco, ingressosDisponiveis);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Evento Tecnológico: " + nome + " | Tema: " + tema + " | Local: " + local + " | Data: " + data + " | Preço:" + preco);
    }
}
