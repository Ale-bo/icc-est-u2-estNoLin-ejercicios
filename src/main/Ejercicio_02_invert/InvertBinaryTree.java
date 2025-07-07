package main.Ejercicio_02_invert;

import java.util.LinkedList;
import java.util.Queue;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    public static class Nodo {
        public int valor;
        public Nodo izquierda, derecha;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }

    public static class InvertTree {
        public Nodo invertir(Nodo raiz) {
            if (raiz == null) return null;

            Nodo temp = raiz.izquierda;
            raiz.izquierda = invertir(raiz.derecha);
            raiz.derecha = invertir(temp);

            return raiz;
        }

        public void imprimirPorNiveles(Nodo raiz) {
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
