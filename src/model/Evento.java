package model;
// aqui utilizei o padrão GRASP High Colision pois esta classe concentra apenas atributos e comportamentos essenciais de um Evento.
// alem de aplicar o polimorfismo usando o metodo abstrato permite que cada classe filha implemente da sua maneira alem de herdar os atributos eventos.
public abstract class Evento {
    protected String nome;
    protected String local;
    protected String data;
    protected double preco;
    protected int ingressosDisponiveis;

    public Evento(String nome, String local, String data, double preco, int ingressosDisponiveis) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.preco = preco;
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

    public boolean venderIngresso() {
        if (ingressosDisponiveis > 0) {
            ingressosDisponiveis--;
            return true;
        }
        return false;
    }

    public abstract void exibirDetalhes();

    public String getNome() {
        return nome;
    }
}
