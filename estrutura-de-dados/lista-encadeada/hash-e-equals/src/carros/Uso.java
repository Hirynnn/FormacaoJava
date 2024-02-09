package carros;

import java.util.*;

public class Uso {

    public static void main(String[] args) {

        //aplicando arvore

        //  Set<Carro> treeSetCarros = new TreeSet<>();
        //  treeSetCarros.add(new Carro("Ford"));
        //  treeSetCarros.add(new Carro("Pg"));
        //  treeSetCarros.add(new Carro("Romeuzao"));
        // treeSetCarros.add(new Carro("Uno"));

        //   System.out.println(treeSetCarros);

        //// aprendendo map

        Map<String, String> aluno = new HashMap<>();
    
        aluno.put("Nome", "Paulo");
        aluno.put("Idade", "29");
        aluno.put("Ano", "4 ano");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List< Map<String, String>> listAlunos = new ArrayList();

        listAlunos.add(aluno);

        Map<String,String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Dudu");
        aluno2.put("Idade", "23");
        aluno2.put("Ano", "9 ano");

        listAlunos.add(aluno2);


        List<Double> notas = new ArrayList();
        notas.add(2d);
        notas.add(4d);
        notas.add(5.3);
        notas.add(6d);
        notas.add(2d);
        Double soma = 0d;
        for(Double nota: notas){
            soma+=nota;
        }

        System.out.println(soma);

       // System.out.println(listAlunos);

        // System.out.println(aluno.containsKey("Nome"));



    }
}
