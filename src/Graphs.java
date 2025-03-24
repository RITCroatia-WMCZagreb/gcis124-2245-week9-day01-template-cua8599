public class Graphs {
    static Graph<String> makeGraph(){
        Graph<String> graph = new AdjacencyGraph<>();
        String[] nodes = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        for (String node : nodes){
            graph.add(node);
        }

        graph.connected("A", "B");
        graph.connected("A", "C");

        graph.connected("B", "A");
        graph.connected("B", "A");


        return graph;
    }
}
