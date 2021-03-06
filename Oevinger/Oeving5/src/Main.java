import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] buttons = { "Yes", "Yes to all", "No", "Cancel" };

        int rc = JOptionPane.showOptionDialog(null, "Question ?", "Confirmation",
            JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

        File graphFile = new File("/home/ingebrigt/Documents/uni - 2/Algoritmer og " +
            "datastrukturer/Oevinger/Oeving5/L7g6");

        System.out.println("Nabolista");
        HashMap<Integer, List<Node>> stronglyConnectedLink = new LinkedListGraph(new BufferedReader(new FileReader(graphFile))).getStronglyConnnected();
        System.gc();
        //svar fra nabotabellen
        String answerLinked = "Komponent   :   Noder i Komponenten\n";
        int componentsLinked = 0;
        for (Map.Entry<Integer, List<Node>> set : stronglyConnectedLink.entrySet()) {
            answerLinked += set.getKey() + " : ";
            componentsLinked++;
            for(Node n : set.getValue()){
                answerLinked += n.index + " ";
            }
            answerLinked+="\n";
        }
        System.out.println("Grafen har " + componentsLinked + " sterkt sammenhengende komponenter");
        System.out.println(answerLinked);

        System.out.println("-------------------------------------");
        System.out.println("nabotabellen:");
        GraphTable doubleArrayGraph = new GraphTable(new BufferedReader(new FileReader(graphFile)));
        HashMap<Integer, List<Node>> stronglyConnected = doubleArrayGraph.getStronglyConnnected();
        //svar fra nabotabellen
        String answer = "Komponent   :   Noder i Komponenten\n";
        int components = 0;
        for (Map.Entry<Integer, List<Node>> set : stronglyConnected.entrySet()) {
            answer += set.getKey() + " : ";
            components++;
            for(Node n : set.getValue()){
                answer += n.index + " ";
            }
            answer+="\n";
        }
        System.out.println("Grafen har " + components + " sterkt sammenhengende komponenter");
        System.out.println(answer);

    }
}



class Edge{
    Edge nextEdge = null;
    Node to = null;
    boolean exist = false;

    public Edge(){
    }
    public Edge(Node n, Edge nextEdge){
        to = n;
        this.nextEdge = nextEdge;
    }
}
class Node{
    static int inf = 1000000000;
    static int time = 0;
    int index;
    int foundTime;
    int finsishedTime;
    int dist = inf;
    Edge nextEdge = null;

    public Node(int index){
        this.index = index;
    }
    public void setFoundTime(){
        this.foundTime = ++time;
    }
    public static void resetTime(){
        time = 0;
    }
    public void setFinsishedTime(){
        this.finsishedTime = ++time;
    }
    public String toString(){
        return "Index: " + index + "\n"+
            "Found time: " + foundTime + "\n" +
            "Finished time: " + finsishedTime + "\n";
    }
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Node)) return false;
        return this.index == ((Node) o).index;
    }
}

/**
 * Grafer som nabotabell, denne klarer ikke håndtere Skandinaviagrafen, da pcen min har for lite
 * ram til heapen som trengs :)
 */
