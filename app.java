import java.util.Scanner;
import java.util.ArrayList;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        ListaDeLivros lista = new ListaDeLivros();

        int menu;
        Livro objLivro;

        String titulo, autor, editora, paisAutor;
        Long isbn;
        int anoPub;

        do {
            exibirMenu();
            menu = entrada.nextInt();
            Autor objAutor;

            switch (menu) {

                // Cadastro do objeto livro.
                case 1:
                    System.out.println("Digite o título: ");
                    titulo = entradaString.nextLine();

                    System.out.println("Digite o ISBN: ");
                    isbn = entrada.nextLong();

                    System.out.println("Digite o Autor: ");
                    autor = entradaString.nextLine();

                    System.out.println("Digite o país do autor: ");
                    entrada.nextLine();
                    paisAutor = entrada.nextLine();

                    System.out.println("Digite a editora: ");
                    editora = entradaString.nextLine();

                    System.out.println("Digite o ano de publicação: ");
                    anoPub = entrada.nextInt();

                    objLivro = new Livro(titulo, isbn, new Autor(autor, paisAutor), editora, anoPub);
                    
                    /**
                    * Bloco try/catch: se já há um livro igual na
                    * lista joga a exceção ExcecaoLivroJaExistente.
                    */
                    try {
                        if (lista.livroJaExistente(objLivro)) {
                            throw new ExcecaoLivroJaExistente("Este livro já foi cadastrado!");
                        } else {
                            lista.adicionarLivros(objLivro);
                            System.out.println("Livro cadastrado com sucesso");
                        }
                    } 
                    catch (ExcecaoLivroJaExistente e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                /**
                 * Lista dos livros exibida em ordem alfabética;
                 * Também é onde está sendo utilizado o método
                 * toString() da classe Livro.
                 */
                case 2:

                    if (lista.getListaDeLivros().isEmpty()) {
                        System.out.println("Não existem livros cadastrados! ");
                    } else {
                        System.out.println("Lista dos Livros: ");
                        int i = 1;
                        for (Livro l : lista.getListaDeLivros()) {
                            System.out.println("\n====== Livro Nº " + (i++) + " ======");
                            System.out.println(l.toString());
                        }
                    }
                    break;

                // Remoção de um livro.
                case 3:
                    System.out.println("Digite o Título do Livro: ");
                    titulo = entradaString.nextLine();

                    if (lista.getListaDeLivros().isEmpty()) {
                        System.out.println("Não existem livros cadastrados! ");
                    } else if (lista.remove(titulo)) {
                        System.out.println("Livro removido com sucesso! ");
                    } else {
                        System.out.println("Título não encontrado. ");
                    } 
                    break;

                /**
                * Pesquisa por autor;
                * Também utiliza o método toString()
                * da classe Livro
                */ 
                case 4: 
                    System.out.println("Pesquisar por Autor: ");
                    autor = entradaString.nextLine();
                    System.out.println("\n====== Livros do autor " + autor + " ======");
                    boolean encontrouLivros = false;

                    for (Livro livro : lista.getListaDeLivros()) {
                        objAutor = livro.getAutor();
                        if (objAutor.getAutor().equalsIgnoreCase(autor)) {
                            System.out.println(livro.toString());
                            encontrouLivros = true;
                            }
                        } if (!encontrouLivros) {
                            System.out.println("Não foram encontrados livros do autor " + autor);
                        }
                    break;

                // Pesquisa por período.
                case 5:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Digite o ano inicial do intervalo: ");
                    int anoInicial = input.nextInt();
                    System.out.print("Digite o ano final do intervalo: ");
                    int anoFinal = input.nextInt();

                    System.out.println("Livros publicados entre " + anoInicial + " e " + anoFinal + ":");

                    for (Livro livro : lista.getListaDeLivros()) {
                        if (livro.getAnoPub() >= anoInicial && 
                            livro.getAnoPub() <= anoFinal) {

                            System.out.println(livro.getTitulo());
                        }
                    }
                    break;

                /**
                * Pesquisa por palavra-chave;
                * Também utiliza o método toString()
                * da classe Livro
                */
                case 6:
                    System.out.println("Digite uma palavra-chave para buscar livros:");
                    String palavraChave = entradaString.nextLine();
                    ArrayList<Livro> livrosEncontrados = lista.buscarLivros(palavraChave);

                    if (livrosEncontrados.isEmpty()) {
                        System.out.println("Nenhum livro encontrado.");
                    } else {
                        System.out.println("Livros encontrados:");

                        for (Livro l : livrosEncontrados) {
                        
                            System.out.println(l.toString());
                        }
                    }
                    break;

                // Mostra o total de livros cadastrados.
                case 7:
                    System.out.println("Total de livros na biblioteca: " + lista.size());
                    break;

                // Encerra o programa.
                case 8:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        }
        while (menu != 8);

        entrada.close();
        entradaString.close();
    }

    static void exibirMenu() {
        System.out.println("\n===== Livros da Biblioteca =====");
        System.out.println(" 1 - Cadastrar um livro");
        System.out.println(" 2 - Listar os livros");
        System.out.println(" 3 - Remover um livro");
        System.out.println(" 4 - Pesquisar por autor");
        System.out.println(" 5 - Pesquisar por período");
        System.out.println(" 6 - Pesquisar por palavra-chave");
        System.out.println(" 7 - O total de livros na biblioteca");
        System.out.println(" 8 - Sair");
    }

}
