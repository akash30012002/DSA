package DSA;

public class GraphVertex {

	int data;
	int count=0;
	GraphVertex[] neighbours = new GraphVertex[10];
	int[] weights = new int[10];
	
	GraphVertex(int data){
		this.data = data;
	}
	
	GraphVertex(int data, GraphVertex[] neighbours){
		this.data = data;
		for (int i=0;i<neighbours.length;i++) {
			this.neighbours[this.count++] = neighbours[i];
		}
	}
	
	GraphVertex(int data, GraphVertex[] neighbours, int[] weights){
		this.data = data;
		for (int i=0;i<neighbours.length;i++) {
			this.neighbours[this.count] = neighbours[i];
			this.weights[this.count++] = weights[i];
		}
	}
	
	void addEdge(GraphVertex vertex) {
		this.neighbours[count++] = vertex;
	}
	
	void addEdge(GraphVertex vertex, int weight) {
		this.neighbours[count] = vertex;
		this.weights[this.count++] = weight;
	}
	
	void printNeighbours() {
		for (int i=0;i<this.count;i++) {
			System.out.print(this.neighbours[i].data + " ");
		}
		System.out.println();
	}
}
