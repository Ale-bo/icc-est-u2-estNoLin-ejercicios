package main.Ejercicio_03_listLeves;

import java.util.*;


public class ListLevels {

     public static class Nodo {
        public int valor;
        public Nodo izquierda, derecha;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }
    public static List<LinkedList<Integer>> ListLevels(Nodo raiz) {
        List<LinkedList<Integer>> resultado = new ArrayList<>();
        if (raiz == null) return resultado;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            int nivelSize = cola.size();
            LinkedList<Integer> listaNivel = new LinkedList<>();

            for (int i = 0; i < nivelSize; i++) {
                Nodo nodoActual = cola.poll();
                listaNivel.add(nodoActual.valor);

                if (nodoActual.izquierda != null) cola.add(nodoActual.izquierda);
                if (nodoActual.derecha != null) cola.add(nodoActual.derecha);
            }
            resultado.add(listaNivel);
        }

        return resultado;
    }
}
