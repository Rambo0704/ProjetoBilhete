package model;
//Utilizei o padrao High cohesion esta subclasse só tem apenas as informaçoes dessa classe show.
// e polimorfismo pois implementa metodos da classe abstrata
public class Show extends Evento {
    private String banda;
    private String genero;

    public Show(String nome, String local, String data, double preco, int ingressosDisponiveis, String banda, String genero) {
        super(nome, local, data, preco, ingressosDisponiveis);
        this.banda = banda;
        this.genero = genero;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Show: " + nome + " - Banda: " + banda + " | Local: " + local + " | Data: " + data + " | Preço:" + preco);
    }
}
