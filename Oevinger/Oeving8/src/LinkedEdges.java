import java.util.ArrayList;

public class LinkedEdges {
    private Edge[] edges;

    public LinkedEdges(int noEdges) {
        edges = new Edge[noEdges];
    }

    public Edge[] getEdges() {
        return edges;
    }
    public boolean hasEdges(int index){
        return edges[index] != null;
    }
    /**
     * legger til en node bakerst i den lenka lista
     */
    public void pushBack(int index, Edge edge){
        Edge current = edges[index];
        if(current == null){
            edges[index] = edge;
            return;
        }
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(edge);
    }


}
