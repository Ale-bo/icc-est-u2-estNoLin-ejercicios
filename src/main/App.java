package main;

import java.util.LinkedList;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_02_invert.InvertBinaryTree.InvertTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        
     System.out.println("\n--- Ejercicio 01: Insertar en BST ---");
        InsertBST.BST bst = new InsertBST.BST();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int v : valores) bst.insert(v);
        bst.imprimirPorNiveles();

        System.out.println("\n--- Ejercicio 02: Invertir Árbol Binario ---");
        InvertTree binaryTree = new InvertTree();
        InvertBinaryTree.Nodo raizInvert = new InvertBinaryTree.Nodo(4);
        raizInvert.izquierda = new InvertBinaryTree.Nodo(2);
        raizInvert.derecha = new InvertBinaryTree.Nodo(7);
        raizInvert.izquierda.izquierda = new InvertBinaryTree.Nodo(1);
        raizInvert.izquierda.derecha = new InvertBinaryTree.Nodo(3);
        raizInvert.derecha.izquierda = new InvertBinaryTree.Nodo(6);
        raizInvert.derecha.derecha = new InvertBinaryTree.Nodo(9);

        System.out.println("Árbol original:");
        binaryTree.imprimirPorNiveles(raizInvert);

        InvertBinaryTree.Nodo invertido = binaryTree.invertir(raizInvert);
        System.out.println("Árbol invertido:");
        binaryTree.imprimirPorNiveles(invertido);

        System.out.println("\n--- Ejercicio 03: Listar Niveles en Listas Enlazadas ---");
        ListLevels.Nodo raizList = new ListLevels.Nodo(4);
        raizList.izquierda = new ListLevels.Nodo(2);
        raizList.derecha = new ListLevels.Nodo(7);
        raizList.izquierda.izquierda = new ListLevels.Nodo(1);
        raizList.izquierda.derecha = new ListLevels.Nodo(3);
        raizList.derecha.izquierda = new ListLevels.Nodo(6);
        raizList.derecha.derecha = new ListLevels.Nodo(9);

        var niveles = ListLevels.ListLevels(raizList);
        for (LinkedList<Integer> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i));
                if (i < nivel.size() - 1) System.out.print(" -> ");
            }
            System.out.println();
        }

        System.out.println("\n--- Ejercicio 04: Calcular Profundidad Máxima ---");
        Depth.Nodo raizProf = new Depth.Nodo(4);
        raizProf.izquierda = new Depth.Nodo(2);
        raizProf.derecha = new Depth.Nodo(7);
        raizProf.izquierda.izquierda = new Depth.Nodo(1);
        raizProf.izquierda.derecha = new Depth.Nodo(3);
        raizProf.izquierda.izquierda.izquierda = new Depth.Nodo(8);

        int profundidad = Depth.maxDepth(raizProf);
        System.out.println("Profundidad máxima del árbol: " + profundidad);
    }

}
