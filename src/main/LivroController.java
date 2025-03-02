package main;

public class LivroController {

    private int idLivro; 
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponivel;

    public void Livro(String titulo, String autor, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
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

    public String toString(){     
        return String.format("Livro{titulo='%s%c, autor='%c, disponivel=%s%c", titulo, '\'', '\'', disponivel, '}');
    }
}