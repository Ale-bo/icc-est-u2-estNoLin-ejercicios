
package main.Ejercicio_01_insert;

import java.util.LinkedList;
import java.util.Queue;


public class InsertBST {

    public static class Nodo {
        public int valor;
        public Nodo izquierda, derecha;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }

    public static class BST {
        public Nodo raiz;

        public void insert(int valor) {
            raiz = insertarRec(raiz, valor);
        }

        private Nodo insertarRec(Nodo nodo, int valor) {
            if (nodo == null) return new Nodo(valor);
            if (valor < nodo.valor) nodo.izquierda = insertarRec(nodo.izquierda, valor);
            else if (valor > nodo.valor) nodo.derecha = insertarRec(nodo.derecha, valor);
            return nodo;
        }

        public void imprimirPorNiveles() {
            if (raiz == null) return;
            Queue<Nodo> cola = new LinkedList<>();
            cola.add(raiz);

            while (!cola.isEmpty()) {
                int nivel = cola.size();
                for (int i = 0; i < nivel; i++) {
                    Nodo actual = cola.poll();
                    System.out.print(actual.valor + " ");
                    if (actual.izquierda != null) cola.add(actual.izquierda);
                    if (actual.derecha != null) cola.add(actual.derecha);
                }
                System.out.println();
            }
        }
    }
}
