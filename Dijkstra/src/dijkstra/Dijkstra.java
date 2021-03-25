package dijkstra;

import java.util.ArrayList;


public class Dijkstra {
	
	
	
	 Vertex vertex;
	 ArrayList<Vertex> vertexCreate = new ArrayList();
	 String neighborVertex[] = {};
	 ArrayList<String> unvisitedVertex = new ArrayList();
	 ArrayList<String> visitedVertex = new ArrayList();
	 
	
	 String[][] previousVertex = new String[5][2];
	 
	 // Vertex
	 
	public void newVertex( Vertex vertex) {
		vertexCreate.add(vertex);
	}
	
	public String showVertex() {
		System.out.println(" -- Vertex List --");
		String show  = "";
		for(int i=0; i < vertexCreate.size(); i++) { 		// for(Vertex str: vertexCreate){show += str.print() + "\n";  }
			show += vertexCreate.get(i).print() + "\n";
		}
	
		return show;
	}
	
	// Neighbor Vertex
	public void addVertexNeighbor( String[] name) {
		vertexCreate.add(vertex);
	}
	
	public void searchNeighborVertex(Vertex vertex) {
		System.out.println("Search for Neighbors vertex from "+vertex.getName());
		System.out.println("Name of vertices:"+vertex.listNeighbors());
		System.out.println("Number of vertices:"+vertex.getNeighbor().length);
		
		// Get just nieghbor
		
		for(int i=0; i < vertex.getNeighbor().length; i++ ) {
			System.out.println(vertex.neighbor[i]);
		}
		
		vertex.showNeighborAndValue();
		
		/*
		for(int i=0; i < neighborVertex.size(); i++) {
			if(neighborVertex.get(i).getName() == nameVertex) {
				for(int j=0; j < neighborVertex.get(j).listNeighbors().length(); j++) {
					System.out.println(neighborVertex.get(j).listNeighbors());
				}
				
			}else {
				System.out.println("Not found");
			}
		}*/
	}
	
	
	// Visited Vertex
	
	public void addUnvisitedVertex(String nameVertex) {
		unvisitedVertex.add(nameVertex);
	}
	
	public String showUnvisitedVertex() {
		System.out.println(" -- Unvisited Vertex List --");
		String show = "";
		for(int i=0; i < unvisitedVertex.size(); i++) {
			show += unvisitedVertex.get(i) + "\n";
		}
		return show;
	}
	
	public void removeUnvisitedVertex(String name) {
		for(int i = 0; i < unvisitedVertex.size(); i++) {
			if(unvisitedVertex.get(i) == name) {
				System.out.println("The Vertex "+unvisitedVertex.get(i)+" has been removed from Unvisited Vertex");
				unvisitedVertex.remove(i);
			}
		}
	}
	
	
	
	// Unvsited Vertex
	
	
	public void addVisitedVertex(String nameVertex) {
		visitedVertex.add(nameVertex);
	}
	
	public String showVisitedVertex() {
		System.out.println(" -- Visited Vertex List --");
		String show = "";
		for(int i=0; i < visitedVertex.size(); i++) {
			show += visitedVertex.get(i) + "\n";
		}
		return show;
	}
	
	
	// Neighbor and unvisited
	
