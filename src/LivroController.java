package main;

public class LivroController {

    private String titulo;
    private String autor;
    private String genero;
    private boolean disponivel;

    public LivroController(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true; // Por padrão, o livro estará disponível após o cadastro
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String toString() {
        return String.format("Livro{titulo='%s', autor='%s', disponivel=%b}", titulo, autor, disponivel);
    }
}