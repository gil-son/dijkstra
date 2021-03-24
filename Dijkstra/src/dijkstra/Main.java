package dijkstra;

public class Main {
	public static void main(String []args) {
		
		 
		Dijkstra d = new Dijkstra();
		
		
		
		Vertex vertexA = new Vertex("A",Integer.MAX_VALUE, "", new String[] {"B","D"}, new int[]{6,1}); 
		Vertex vertexB = new Vertex("B",Integer.MAX_VALUE, "", new String[] {"A","D","E"}, new int[]{6,2,1});
		Vertex vertexC = new Vertex("C",Integer.MAX_VALUE, "", new String[] {"B","E"}, new int[]{5,5});
		Vertex vertexD = new Vertex("D",Integer.MAX_VALUE, "", new String[] {"A","B","E"}, new int[]{1,2,1});
		Vertex vertexE = new Vertex("E",Integer.MAX_VALUE, "", new String[] {"B","C","D"}, new int[]{2,5,1});
		
		
		// Vertex
		d.newVertex(vertexA);
		d.newVertex(vertexB);
		d.newVertex(vertexC);
		d.newVertex(vertexD);
		d.newVertex(vertexE);
		
		
		// Unvisited Vertex
		d.addUnvisitedVertex(vertexA.getName());
		d.addUnvisitedVertex(vertexB.getName());
		d.addUnvisitedVertex(vertexC.getName());
		d.addUnvisitedVertex(vertexD.getName());
		d.addUnvisitedVertex(vertexE.getName());
		
		
		// Previous Vertex
		d.addPreviousVertex(vertexA.getName(),"",0);
		d.addPreviousVertex(vertexB.getName(),"",1);
		d.addPreviousVertex(vertexC.getName(),"",2);
		d.addPreviousVertex(vertexD.getName(),"",3);
		d.addPreviousVertex(vertexE.getName(),"",4);
		d.showPreviousVertex();
		
		//d.removeUnvisitedVertex(vertex1.getName());
		//System.out.println(d.showUnvisitedVertex());
		
		
		// Visited Vertex
		//d.addVisitedVertex(vertex1.getName());
		//System.out.println(d.showVisitedVertex());
		
		//System.out.println(d.showVertex());
		//d.searchNeighborVertex(vertex1);
		
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
		
		
		vertexA.setValue(0);
		
		
		// Area for creat Loop
		
		//System.out.println(vertexA.getValue());
				/*
				 * Ver os vizinhos e não visitados e calcular o seu valor desde o vértice inicial
				 * 
				 */
		
		
		d.showNeighborAndUnvisited(vertexA);
		
	}
}
