package ZPO.lab08.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class DFSSearchIterator implements ISearchIteratable {
    private Tree tree;
    private List<Node> nodes = new ArrayList<>();

    public DFSSearchIterator(Tree tree){
        this.tree = tree;
        DFS(tree.root);
    }

    private void DFS(Node node) {
        nodes.add(node);
        for(Node child : node.getChildren()){
            DFS(child);
        }
    }

    @Override
    public Iterator createIterator() {
        DFSIterator iterator = new DFSIterator();
        return iterator;
    }

    private class DFSIterator implements Iterator {
        private int position;

        @Override
        public boolean hasNext(){
            if(position < nodes.size()){
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return nodes.get(position++).getData();
            } else {
                return null;
            }
        }
    }
}
