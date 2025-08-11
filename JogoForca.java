import java.util.Scanner;

public class JogoForca {
    private Palavra palavra;
    private Forca forca;
    private Scanner scanner;

    public JogoForca(String palavraOculta) {
        palavra = new Palavra(palavraOculta);
        forca = new Forca();
        scanner = new Scanner(System.in);
    }

    public void jogar() {
        System.out.println("Bem-vindo ao jogo da forca!");

        while (true) {
            forca.mostraForca();
            System.out.println("Palavra: " + palavra.mostrarProgresso());
            System.out.println("Digite uma letra: ");
            String entrada = scanner.nextLine();

            if (entrada.length() != 1) {
                System.out.println("Digite uma letra.");
                continue;
            }
            char letra = entrada.charAt(0);
            boolean acertou = palavra.tentarLetra(letra);

            if (!acertou) {
                System.out.println("Letra incorreta!");
                forca.incrementarErro();
            } else {
                System.out.println("Acertou uma letra!");
            }
            if (palavra.palavraCompleta()) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavra.getPalavraOculta());
                break;
            }
            if (forca.perdeu()) {
                forca.mostraForca();
                System.out.println("Você perdeu! A palavra certa era: " + palavra.getPalavraOculta());
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== Jogo da Forca ===");
            System.out.println("1 - Jogar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.print("Digite a palavra secreta: ");
                String palavraSecreta = sc.nextLine();
                JogoForca game = new JogoForca(palavraSecreta);
                game.jogar();
            } else if (opcao.equals("2")) {
                System.out.println("Saindo do jogo. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
