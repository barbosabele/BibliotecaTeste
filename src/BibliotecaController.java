package main;

import java.util.ArrayList;

public class BibliotecaController {
    private ArrayList<LivroController> livros;
    private ArrayList<UsuarioController> usuarios;

    public BibliotecaController() {
        livros = new ArrayList<LivroController>();
        usuarios = new ArrayList<UsuarioController>();
    }

    public ArrayList<LivroController> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<LivroController> livros) {
        this.livros = livros;
    }

    public ArrayList<UsuarioController> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<UsuarioController> usuarios) {
        this.usuarios = usuarios;
    }

    public void CadastroLivro(LivroController livro) {
        livros.add(livro);
        System.out.println("O livro '" + livro.getTitulo() + "' foi cadastrado com sucesso!");
    }

    public void CadastroUsuario(UsuarioController usuario) {
        usuarios.add(usuario);
        System.out.println("O usuário '" + usuario.getNome() + "' foi cadastrado com sucesso!");
    }

    public UsuarioController VerificarUsuario(String nome) {
        for (UsuarioController usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null; // Retornará null se não encontrar o usuário
    }

    public LivroController VerificarLivro(String titulo) {
        for (LivroController livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }

        return null; // Retornará null se não encontrar o livro
    }
}
