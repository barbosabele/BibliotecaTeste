import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BibliotecaController biblioteca = new BibliotecaController();
        Scanner scanner = new Scanner(System.in);

        // Cadastro de Livros
        biblioteca.CadastroLivro(new LivroController("O Duque e Eu", "Julia Quinn", "Romance"));
        biblioteca.CadastroLivro(new LivroController("Eu choro demais", "Luiza Rodrigues", "Drama"));
        biblioteca.CadastroLivro(new LivroController("It: A Coisa", "Stephen King", "Terror"));
        biblioteca.CadastroLivro(new LivroController("O Castelo de Otranto", "Horace Walpole", "Terror"));
        biblioteca.CadastroLivro(new LivroController("Sol da Meia-Noite", "Stephenie Meyer", "Terror"));
        // Cadastro de Usuários
        biblioteca.CadastroUsuario(new UsuarioController("Isabele"));
        biblioteca.CadastroUsuario(new UsuarioController("Luiza"));

        // Interações com o Usuário
        while (true) {
            System.out.println("1. Alugar um Livro");
            System.out.println("2. Devolver um Livro");
            System.out.println("3. Sair");
            System.out.println("Escolha uma das opções acima");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.println("Digite o seu usuário: ");
                String nomeUsuario = scanner.nextLine();
                UsuarioController usuario = biblioteca.VerificarUsuario(nomeUsuario);

                if (usuario != null) {
                    System.out.println("Digite o título do livro que deseja alugar: ");
                    String tituloLivro = scanner.nextLine();
                    LivroController livro = biblioteca.VerificarLivro(tituloLivro);

                    if (livro != null) {
                        usuario.alugarLivro(livro);
                    }

                    else {
                        System.out.println("O livro não foi encontrado.");
                    }
                } else {
                    System.out.println("O usuário não foi encontrado.");
                }
            } else if (escolha == 2) {
                System.out.println("Digite o seu usuário: ");
                String nomeUsuario = scanner.nextLine();
                UsuarioController usuario = biblioteca.VerificarUsuario(nomeUsuario);

                if (usuario != null) {
                    usuario.devolverLivro();
                } else {
                    System.out.println("O usuário não foi encontrado.");
                }
            } else if (escolha == 3) {
                System.out.println("Fechando.");
                break;

            } else {
                System.out.println("A opção é inválida.");
            }
        }

        scanner.close();
    } 
}