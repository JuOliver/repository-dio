package production.MJava.one.digitalinnovation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dama();
    }

    //Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
    public static void numerosPar() {
        String entrada;
        Scanner scanner = new Scanner(System.in);

        entrada = scanner.nextLine();
        for (int i = 2; i <= Integer.parseInt(entrada); i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
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
    public static void dama(){
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if( x1 == x2 && y1 == y2 )
                System.out.println("0");
            else if( x1 == x2 || y1 == y2)
                System.out.println("1");
            else if( (Math.abs(x1-x2)) == (Math.abs(y1-y2))) //verifica o valor absoluto
                System.out.println("1");
            else
                System.out.println("2");
        }
        sc.close();
    }
}
