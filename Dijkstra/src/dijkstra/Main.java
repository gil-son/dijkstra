package dijkstra;

public class Main {
	public static void main(String []args) {
		
		 
		Dijkstra d = new Dijkstra();
		
		
		
		Vertex vertexA = new Vertex("A",Integer.MAX_VALUE, new String[] {"B","D"}, new int[]{6,1}); 
		Vertex vertexB = new Vertex("B",Integer.MAX_VALUE, new String[] {"A","D","E"}, new int[]{6,2,1});
		Vertex vertexC = new Vertex("C",Integer.MAX_VALUE, new String[] {"B","E"}, new int[]{5,5});
		Vertex vertexD = new Vertex("D",Integer.MAX_VALUE, new String[] {"A","B","E"}, new int[]{1,2,1});
		Vertex vertexE = new Vertex("E",Integer.MAX_VALUE, new String[] {"B","C","D"}, new int[]{2,5,1});
		
		
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
		
		
		// Short Distance from Vertex
		
		
		
		// Previous Vertex
		d.addPreviousVertex(vertexA.getName(),"none",0);
		d.addPreviousVertex(vertexB.getName(),"none",1);
		d.addPreviousVertex(vertexC.getName(),"none",2);
		d.addPreviousVertex(vertexD.getName(),"none",3);
		d.addPreviousVertex(vertexE.getName(),"none",4);
		
		
		
		
		
		vertexA.setValue(0);
		
		while( d.unvisitedVertex.size() > 0) {
			
		
		// Area for creat Loop
		
		
		
		
		// Visitar os vizinhos não visitados e selecionar o menor
		
		switch(d.selectUnvisitedNeighborWithLessValue()) {
			case "A" : d.showUnvisitedNeighbor(vertexA); break; // Examinar os vizinhos próximos
			case "B" : d.showUnvisitedNeighbor(vertexB); break; // e Calcular a distância em relação ao Vertex Inicial
			case "C" : d.showUnvisitedNeighbor(vertexC); break; // Se a distância for menor que a distância conhecida
			case "D" : d.showUnvisitedNeighbor(vertexD); break; // atualize a menor distância daquele vizinho até o vértice Inicial
			case "E" : d.showUnvisitedNeighbor(vertexE); break;
		}
		
		
		System.out.println("---------- Next ----------");
		
		
		
		
		}
		
		d.showPreviousVertex();
	}
}
