package ZPO.lab08.zadanie1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Node root = new Node("MainFolder");
        Tree tree = new Tree(root);
        tree.createTree(new File("./src/ZPO/lab08/zadanie1/MainFolder"), root);

        TreeCollection collection = new TreeCollection(tree);

        System.out.println("None Traversal");
        collection.printTree();

        System.out.println("BFS Traversal");
        collection.selectBFSIterator();
        collection.printTree();

        System.out.println("DFS Traversal");
        collection.selectDFSIterator();
        collection.printTree();
    }

}
