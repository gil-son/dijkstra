package dijkstra;

public class Main {
	public static void main(String []args) {
		
		// int A = Integer.MAX_VALUE ,B = Integer.MAX_VALUE,C= Integer.MAX_VALUE,D = Integer.MAX_VALUE,E = Integer.MAX_VALUE;
		
		Dijkstra d = new Dijkstra();
		
		
		
		Vertex vertex1 = new Vertex("A",1, new String[] {"B","D"}); // Vertex vertex1 = new Vertex("A",1, new String[] {"B","D"});
		Vertex vertex2 = new Vertex("B",2, new String[] {"A","D","E"});
		Vertex vertex3 = new Vertex("C",3, new String[] {"B","E"});
		Vertex vertex4 = new Vertex("D",4, new String[] {"A","B","E"});
		Vertex vertex5 = new Vertex("E",5, new String[] {"B","C","D"});
		
		// Vertex
		
		
		d.newVertex(vertex1);
		d.newVertex(vertex2);
		d.newVertex(vertex3);
		d.newVertex(vertex4);
		d.newVertex(vertex5);
		
		
		// Unvisited Vertex
		d.addUnvisitedVertex(vertex1.getName());
		d.addUnvisitedVertex(vertex2.getName());
		d.addUnvisitedVertex(vertex3.getName());
		d.addUnvisitedVertex(vertex4.getName());
		d.addUnvisitedVertex(vertex5.getName());
		System.out.println(d.showUnvisitedVertex());
		
		d.removeUnvisitedVertex(vertex1.getName());
		System.out.println(d.showUnvisitedVertex());
		
		// Visited Vertex
		d.addVisitedVertex(vertex1.getName());
		//System.out.println(d.showVisitedVertex());
		
		System.out.println(d.showVertex());
		d.searchNeighborVertex(vertex1);
		
		// Test before you start
		
		/*
		System.out.println(d.showVertex());
		
		d.searchVertex("A");
		
		d.setSpecificVertex("A", 15);
		
		System.out.println(d.showVertex());
		
		d.removeVertex("A");
		System.out.println(d.showVertex());
		
		d.addVertex(new Vertex("Z",12));
		System.out.println(d.showVertex());
		*/
		
		
		
		
	}
}
