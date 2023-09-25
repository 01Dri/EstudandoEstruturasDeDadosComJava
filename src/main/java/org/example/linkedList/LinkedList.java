package org.example.linkedList;

public class LinkedList {

    public static void main(String[] args) {
        // Listas vinculadas
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        // Repare a o numero 2 tem como seu sucessor, o 3, logo a função 'getLast' retorna 3
        System.out.println(linkedList.getLast());

    }
}