class GraphTable {
    int N;
    Edge edgeTable[][];
    Node nodes[];
    public GraphTable(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        edgeTable = new Edge[N][N];
        nodes = new Node[N];
        for(int i = 0; i < N; ++i){
            nodes[i] =  new Node(i);
            for(int j = 0; j < N; ++j){
                edgeTable[i][j] = new Edge();
            }
        }
        int K = Integer.parseInt(st.nextToken());
        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            edgeTable[from][to].exist = true;
        }
    }
    public GraphTable(Edge[][] edgeTable){
        this.edgeTable = edgeTable;
        nodes = new Node[edgeTable.length];
        for(int i = 0; i < edgeTable.length; i++){
            nodes[i] =  new Node(i);
        }
        N = nodes.length;
    }
    public String toString(){
        String toString = "";
        for(Edge[] row : edgeTable){
            for(Edge edge : row){
                if ((edge.exist)) {
                    toString += 1;
                } else {
                    toString += 0;
                }
            }
            toString += "\n";
        }
        return toString;
    }
    public Edge[][] transposeTable() {
        Edge[][] transposedEdges = new Edge[edgeTable.length][edgeTable[0].length];
        for(int i = 0; i < edgeTable.length; i++){
            for(int j = 0; j < edgeTable[i].length; j++){
                transposedEdges[j][i] = edgeTable[i][j];
            }
        }
        return transposedEdges;
    }
    public List<Node> depthFirst(int nodeIndex, int dist){
        ArrayList<Node> foundNodes = new ArrayList<>();
        //for hver rad i kolonnen
        for(int i = 0; i < edgeTable[nodeIndex].length; i++){
            //hvis noden ikke er funnet
            if(nodes[nodeIndex].dist == Node.inf){
                nodes[nodeIndex].setFoundTime();
                nodes[nodeIndex].dist = ++dist;
                foundNodes.add(nodes[nodeIndex]);
            }
            //hvis det går kobling fra noden vi søker fra til node i
            else if(edgeTable[nodeIndex][i].exist && nodes[i].dist == Node.inf){
                nodes[i].setFoundTime();
                nodes[i].dist = ++dist;
                foundNodes.add(nodes[i]);
                foundNodes.addAll(depthFirst(i, dist));
            }
            //hvis man kommer helt til slutten av nodene
            if(nodes[nodeIndex].finsishedTime == 0 && i == edgeTable[nodeIndex].length-1){
                nodes[nodeIndex].setFinsishedTime();
            }
        }
        return foundNodes;
    }
    private List<Node> sortByFoundTime() {
        ArrayList<Node> foundNodes = new ArrayList<>();
        for (int i = 0; i < edgeTable.length; i++) {
            for (Node n : depthFirst(i, 0)) {
                if (!foundNodes.contains(n)) {
                    foundNodes.add(n);
                }
            }
        }
        //sorterer i synkende rekkefølge
        foundNodes.sort(Comparator.comparingInt(o -> -o.finsishedTime));
        return foundNodes;
    }
    public HashMap<Integer, List<Node>> getStronglyConnnected(){
        HashMap<Integer, List<Node>> testingHash = new HashMap<>();
        List<Node> foundNodes = sortByFoundTime();
        //transponerer tabellen
        GraphTable transposeTable = new GraphTable(transposeTable());
        int counter = 0;
        //for hver node sortert etter funnet tid
        for(Node n : foundNodes){
            ArrayList<Node> tempList = new ArrayList<>();
            //kjører dybde først på den transponerte tabellen
            for(Node n2 : transposeTable.depthFirst(n.index,0)){
                if(!tempList.contains(n2)){
                    tempList.add(n2);
                }
            }
            if(!tempList.isEmpty()){
                testingHash.put(counter, tempList);
                counter++;
            }

        }
        return testingHash;
    }
}

/**
 * Prøvde å implementere denne for å håndtere skandinavia-grafen, men får fortsatt problemer, har
 * dessverre ikke vilje til å debugge minneproblemer i java
 */
