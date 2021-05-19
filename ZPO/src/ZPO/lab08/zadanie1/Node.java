package ZPO.lab08.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String data = null;

    private List<Node> children = new ArrayList<>();

    private Node parent = null;

    public Node(String data) {
        this.data = data;
    }

    public Node addChild(Node child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public List<Node> getChildren() {
        return children;
    }

    public String getData() {
        return data;
    }

    private void setParent(Node parent) {
        this.parent = parent;
    }

}