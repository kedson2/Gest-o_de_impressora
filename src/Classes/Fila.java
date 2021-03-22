/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/*import dataStructures.EmptyQueueException;*/

/**
 *
 * @author erro
 */
public class Fila {

    private int cabeca;
    private int cauda;
    private int total;
    private final Object[] elementos;

    public Fila(int capacidade) {
        this.cabeca = 0;
        this.cauda = 0;
        this.total = 0;
        elementos = new Object[capacidade];
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public int size() {
        return total;
    }

    public boolean isFull() {
        return total == elementos.length;
    }

    public void enqueue(Object element) {
        if (isFull()) {
            System.out.println("a fila cheia");
        }
        elementos[cauda] = element;
        cauda = (cauda + 1)%elementos.length;
        total++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("A fila esta vazia");
        }
        elementos[cabeca] = null;
        cabeca = (cabeca + 1)%elementos.length;;
        total--;
        cauda--;
        return elementos;
    }

    public void Imprim() {
        for (int c = 0; c < total; c++) {
            System.out.println(elementos[c]);
           
        }

    }
  

}
