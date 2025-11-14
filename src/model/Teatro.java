package model;
// estou usando o High Cohesion pois contém apenas dados de peças teatrais.
// e estou usando tambem polimorfismo pois fornece sua propria versão de exibirDetalhes().
public class Teatro extends Evento {
    private String grupo;
    private String tipo;

    public Teatro(String nome, String local, String data, double preco, int ingressosDisponiveis, String tipo, String grupo) {
        super(nome, local, data, preco, ingressosDisponiveis);
        this.grupo = grupo;
        this.tipo = tipo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Peça: " + nome + "- Grupo: " + grupo + "- Tipo: " + tipo + "- Local" + local + "| Data:" + data + "- Preço:" + preco);
    }
}
