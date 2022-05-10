package production.MJava.one.digitalinnovation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMediaAno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Double> mes = new ArrayList<>();

        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.println("Digite a temperatura: ");
            Double mesAno = s.nextDouble();
            mes.add(mesAno);
            count++;
        }
        System.out.println("Temperaturas: " + mes);
        System.out.println("----------");


        //media das temperaturas
        Iterator<Double> iterator = mes.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma / mes.size();
        System.out.printf("Media das temperaturas:%.2f %n", media);

        //temperatura acima da media
        Iterator<Double> iterator1 = mes.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next > media)
                System.out.println("Temperatura acima da media: " + next);
        }

        //mês das temperaturas acima de média por extenso
        System.out.println("Meses das temperaturas acima da média: ");
        Iterator<Double> doubleIterator = mes.iterator();
        count = 0;
        while (iterator.hasNext()) {
            Double temp = doubleIterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f ", temp);
                        break;
                    case (2):
                        System.out.printf("3 - marco: %.1f ", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f ", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f ", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f ", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da media.");
                }
            }
            count++;
        }

    }
}
