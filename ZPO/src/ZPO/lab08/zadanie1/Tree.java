package ZPO.lab08.zadanie1;

import java.io.File;

public class Tree {
    public Node root;

    public Tree(Node root){
        this.root = root;
    }

    public Node createTree(File filenode, Node parent){
        if(filenode.isDirectory()){
            String[] subNote = filenode.list();
            for(String filename : subNote){
                Node new_parent = new Node(filename);
                parent.addChild(new_parent);
                createTree(new File(filenode, filename), new_parent);
            }
        }
        return parent;
    }
}
