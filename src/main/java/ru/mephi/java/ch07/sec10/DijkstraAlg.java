package ru.mephi.java.ch07.sec10;


import java.util.*;

public class DijkstraAlg {

    public static class Neighbor {
        private final String name;
        private final int distance;

        Neighbor(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }
    }

    public static class ShortestPath {
        private final String source;
        private final String destination;
        private final int distance;
        private final TreeSet<String> path;

        ShortestPath(String source, String destination, int distance, TreeSet<String> path) {
            this.source = source;
            this.destination = destination;
            this.distance = distance;
            this.path = path;
        }

        public void print() {
            String str = String.format("From %s to %s: distance = %d, path = %s",
                    source, destination, distance, path.toString());
            System.out.println(str);
        }
    }

    private static class Node {
        private final String name;
        private final Set<Neighbor> neighbors;
        private int distance;
        private Set<String> path;

        Node(String name, Set<Neighbor> neighbors, int distance) {
            this.name = name;
            this.neighbors = neighbors;
            this.distance = distance;
        }

        Node(String name, Set<Neighbor> neighbors, int distance, Set<String> path) {
            this(name, neighbors, distance);
            this.path = path;
        }
    }

    public static Map<String, ShortestPath> dijkstras(Map<String, Set<Neighbor>> nodes, String source) {
        PriorityQueue<Node> unvisited = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        Map<String, ShortestPath> visited = new HashMap<>();

        nodes.forEach((name, neighbors) -> {
            Node node;
            if (name.equals(source)) {
                node = new Node(name, neighbors, 0, new TreeSet<>(List.of(name)));
            } else {
                node = new Node(name, neighbors, Integer.MAX_VALUE);
            }
            unvisited.add(node);
        });

        Node current = unvisited.poll();
        while (current != null) {
            for (Neighbor neighbor : current.neighbors) {
                Iterator<Node> iter = unvisited.iterator();
                while (iter.hasNext()) {
                    Node node = iter.next();
                    if (node.name.equals(neighbor.name)) {
                        iter.remove();
                        if (current.distance + neighbor.distance < node.distance) {
                            node.distance = current.distance + neighbor.distance;
                            node.path = new TreeSet<>(current.path);
                            node.path.add(neighbor.name);
                        }
                        unvisited.add(node);
                        break;
                    }
                }
            }

            ShortestPath shortestPath = new ShortestPath(
                    source, current.name, current.distance, (TreeSet<String>) current.path);
            visited.put(current.name, shortestPath);

            current = unvisited.poll();
        }

        return visited;
    }

}

