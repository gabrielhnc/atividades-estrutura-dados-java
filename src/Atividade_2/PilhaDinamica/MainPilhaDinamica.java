package Atividade_2.PilhaDinamica;

public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pd = new PilhaDinamica();

        System.out.println("=== TESTE ESTRUTURA DE DADOS PILHA (DINÂMICA) ==="); // LIFO

        System.out.println("\nDESEMPILHANDO COM A PILHA VAZIA:");
        pd.desempilhar();

        System.out.println("\nEMPILHANDO ELEMENTOS...");
        pd.empilhar(5); // BASE
        pd.empilhar(3);
        pd.empilhar(1);
        pd.empilhar(2);
        pd.empilhar(4); // TOPO (Sem limite de tamanho devido a natureza da pilha -> Dinâmica)

        pd.exibirPilha();

        System.out.println("\nDESEMPILHANDO ELEMENTOS...");
        pd.desempilhar(); // Remove o topo

        pd.exibirPilha();

        System.out.println();

        pd.desempilhar();
        pd.desempilhar();
        pd.desempilhar();
        pd.desempilhar(); // Remoção de todos os elementos
        pd.desempilhar(); // Tenta remover com pilha vazia

        pd.exibirPilha(); // Exibindo pilha vazia

        System.out.println("\nEMPILHANDO NOVAMENTE...");
        pd.empilhar(10);
        pd.empilhar(15);
        pd.empilhar(7);
        pd.empilhar(3);
        pd.empilhar(20);

        pd.exibirPilha(); // Pilha empilhada novamente
    }
}