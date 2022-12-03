package ru.mephi.java.ch07.sec10;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Set<DijkstraAlg.Neighbor>> nodes = new HashMap<>();
        nodes.put("1", new HashSet<>());
        nodes.get("1").addAll(List.of(new DijkstraAlg.Neighbor("2", 1), new DijkstraAlg.Neighbor("3", 2)));
        nodes.put("2", new HashSet<>());
        nodes.get("2").addAll(List.of(
                new DijkstraAlg.Neighbor("1", 1),
                new DijkstraAlg.Neighbor("4", 5),
                new DijkstraAlg.Neighbor("3", 0))
        );
        nodes.put("3", new HashSet<>());
        nodes.get("3").addAll(List.of(new DijkstraAlg.Neighbor("1", 2), new DijkstraAlg.Neighbor("4", 1)));
        nodes.put("4", new HashSet<>());
        nodes.get("4").addAll(List.of(new DijkstraAlg.Neighbor("2", 5), new DijkstraAlg.Neighbor("3", 1)));

        Map<String, DijkstraAlg.ShortestPath> shortestPaths = DijkstraAlg.dijkstras(nodes, "1");

        shortestPaths.get("1").print();
        shortestPaths.get("2").print();
        shortestPaths.get("3").print();
        shortestPaths.get("4").print();

    }
}

