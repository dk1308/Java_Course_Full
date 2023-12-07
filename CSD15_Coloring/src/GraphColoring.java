import java.util.*;

public class GraphColoring {

    public static void colorGraph(Graph graph) {
        List<Node> nodes = graph.getNodes();
        Set<Integer> usedColors = new HashSet<>();
        for (Node node : nodes) {
            Set<Node> adjacentNodes = node.getAdjacentNodes();
            for (Node adjacentNode : adjacentNodes) {
                if (adjacentNode.getColor() != -1) {
                    usedColors.add(adjacentNode.getColor());
                }
            }
            int color = 1;
            while (usedColors.contains(color)) {
                color++;
            }
            node.setColor(color);
            usedColors.clear();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        graph.addNodes(Arrays.asList(a, b, c, d, e));
        graph.addEdge(a, b);
        graph.addEdge(a, d);
        graph.addEdge(b, c);
        graph.addEdge(b, d);
        graph.addEdge(c, d);
        graph.addEdge(c, e);
        colorGraph(graph);
        System.out.println("Node colors:");
        for (Node node : graph.getNodes()) {
            System.out.println(node.getName() + ": " + node.getColor());
        }
    }
}

class Graph {

    private List<Node> nodes = new ArrayList<>();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addNodes(List<Node> nodes) {
        this.nodes.addAll(nodes);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addEdge(Node node1, Node node2) {
        node1.addAdjacentNode(node2);
        node2.addAdjacentNode(node1);
    }
}

class Node {

    private String name;
    private Set<Node> adjacentNodes = new HashSet<>();
    private int color = -1;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAdjacentNode(Node node) {
        adjacentNodes.add(node);
    }

    public Set<Node> getAdjacentNodes() {
        return adjacentNodes;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
