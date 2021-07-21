package DSA;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Graph {
	
	int count=0;
	GraphVertex[] vertices = new GraphVertex[10];
	
	Graph() {}
	
	Graph(GraphVertex[] vertices1, GraphVertex[] vertices2, boolean directed){
		if (directed) {
			addUniEdges(vertices1, vertices2);
		}
		else {
			addBiEdges(vertices1, vertices2);
		}
	}
	
	Graph(GraphVertex[] vertices1, GraphVertex[] vertices2, boolean directed, int[] weights){
		if (directed) {
			addUniEdges(vertices1, vertices2, weights);
		}
		else {
			addBiEdges(vertices1, vertices2, weights);
		}
	}
	
	GraphVertex addVertex(int data) {
		GraphVertex vertex = new GraphVertex(data);
		this.vertices[count++] = vertex;
		return vertex;
	}
	
//	adding vertex to an already built graph
	GraphVertex addVertex(int data, GraphVertex[] neighbours) {
		GraphVertex vertex = new GraphVertex(data, neighbours);
		this.vertices[count++] = vertex;
		for (int i=0;i<neighbours.length;i++) {
			neighbours[i].addEdge(vertex);
		}
		return vertex;
	}
	
	GraphVertex addVertex(int data, GraphVertex[] neighbours, int[] weights) {
		GraphVertex vertex = new GraphVertex(data, neighbours, weights);
		this.vertices[count++] = vertex;
		for (int i=0;i<neighbours.length;i++) {
			neighbours[i].addEdge(vertex, weights[i]);
		}
		return vertex;
	}
	
	void addUniEdge(GraphVertex vertex1, GraphVertex vertex2) {
		vertex1.addEdge(vertex2);
	}
	
	void addUniEdge(GraphVertex vertex1, GraphVertex vertex2, int weight) {
		vertex1.addEdge(vertex2, weight);
	}
	
	void addBiEdge(GraphVertex vertex1, GraphVertex vertex2) {
		vertex1.addEdge(vertex2);
		vertex2.addEdge(vertex1);
	}
	
	void addBiEdge(GraphVertex vertex1, GraphVertex vertex2, int weight) {
		vertex1.addEdge(vertex2, weight);
		vertex2.addEdge(vertex1, weight);
	}
	
//	adding all edges in a graph
	void addUniEdges(GraphVertex[] vertices1, GraphVertex[] vertices2) {
		int len = vertices1.length;
		for (int i=0;i<len;i++) {
			addUniEdge(vertices1[i], vertices2[i]);
		}
	}
	
	void addUniEdges(GraphVertex[] vertices1, GraphVertex[] vertices2, int[] weights) {
		int len = vertices1.length;
		for (int i=0;i<len;i++) {
			addUniEdge(vertices1[i], vertices2[i], weights[i]);
		}
	}
	
	void addBiEdges(GraphVertex[] vertices1, GraphVertex[] vertices2) {
		int len = vertices1.length;
		for (int i=0;i<len;i++) {
			addBiEdge(vertices1[i], vertices2[i]);
		}
	}
	
	void addBiEdges(GraphVertex[] vertices1, GraphVertex[] vertices2, int[] weights) {
		int len = vertices1.length;
		for (int i=0;i<len;i++) {
			addBiEdge(vertices1[i], vertices2[i], weights[i]);
		}
	}
 
	void BFS(GraphVertex vertex) {
		Queue<GraphVertex> q = new LinkedList<>();
		HashSet<GraphVertex> set = new HashSet<>();
		q.add(vertex);
		set.add(vertex);
		while(!q.isEmpty()) {
			GraphVertex temp = q.remove();
			System.out.print(temp.data + " ");
			for (int i=0;i<temp.count;i++) {
				if (!set.contains(temp.neighbours[i])) {
					q.add(temp.neighbours[i]);
					set.add(temp.neighbours[i]);
				}
			}
		}
		System.out.println();
	}
	
	void DFS(GraphVertex vertex) {
		Stack<GraphVertex> s = new Stack<>();
		HashSet<GraphVertex> set = new HashSet<>();
		s.push(vertex);
		set.add(vertex);
		while(!s.isEmpty()) {
			GraphVertex temp = s.pop();
			System.out.print(temp.data + " ");
			for (int i=0;i<temp.count;i++) {
				if (!set.contains(temp.neighbours[i])) {
					s.add(temp.neighbours[i]);
					set.add(temp.neighbours[i]);
				}
			}
		}
		System.out.println();
	}

	void Dijkstra(GraphVertex vertex) {
		
		HashMap<GraphVertex, Integer> map = new HashMap<>();
		for (int i=0;i<count;i++) {
			map.put(vertices[i], Integer.MAX_VALUE);
		}
		map.replace(vertex, 0);
		HashSet<GraphVertex> set = new HashSet<>();
		set.add(vertex);
		GraphVertex cur = vertex;
		while (true) {
			int min = 0;
			for (GraphVertex neighbour:cur.neighbours) {
				if (map)
			}
		}
	}
}
