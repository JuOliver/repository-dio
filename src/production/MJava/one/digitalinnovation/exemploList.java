package production.MJava.one.digitalinnovation;

import java.util.*;

public class exemploList {

    public static void main(String[] args) {
        ordenacaoList();
    }

    public static void metodos() {
        System.out.println("Lista para adicionar 7 notas");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(5.0);
        notas.add(9.3);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicionando na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substituindo a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Conferindo se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("Exibindo a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exibindo menor nota: " + Collections.min(notas));

        System.out.println("Exibindo maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibindo a soma dos valores: " + soma);

        System.out.println("Exibindo a média das notas: " + (soma / notas.size()));

        System.out.println("Removendo a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo a nota da posicao 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Removendo as notas menores que 7 e exibindo a lista: ");
        Iterator<Double> i = notas.iterator();
        while (i.hasNext()) {
            Double next = i.next();
            if (next < 7) i.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Conferindo se a lista esta vazia: " + notas.isEmpty());
    }

    public static void ordenacaoList() {
        List<Gato> gatoList = new ArrayList<>() {{
            add(new Gato("John", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("John", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de insercao\t--");
        System.out.println(gatoList);

        System.out.println("--\tOrdem aleatoria\t--");
        Collections.shuffle(gatoList);
        System.out.println(gatoList);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(gatoList);
        System.out.println(gatoList);

        System.out.println("--\tOrdem Idade\t--");
        Collections.sort(gatoList, new comparatorIdade());
//        gatoList.sort(new comparatorIdade());
        System.out.println(gatoList);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;


    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //organiza na ordem que eu determinar, no caso por nome
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class comparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}