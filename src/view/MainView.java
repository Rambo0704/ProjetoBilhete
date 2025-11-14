package view;

import controller.SistemaController;
import model.*;

import java.util.List;
import java.util.Scanner;
// A Arquitetura MVC  , neste caso a view,esta classe representa exclusivamente a interface com o usuário.
// Não possui regras de negócio e não cria objetos de model diretamente.
// A View solicita operações ao Controller com uma interação MVC,mantendo baixo acoplamento.
public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaController controller = new SistemaController();

        controller.criarEventosPadrao();

        System.out.println("====================================");
        System.out.println("    Sistema de Compra de Bilhetes     ");
        System.out.println("====================================");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Eventos disponíveis ===");
            List<Evento> eventos = controller.getEventos();

            for (int i = 0; i < eventos.size(); i++) {
                System.out.print((i + 1) + " - ");
                eventos.get(i).exibirDetalhes();
            }

            System.out.print("\nDigite o numero do evento para comprar o bilhete (ou 0 para sair): ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                continuar = false;
            }
            else if (opcao > 0 && opcao <= eventos.size()) {
                Evento eventoEscolhido = eventos.get(opcao - 1);
                Bilhete bilhete = controller.comprarBilhete(eventoEscolhido);

                if (bilhete != null) {
                    System.out.println("\n--- Bilhete gerado com sucesso! ---");
                    bilhete.imprimirBilhete();
                }
            }
            else {
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}