class LinkedListGraph {
    Node[] nodes;
    int N;
    public LinkedListGraph(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        nodes = new Node[N];
        for(int i = 0; i < N; ++i){
            nodes[i] =  new Node(i);
        }
        //antall kanter
        int numEdges = Integer.parseInt(st.nextToken());
        for(int i = 0; i < numEdges; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            Edge edge = new Edge(nodes[to],nodes[from].nextEdge);
            nodes[from].nextEdge = edge;
        }
    }
    public LinkedListGraph(Node[] nodes){
        this.nodes = nodes;
        N = nodes.length;
    }
    public Node[] transposeTable(){
        Node[] transposedTable = new Node[nodes.length];
        Edge tempEdge;
        for(Node n : nodes){
            transposedTable[n.index] = new Node(n.index);
        }
        //sjekker hvor det går veier til
        for(int i = 0; i < nodes.length; i++){
            //sjekker hvor det går veier fra
            for(int j = 0; j < nodes.length; j++){
                //dersom det er kobling fra j til i
                if(hasConnection(nodes[j],nodes[i])){
                    addConnection(transposedTable[i],transposedTable[j]);
                }
            }
        }
        return transposedTable;
    }
    private boolean hasConnection(Node from, Node to){
        Edge tempEdge = from.nextEdge;
        if(tempEdge == null){
            return false;
        }
        while(tempEdge.nextEdge != null){
            if(tempEdge.to.equals(to)){
                return true;
            }
            tempEdge = tempEdge.nextEdge;
        }
        return tempEdge.to.equals(to);
    }
    private void addConnection(Node fromNode, Node toNode){
        Edge tempEdge = fromNode.nextEdge;
        if(tempEdge == null){
            fromNode.nextEdge = new Edge(toNode,null);
            return;
        }
        //finner siste kant
        while(tempEdge.nextEdge != null){
            tempEdge = tempEdge.nextEdge;
        }
        tempEdge.nextEdge = new Edge(toNode,null);
    }
    public List<Node> depthFirst(int index, int dist) {
        //noden jeg søker fra
        Node startNode = nodes[index];
        //dersom noden ikke er funnet fra før så fant jeg den nå
        if(startNode.foundTime == 0){
            startNode.setFoundTime();
            startNode.dist = dist;
        }
        //nodene jeg finner i søket
        ArrayList<Node> foundNodes = new ArrayList<>();
        foundNodes.add(startNode);
        Edge tempedge = startNode.nextEdge;
        //dersom kanten finnes og den peker på en node
        while(tempedge != null && tempedge.to != null){
            //hvis noden kanten peker på ikke allerede er funnet
            if(tempedge.to.dist == Node.inf){
                //rekursivt søker fra alle nodene jeg kommer til
                for(Node n : depthFirst(tempedge.to.index,dist)){
                    if(!foundNodes.contains(n)){
                        foundNodes.add(n);
                    }
                }
            }
            //hopper videre til neste kan
            tempedge = tempedge.nextEdge;
        }
        //hvis noden vi er på ikke allerede er blitt ferdig
        if(startNode.finsishedTime == 0){
            startNode.setFinsishedTime();
        }
        return foundNodes;

    }
    public List<Node> sortByFoundTime() {
        ArrayList<Node> foundNodes = new ArrayList<>();
        //for hver node
        for (int i = 0; i < nodes.length; i++) {
            //så kjører vi et dybde-først søk
            for (Node n : depthFirst(i, 0)) {
                //legger til noden vi fant
                if (!foundNodes.contains(n)) {
                    foundNodes.add(n);
                }
            }
        }
        //sorterer i synkende rekkefølge
        foundNodes.sort(Comparator.comparingInt(o -> -o.finsishedTime));
        return foundNodes;
    }
    public HashMap<Integer, List<Node>> getStronglyConnnected(){

        HashMap<Integer, List<Node>> testingHash = new HashMap<>();
        //listene som har blitt funnet i dybde først søket sortert synkende på sortert tid
        List<Node> foundNodes = sortByFoundTime();
        //transponerer tabellen
        LinkedListGraph transposeTable = new LinkedListGraph(transposeTable());
        ArrayList<Node> allFound = new ArrayList<>();
        int counter = 0;
        //for hver node i den synkende rekkefølgen etter søket
        for(Node n : foundNodes){
            ArrayList<Node> tempList = new ArrayList<>();
            //dybde først-søk på den transponerte tabellen
            for(Node n2 : transposeTable.depthFirst(n.index,0)){
                //Hvis jeg ikke har denne sjekken på allFound så blir det lagt til mange ekstra komponenter med noder
                //som har blitt lagt til allerede
                if(!tempList.contains(n2) && !allFound.contains(n2)){
                    tempList.add(n2);
                    allFound.add(n2);
                }

            }
            if(!tempList.isEmpty()){
                testingHash.put(counter, tempList);
                counter++;
            }

        }
        return testingHash;
    }
    public String toString() {
        String answer = "";
        for(Node n : nodes){
            answer += n.index + " => ";
            Edge tempEdge = n.nextEdge;
            while(tempEdge != null){
                answer += tempEdge.to.index + " => ";
                tempEdge = tempEdge.nextEdge;
            }
            answer +="\n";
        }
        return answer;
    }
}

