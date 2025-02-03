package main;

import java.util.ArrayList;

public class BibliotecaController {
    private ArrayList<LivroController> Livros;
    private ArrayList<UsuarioController> Usuarios;

    public BibliotecaController(){
        Livros = new ArrayList<LivroController>();
        Usuarios = new ArrayList<UsuarioController>();
    }

    public ArrayList<LivroController> getLivros() {
        return Livros;
    }

    public void setLivros(ArrayList<LivroController> livros) {
        Livros = livros;
    }

    public ArrayList<UsuarioController> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<UsuarioController> usuarios) {
        Usuarios = usuarios;
    }

    public void CadastroLivro(LivroController livro) {
        Livros.add(livro);
        System.out.println("O livro" + livro.getTitulo() + "foi cadastrado com sucesso!");
    }
    
    public void CadastroUsuario(UsuarioController usuario) {
        Usuarios.add(usuario);
        System.out.println("O usuário" + usuario.getNome() + "foi cadastrado com sucesso!");
    }

    public UsuarioController VerificarUsuario(String nome) {
        for (UsuarioController usuario : Usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
        }
    }
        return null;
 }
        public LivroController VerificarLivro(String titulo) {
            for (LivroController livro : Livros) {
                if (livro.getTitulo().equals(titulo)) {
                    return livro;
                }
            }

        return null;
    }
}
