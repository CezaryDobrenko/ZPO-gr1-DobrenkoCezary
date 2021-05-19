package ZPO.lab08.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class BFSSearchIterator implements ISearchIteratable {
    private Tree tree;
    private List<Node> nodes = new ArrayList<>();

    public BFSSearchIterator(Tree tree){
        this.tree = tree;
        BFS(tree.root);
    }

    private void BFS(Node node) {
        List<Node> Queue = new ArrayList<Node>();
        Queue.add(node);
        while(!Queue.isEmpty()){
            Node temp = Queue.get(0);
            nodes.add(temp);
            Queue.remove(0);
            Queue.addAll(temp.getChildren());
        }
    }

    @Override
    public Iterator createIterator() {
        BFSIterator iterator = new BFSIterator();
        return iterator;
    }

    private class BFSIterator implements Iterator {
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