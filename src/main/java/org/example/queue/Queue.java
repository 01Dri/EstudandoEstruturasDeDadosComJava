package org.example.queue;

import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        java.util.Queue<String> queue = new LinkedList<>();
        queue.add("Diego");
        queue.add("Melanie");
        queue.add("Carlos");

        // Repare que o valor 'Diego' é o primeiro valor que entrou na queue, logo ele é o primeiro a ser retirado
        // no remove, seguino um padrão de FIFO 'First in, First out'
        queue.remove();
        //[Melanie, Carlos]
        System.out.println(queue.toString());

    }
}
