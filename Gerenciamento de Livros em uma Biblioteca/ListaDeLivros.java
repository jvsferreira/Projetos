package biblioteca;

import java.util.*;

public class ListaDeLivros {
    private static ArrayList<Livro> listLivros = new ArrayList<>();

    // Adicionar livros à lista.
    public void adicionarLivros(Livro l) {
        listLivros.add(l);
        ordem();
    }

    // Verificar livro já existente.
    public boolean livroJaExistente(Livro l) {
        return listLivros.contains(l);
    }       

    // Ordenar os livros em ordem alfabetica.
    public void ordem() {
        Comparator<Livro> comparator = new Comparator<>() {

            public int compare(Livro o1, Livro o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        };
        listLivros.sort(comparator);
    }

    // Pesquisar quantidade de livros de um autor.
    public int pesquisar(Autor autor) {
        int qtd = 0;
        for (Livro l : listLivros) {
            if (l.getAutor().equals(autor)) {
                qtd++;
            }
        }
        return qtd;
    }

    // Remover livro da lista.
    public boolean remove(String titulo) {
        for (Livro l : listLivros) {
            if (l.getTitulo().equals(titulo)) {
                listLivros.remove(l);
                return true;
            }
        }
        return false;
    }

    // Pesquisar quantidade de livros publicados entre dois anos.
    public int pesquisar(double anoInicial, double anoFinal) {
        int qtd = 0;
        for (Livro l : listLivros) {
            if (l.getAnoPub() >= anoInicial && l.getAnoPub() <= anoFinal) {
                qtd++;
            }
        }
        return qtd;
    }

    // Obter tamanho da lista de livros.
    public int size() {
        return listLivros.size();
    }

    // Obter um livro da lista pelo índice.
    public Livro get(int i) {
        return listLivros.get(i);
    }

    // Busca por palavra-chave.
    public ArrayList<Livro> buscarLivros(String palavraChave) {
        ArrayList<Livro> livrosEncontrados = new ArrayList<>();
    
        for (Livro l : listLivros) {
            if (l.getTitulo().toLowerCase().contains(palavraChave.toLowerCase())) {
                livrosEncontrados.add(l);
            }
        }
        return livrosEncontrados;
    }    

    public ArrayList<Livro> getListaDeLivros() {
        return listLivros;
    }
}