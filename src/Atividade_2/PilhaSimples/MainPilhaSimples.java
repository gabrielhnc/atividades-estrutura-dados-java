package Atividade_2.PilhaSimples;

public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples ps = new PilhaSimples(5);

        System.out.println("=== TESTE ESTRUTURA DE DADOS PILHA (SIMPLES) ==="); // Estrutura de Dados LIFO (Last In, First Out)

        System.out.println("\nDESEMPILHANDO COM A PILHA VAZIA: ");
        ps.desempilhar();

        System.out.println("\nEMPILHANDO ELEMENTOS...");
        ps.empilhar(5); // Inicio (Base da pilha)
        ps.empilhar(3);
        ps.empilhar(1);
        ps.empilhar(2);
        ps.empilhar(4); // Fim (Topo da pilha)
        ps.empilhar(4); // Ultrapassa o limite do quarto indíce (estaCheia = true)

        ps.exibirPilha(); // Exibe a pilha começando pelo final (INDÍCE 4) até o início (INDÍCE 0)

        System.out.println("\nDESEMPILHANDO ELEMENTOS...");
        ps.desempilhar(); // Remove o último elemento da pilha (INDÍCE 4)

        ps.exibirPilha();

        System.out.println();

        ps.desempilhar();
        ps.desempilhar();
        ps.desempilhar();
        ps.desempilhar(); // Todos os elementos removidos da pilha
        ps.desempilhar(); // Tenta desempilhar uma pilha vazia (estaVazio = true)

        ps.exibirPilha(); // Exibindo a lista vazia

        System.out.println("\nEMPILHANDO NOVAMENTE...");
        ps.empilhar(10);
        ps.empilhar(15);
        ps.empilhar(7);
        ps.empilhar(3);
        ps.empilhar(20);

        ps.exibirPilha(); // Pilha empilhada novamente
    }
}
