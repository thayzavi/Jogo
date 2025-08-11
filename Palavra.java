public class Palavra {
    private String palavraOculta;
    private char[] progresso;

    public Palavra(String palavraOculta) {
        this.palavraOculta = palavraOculta.toUpperCase();
        this.progresso = new char[palavraOculta.length()];
        for (int i = 0; i < progresso.length; i++) {
            progresso[i] = '-';
        }
    }

    public boolean tentarLetra(char letra) {
        letra = Character.toUpperCase(letra);
        boolean acertou = false;
        for (int i = 0; i < palavraOculta.length(); i++) {
            if (palavraOculta.charAt(i) == letra) {
                progresso[i] = letra;
                acertou = true;
            }
        }
        return acertou;
    }

    public boolean palavraCompleta() {
        for (char c : progresso) {
            if (c == '-') {
                return false;
            }
        }
        return true;
    }

    public String mostrarProgresso() {
        StringBuilder sb = new StringBuilder();
        for (char c : progresso) {
            sb.append(c).append(' ');
        }
        return sb.toString();
    }

    public String getPalavraOculta() {
        return palavraOculta;
    }
}
