package Atividade_2.PilhaDinamica;

public class PilhaDinamica {
    NoInteiro topo; // Nó que aponta para o primeiro nó da pilha (Inicialmente = null)

    public PilhaDinamica() { // Construtor
        this.topo = null;
        System.out.println("Pilha Dinamica criada com sucesso!");
    }

    public void empilhar(int numero) {
        NoInteiro novoNo = new NoInteiro(numero); // Criação de um novo Nó
        novoNo.setProx(topo); // O novo, o qual recebe como contéudo o novo número, e passa a apontar para o
        // topo antigo "guardando" a referencia do proximo nó
        topo = novoNo; // Atualiza a referencia do topo, apontando agora para o novo nó

        System.out.println("O número " + numero + " foi empilhado!");
    }

    public void exibirPilha() { // Exibição da pilha
        System.out.println("\n=== Exibindo Pilha ===");
        if (!estaVazio()) {
            NoInteiro aux = topo; // Cria um Nó auxiliar para impedir que o topo tenha seu valor modificado
            while (aux != null) { // Enquanto aux for um nó válido (!= null), ele continua percorrendo a pilha e exibindo os elementos
                System.out.println(aux.getConteudo()); // Exibe o conteúdo do Nó aux iniciando pelo topo
                aux = aux.getProx(); // O aux agora começara a apontar para o proximo nó
            }
        }
    }

    public boolean estaVazio() { // Validação para verificar se existem elementos na pilha
        if (topo == null) { // topo = null, então não há elementos na pilha pois aponta para uma referencia nula)
            System.out.println("A pilha está vazia!");
            return true;
        }
        return false; // Se false, então o topo está apontando para um nó válido (!= null)
    }

    public void desempilhar() { //  "Remove" o conteúdo que o Nó topo está apontando, trocando a referencia atual dele para o proximo nó
        if (!estaVazio()) {
            System.out.println("O último número foi desempilhado (" + topo.getConteudo() + ")!");
            topo = topo.getProx();
        }
    }
}