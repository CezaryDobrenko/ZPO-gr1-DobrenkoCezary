package ZPO.lab08.zadanie1;

public class TreeCollection {
    Iterator iterator;
    Tree tree;

    public TreeCollection(Tree tree){
        this.tree = tree;
    }

    public void selectBFSIterator(){
        ISearchIteratable bfs = new BFSSearchIterator(this.tree);
        this.iterator = bfs.createIterator();
    }

    public void selectDFSIterator(){
        ISearchIteratable dfs = new DFSSearchIterator(this.tree);
        this.iterator = dfs.createIterator();
    }

    public void printTree(){
        if (iterator != null){
            while (this.iterator.hasNext()){
                Object object = this.iterator.next();
                System.out.println(object);
            }
            System.out.println("End\n");
        } else {
            System.out.println("Select traversal method first");
            System.out.println("End\n");
        }
    }
}
