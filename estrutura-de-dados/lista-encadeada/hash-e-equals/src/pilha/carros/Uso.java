package pilha.carros;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Uso {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Uno"));
        stackCarros.push(new Carro("Chines"));


        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.isEmpty());






    }
}
