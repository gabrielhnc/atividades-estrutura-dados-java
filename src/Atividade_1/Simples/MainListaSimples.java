package Atividade_1.Simples;

public class MainListaSimples {
    static void main() {
        ListaSimples lista = new ListaSimples(5);

        System.out.println("=== Adicionando Elementos [Tamanho 5] ===");
        lista.adicionarElemento("Macarrao");
        lista.adicionarElemento("Macarrao");
        lista.adicionarElemento("Pao");
        lista.adicionarElemento("Hamburguer");
        lista.adicionarElemento("Feijao");

        System.out.println("=================================================");

        lista.exibirElementos();

        System.out.println("=================================================");

        // ContarOcorrencias
        lista.contarOcorrencias("Macarrao");

        System.out.println("=================================================");

        // Substituir
        lista.substituir("Macarrao", "Pera");
    }
}
