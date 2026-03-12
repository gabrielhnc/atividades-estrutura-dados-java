package Atividade_1.Dinamica;

public class MainListaDinamica {
    static void main() {
        ListaDinamica lista = new ListaDinamica();

        System.out.println("=== Adicionando Elementos [Tamanho 5] ===");
        lista.adicionarElemento("Macarrao");
        lista.adicionarElemento("Pão");
        lista.adicionarElemento("Macarrao");
        lista.adicionarElemento("Hamburguer");
        lista.adicionarElemento("Macarrao");

        System.out.println("=================================================");

        lista.exibirElementos();

        System.out.println("=================================================");

        lista.removerTodas("Macarrao");

        lista.exibirElementos();

        System.out.println("=================================================");

        lista.contar();
    }
}
