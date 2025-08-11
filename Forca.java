public class Forca {
    private int erros;

    public Forca() {
        erros = 0;
    }

    public void incrementarErro() {
        erros++;
    }

    public int getErros() {
        return erros;
    }

    public boolean perdeu() {
        return erros >= 6;
    }

    public void mostraForca() {
        System.out.println("+----+");
        System.out.println("|     |");

        switch (erros) {
            case 0 -> {
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
            }
            case 1 -> {
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
            }
            case 2 -> {
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
            }
            case 3 -> {
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
            }
            case 4 -> {
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
            }
            case 5 -> {
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
            }
            case 6 -> {
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
            }
        }
        System.out.println("     |");
        System.out.println("=========");
    }
}
