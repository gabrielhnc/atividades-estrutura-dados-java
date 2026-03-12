package Atividade_1.Dinamica;

import Atividade_1.ListaOperacoes;
import jdk.jfr.ContentType;

import java.sql.PreparedStatement;

public class ListaDinamica implements ListaOperacoes {
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista Dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String conteudo) {
        if(!this.existeInicio()) {
            this.inicio.setConteudo(conteudo);
        } else {
            No novoNo = new No(conteudo);
            No aux = this.inicio;
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    private boolean existeInicio() {
        if(this.inicio.getConteudo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void exibirElementos() {
        if(existeInicio()) {
            No aux = this.inicio;
            while(aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        } else {
            System.out.println("Não existem elementos na Lista Dinâmica.");
        }
    }

    public void removerElemento(String elemento) {
        if(existeInicio()) {
            if(buscarElemento(elemento)) {
                //removendo primeiro
                if(this.inicio.getConteudo().equals(elemento)) {
                    this.inicio = this.inicio.getProx();
                } else if(this.inicio.getProx() != null) {
                    No aux = this.inicio;
                    do {
                        if(aux.getProx().getConteudo().equals(elemento)) {
                            aux.setProx(aux.getProx().getProx());
                            return;
                        }
                        aux = aux.getProx();
                    } while (aux != null);
                } else {
                    this.inicio.setConteudo(null);
                }

                //removendo intermediário
                //método de busca
            }

        } else {
            System.out.println("Não existem elementos na lista.");
        }
    }

    public boolean buscarElemento(String elemento) {
        No aux = this.inicio;

        do {
            if(aux.getConteudo().equals(elemento)) {
                System.out.println("Elemento " + elemento + " encontrado.");
                return true;
            }
            aux = aux.getProx();
        } while(aux != null);
        System.out.println("Elemento " + elemento + " não encontrado!");
        return false;
    }

    @Override
    public int removerTodas(String elemento) {
        int remov = 0;

        if (!existeInicio()) {
            System.out.println("A lista está vazia!");
            return 0;
        }

        while (existeInicio() && inicio.getConteudo().equals(elemento)) {
            System.out.println("Removendo o inicio: " + elemento);

            if (inicio.getProx() != null) {
                inicio = inicio.getProx();
            } else {
                inicio.setConteudo(null);
            }
            remov++;
        }

        if (existeInicio()) {
            No aux = inicio;
            while (aux.getProx() != null) {
                if (aux.getProx().getConteudo().equals(elemento)) {
                    System.out.println("Removendo: " + elemento);

                    aux.setProx(aux.getProx().getProx());
                    remov++;

                } else {
                    aux = aux.getProx();
                }
            }
        }

        System.out.println("Total de remoções: " + remov);
        return remov;
    }

    @Override
    public int contar() {
        int cont = 0;

        if (!existeInicio()) {
            System.out.println("A lista está vazia!");
            return 0;
        }

        No aux = this.inicio;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        return 0;
    }

    @Override
    public String obter(int indice) {
        return "";
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        return false;
    }

    @Override
    public String removerPorIndice(int indice) {
        return "";
    }

    @Override
    public void limpar() {

    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        return 0;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        return 0;
    }

    @Override
    public int substituir(String antigo, String novo) {
        return 0;
    }
}