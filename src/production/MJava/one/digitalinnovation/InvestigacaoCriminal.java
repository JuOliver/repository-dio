package production.MJava.one.digitalinnovation;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class InvestigacaoCriminal {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de perguntas: ");
        System.out.println("\n1 - Telefonou para a vítima?");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("2 - Esteve no local do crime?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("3 - Mora perto da vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("4 - Devia para a vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("5 - Já trabalhou com a vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> iterator = respostas.iterator();
        while (iterator.hasNext()) {
            String resp = iterator.next();
            if (resp.contains("s")) {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINO");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }

    }
}