	public void showUnvisitedNeighbor(Vertex vertex) {
		System.out.println("Selected Vertex is "+vertex.getName()+" and has value "+vertex.getValue());
		for(int i=0; i < unvisitedVertex.size() ; i++ ) {
			
			for(int j=0; j < vertex.neighbor.length; j++) {
				if(unvisitedVertex.get(i) == vertex.neighbor[j]) {
					System.out.println(
							"Unvisited Vertex: "+unvisitedVertex.get(i)+
							" And "+vertex.neighbor[j]+" is a Neighbor from "+vertex.getName() + // att
							" and has Value: "+vertex.neighborValue[j]+
							" the distance from A has "+(vertex.getValue()+vertex.neighborValue[j]));
					
					// Update the short distance from Inital Vertex
					
						// vértice atual, o valor do vizinho em questão + previous desse vizinho até o ponto inicial
						// é menor que o valor do vértice atual? Se for atualiza o valor do vértice atual
						//| considerar os viznhos e contar
						/*
						if(vertex.getValue() > (vertex.getValue()+vertex.neighborValue[j])) {
							vertex.setValue((vertex.getValue()+vertex.neighborValue[j]));
						}
					*/
					// d.updateShortDistancefromInitialVertex("B", -1);
					
					
					// Antes, é preciso fazer a contagem dos vértices até esse ponto utilizando o previous?
					
					
				}
				
			}
			

		}
		
	}
	
	// Short Distance from Initial Vertex
	
	public void updateShortDistancefromInitialVertex(String name, int value) {
	
		for(int i=0; i < vertexCreate.size(); i++) { 		// for(Vertex str: vertexCreate){show += str.print() + "\n";  }
			if(vertexCreate.get(i).getName() == name) {
				vertexCreate.get(i).setValue(value);
			}
			
		}
	
	}
	
	public void showShortDistancefromInitialVertex() {
		
		String show  = "";
		for(int i=0; i < vertexCreate.size(); i++) { 		// for(Vertex str: vertexCreate){show += str.print() + "\n";  }
			show += vertexCreate.get(i).getValue() + "\n";
		}
		System.out.println(show);
	}
	
	// Previews Vertex
	
	public void addPreviousVertex(String fixedVertex, String previousVertex, int indice) {
		this.previousVertex[indice][0] = fixedVertex; this.previousVertex[indice][1] = previousVertex;
	}
	
	public void updatePreviousVertex(String fixedVertex, String previousVertex) {
		for(int i =0; i < 5; i++ ) {
			
				if(this.previousVertex[i][0] == fixedVertex) {
					this.previousVertex[i][1] = previousVertex;
				}
				//System.out.println(this.previousVertex[i][j]);
			
		}
	}
	
	public void showPreviousVertex() {
		for(int i=0; i < 5; i++) {
			for(int j=0; j < 2; j++) {
				System.out.println(previousVertex[i][j]);
			}
		}
	}
	
	
	// Visitar os vizinhos não visitados e selecionar o menor
	
	public String selectUnvisitedNeighborWithLessValue() {
		int less = Integer.MAX_VALUE;
		String name = "";
		for(int i=0; i < unvisitedVertex.size(); i++) {
			
				if(vertexCreate.get(i).getValue() < less) {
					less = vertexCreate.get(i).getValue();
					name = vertexCreate.get(i).getName();
				}	
		}
		return name;
	}
	
	
	
	
	
	
	// Test before you start
	
	public void searchVertex(String name) {
		for(Vertex v: vertexCreate) {
			if(v.getName() == name) {
				System.out.println("Found it");
				break;
			}else {
				System.out.println("Not found");
			}
		}
	}
	
	
	public void setSpecificVertex(String name, int value) {
		for(Vertex v: vertexCreate) {
			if(v.getName() == name) {
				
				System.out.println("The vertex "+v.getName()+" has value "+v.getValue());
				v.setValue(value);
				System.out.println("was modified value to:"+v.getValue());
			}else {
				System.out.println("Not found");
				break;
			}
		}
	}
	
	
	public void removeVertex(String name) {
		int i = 0;
		
		
		for(Vertex v: vertexCreate) {
			if(v.getName() == name) {
				System.out.println("Vertex "+v.getName());
				vertexCreate.remove(i);
				System.out.println("was remove");
				break;
			}
			i++;
		}
	
	}
	
	public void addVertex(Vertex v) {
		vertexCreate.add(v);
		System.out.println("A new vertex was add");
	}
	
	public void neighborVertex() {
		
	}
	
	
}
