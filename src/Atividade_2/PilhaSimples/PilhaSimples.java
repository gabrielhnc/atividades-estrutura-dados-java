package Atividade_2.PilhaSimples;

public class PilhaSimples {
    Integer [] pilha;
    int topo;

    public PilhaSimples(int tamanho) {
        this.pilha = new Integer[tamanho];
        this.topo = -1; // Variavel  que guarda o valor do topo da pilha (Valor inicial = -1) | OBS: O valor é definido inicialmente como -1
        // devido ao inicio do indíce da lista simples, com isso, ao realizar o primeiro empilhamento, o topo vai assumir o indice 0, empilhando na primeira posição
    }

    public void empilhar(int numero) {
        if (!estaCheia()) {
            topo++; // Adicionando um valor ao topo para indicar o indice 0 e caso ocorra mais empilhamentos, o topo irá receber o indice 1
            pilha[topo] = numero;
            System.out.println("O número " + numero + " foi empilhado!");
        }
    }

    public boolean estaCheia() { // Validação se a pilha está cheia (Caso ultrapasse o limite de tamanho da lista)
        if (topo == pilha.length - 1) {
            System.out.println("A pilha está cheia!");
            return true;
        }
        return false;
    }

    public boolean estaVazio() { // Validação se a pilha está vazia (Caso o topo não receba novo valores, isso implica que ainda
        // não foi inserido nenhum valor na pilha)
        if (topo == -1) {
            System.out.println("A pilha está vazia!");
            return true;
        }
        return false;
    }

    public void exibirPilha() { // Exibição da pilha (Mostra os valores null devido à estrutura do for, onde o I é igual ao ultimo
        // indice da pilha, percorrendo a lista completa)
        System.out.println("\n=== Exibindo a Pilha ===");
        if(!estaVazio()) {
            for (int i = pilha.length-1; i >= 0; i--) {
                System.out.println(this.pilha[i]);
            }
        }
    }

    public void desempilhar() { // Desempilhar a pilha (Se baseia no topo, devido a lógica da pilha, onde somente o último elemento pode
        // ser removido). Logo quando o desempilhar() for chamado, o topo receberá null e será diminuido em um valor -> topo--
        if(!estaVazio()) {
            System.out.println("O último número foi desempilhado!");
            pilha[topo] = null;
            topo --;
        }
    }
}
