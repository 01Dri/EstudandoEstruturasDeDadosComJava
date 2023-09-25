package org.example.stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        //Pilhas
        Stack<String> stacks = new Stack<>();
        stacks.add("Diego");
        stacks.add("Melanie");
        stacks.add("Carlos");

        // Repare que o ultimo valor a entrar foi 'Carlos' logo, o primeiro a ser removido no metodo pop é o valor 'Carlos'
        stacks.pop();
        // [Diego, Melanie]
        System.out.println(stacks.toString());

        // Retorna o primeiro elemento que entrou na pilha 'Diego'
        System.out.println(stacks.firstElement());
    }
}
