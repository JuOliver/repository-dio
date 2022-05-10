package production.MJava.one.digitalinnovation;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ResolucaoDesafios {
    public static void main(String[] args) {
        visitaNaFeira();
    }

    //Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
    public static void numerosPar() {
        String entrada;
        Scanner scanner = new Scanner(System.in);
        entrada = scanner.nextLine();
        try {
            for (int i = 2; i <= Integer.parseInt(entrada); i++) {

                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            System.out.println("Número inválido! Informe um número inteiro");
        }
    }

    /*
     * O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a posição de uma dama em
     *  um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas), de quantos movimentos, no mínimo,
     * ela precisa para chegar em outra casa do tabuleiro?
     *
     * A entrada contém vários casos de teste. A primeira e única linha de cada caso de teste contém quatro inteiros
     * X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). A dama começa na casa de coordenadas (X1, Y1), e a casa de destino é a
     * casa de coordenadas(X2, Y2). No tabuleiro, as colunas são numeradas da esquerda para a direita de 1 a 8 e as linhas
     * de cima para baixo também de 1 a 8. As coordenadas de uma casa na linha X e coluna Y são (X, Y ).
     *
     * O final da entrada é indicado por uma linha contendo quatro zeros.
     * */
    public static void dama() {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while (true) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            try {
                if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
                if (x1 == x2 && y1 == y2)
                    System.out.println("0");
                else if (x1 == x2 || y1 == y2)
                    System.out.println("1");
                else if ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) //verifica o valor absoluto
                    System.out.println("1");
                else
                    System.out.println("2");
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um numero inteiro");
                e.printStackTrace();
            }
        }
        sc.close();
    }

    public static double leNumero() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        return num;
    }

    public static void areaCirunferencia() {
        Scanner scan = new Scanner(System.in);
        double area;
        double raio;

        try {
            raio = scan.nextDouble();
            area = 3.14159 * (Math.pow(raio, 2));

            System.out.printf("A=%.4f\n", area);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    /*
     * E foi esperança que motivou a Vovó Zazá, uma senhora de 72 anos, a realizar seu sonho de começar um curso universitário.
     * Ela está fascinada com tudo o que diz respeito à Universidade: com as aulas, com a biblioteca, com os projetos de
     * pesquisa e extensão, com o restaurante universitário, mas especialmente com a carteirinha de estudante que ela pode
     * utilizar para pagar meia entrada no cinema. Semana passada, Vovó Zazá e seus colegas de turma foram ao cinema assistir
     * a um filme, mas ficaram estarrecidos com o aumento do preço do ingresso.
     * Mas ela não é muito boa em Matemática, e está solicitando sua ajuda para calcular a porcentagem de que precisa para
     * completar o cartaz.

     * Entrada
     * A única linha da entrada consiste de dois valores A e B (0.00 < A ≤ B ≤ 1000.00), os quais, fornecidos com exatos
     * dois dígitos após o ponto separador decimal, representam respectivamente o valor antigo e o valor novo do ingresso
     * do cinema.*/

    public static void valorCinema() {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número ");
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C;

        try {
            C = (((B - A) * 100.00) / A);
            System.out.printf("%.2f%%\n", C);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    /*
     * A entrada contém 2 valores inteiros, separados por um espaço.
     * Saída
     * Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.
     * Assegure que exista um espaço antes e depois do sinal de igualdade.  */

    public static void visitaNaFeira() {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        try {
            int x = a + b;
            System.out.println("X= " + x);
        } catch (InputMismatchException e) {
            System.out.println("Numero deve ser inteiro");
            e.printStackTrace();
            System.exit(0); //Ao terminar execucao do programa dentro do Try ou do Catch, finally não é executado
        } finally {
            System.out.println("Chegou no finally");
        }

    }
}
