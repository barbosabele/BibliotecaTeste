package main;
public class UsuarioController {

    private String nome;
    private LivroController livroAlugado;

    public UsuarioController(String nome) {
        this.nome = nome;
        this.livroAlugado = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LivroController getLivroAlugado() {
        return livroAlugado;
    }

    public void setLivroAlugado(LivroController livroAlugado) {
        this.livroAlugado = livroAlugado;
    }

    /**
     * Método para concluir o aluguel do livro ao usuário caso esteja disponível.
     * 
     * @param LivroController
     */
    public void alugarLivro(LivroController livro) {
        if (livro.isDisponivel()) {
            livroAlugado = livro;
            livro.setDisponivel(false);
            System.out.println("Você alugou o livro: " + livro.getTitulo() + " com sucesso!");
        } else {
            System.out.println("Não foi possível alugar o livro: " + livro.getTitulo());
        }
    }

    public void devolverLivro() {
        if (livroAlugado != null) {
            livroAlugado.setDisponivel(true);
            System.out.println("Você devolveu o livro: " + livroAlugado.getTitulo() + " com sucesso!");
            livroAlugado = null;
        } else {
            System.out.println(nome + " você não possui um livro para devolver.");
        }
    }
}