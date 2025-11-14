package model;
// Neste caso estou usando o Padrao Low Coupling pois a classe depende apenas da abstração de Evento, e nao da subclasses.
// e tambem tem o padrao High Cohesion , responsavel somente por bilhete.
public class Bilhete {
    private Evento evento;

    public Bilhete(Evento evento) {
        this.evento = evento;
    }

    public void imprimirBilhete() {
        System.out.println("Bilhete para: " + evento.getNome());
    }
}