package biblioteca;


public class Livro {
    // Atributos
    private String titulo;
    private Long isbn;
    private Autor autor;
    private String editora;
    private int anoPub;

    public Livro() {
        //default
    }

    // Método construtor da classe
    public Livro(String titulo, Long isbn, Autor autor, String editora, int anoPub) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.anoPub = anoPub;
    }

    // Getters e setters da classe
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    // Assinatura do método equals() da superclasse
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro))
            return false;
        Livro l = (Livro) o;
        return this.isbn.equals(l.getIsbn());
    }

    // Sobrescrita do método toString() da superclasse
    @Override
    public String toString() { 
        return "\nTítulo: " + this.getTitulo() +
                "\nISBN: " + this.getIsbn() +
                "\nAutor: " + this.autor.getAutor() +
                "\nEditora: " + this.getEditora() +
                "\nAno de Publicação: " + this.getAnoPub();
    }

}