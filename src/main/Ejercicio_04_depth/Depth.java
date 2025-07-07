package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
     public static class Nodo {
        public int valor;
        public Nodo izquierda, derecha;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }
    public static int maxDepth(Nodo raiz) {
        if (raiz == null) return 0;
        int izquierda = maxDepth(raiz.izquierda);
        int derecha = maxDepth(raiz.derecha);
        return Math.max(izquierda, derecha) + 1;
    }
}
