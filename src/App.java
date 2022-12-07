import java.util.Scanner;

public class App {
    public static String Moldura(double linha, double coluna) {
        String saida = "";

        for (double k = 0; k < linha; k++) {
            if (k == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (k == (linha - 1)) {
                System.out.print("+");
            }

        }

        for (double l = 0; l < coluna; l++) {
            for (double i = 0; i < linha; i++) {
                if (i == 0) {
                    System.out.print("\n|");
                } else {
                    System.out.print(" ");
                }

                if (i == (linha - 1)) {
                    System.out.print(" |");
                }
            }
        }

        for (double m = 0; m < linha; m++) {
            if (m == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (m == (linha - 1)) {
                System.out.print("+");
            }

        }
        return saida;
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Tamanho da linha ? ");
        double linha = teclado.nextInt();

        if (linha < 1) {
            linha = 1;
        } else if (linha > 20) {
            linha = 20;
        }

        System.out.print(" Tamanho da coluna ? ");
        double coluna = teclado.nextInt();

        if (coluna < 1) {
            coluna = 1;
        } else if (coluna > 20) {
            coluna = 20;
        }

        System.out.println(Moldura(linha, coluna));
        teclado.close();
    }
}