package dijkstra;

import java.util.ArrayList;


public class Dijkstra {
	
	
	
	 Vertex vertex;
	 ArrayList<Vertex> vertexCreate = new ArrayList(); // Verify
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
	
	
	// Unvisited Vertex
	
	public void addUnvisitedVertex(String nameVertex) {
		unvisitedVertex.add(nameVertex);
	}
	/*
	public String showUnvisitedVertex() {
		System.out.println(" -- Unvisited Vertex List --");
		String show = "";
		for(int i=0; i < unvisitedVertex.size(); i++) {
			show += unvisitedVertex.get(i) + "\n";
		}
		return show;
	}
	
	public void removeUnvisitedVertex(String name) {
		System.out.println(" -- Remove "+name+" from Unvisited Vertex List --");
		
		for(int i=0; i < unvisitedVertex.size(); i++) {
			if(unvisitedVertex.get(i) == name) {
				unvisitedVertex.remove(i);
				System.out.println("The Vertex "+unvisitedVertex.get(i)+" has been removed from Unvisited Vertex List");
			}
		}
		
	}
	*/
	
	
	// Visited Vertex
	
	/*
	public void addVisitedVertex(String name) {
		visitedVertex.add(name);
		System.out.println("The vertex"+name+"was add to Visited Vertex List");
	}*/
	/*
	public String showVisitedVertex() {
		System.out.println(" -- Visited Vertex List --");
		String show = "";
		for(int i=0; i < visitedVertex.size(); i++) {
			show += visitedVertex.get(i) + "\n";
		}
		return show;
	}
	*/
	
	
	// Neighbor and unvisited
	
	public void showUnvisitedNeighbor(Vertex vertex) {
		System.out.println("\tSelected Vertex is "+vertex.getName()+" and has value "+vertex.getValue());
		for(int i=0; i < unvisitedVertex.size() ; i++ ) {
			
			for(int j=0; j < vertex.neighbor.length; j++) {
				if(unvisitedVertex.get(i) == vertex.neighbor[j]) {
					
					
					
					
					
					System.out.println(
							"Unvisited Vertex: "+unvisitedVertex.get(i)+"\n"+
							 vertex.neighbor[j]+" is a Neighbor from "+vertex.getName() + "\n"+ // att
							"The distance of initial vertex is :"+vertex.getValue()+" + "+vertex.neighborDistanceValue[j]+" = "+
							 (vertex.getValue()+vertex.neighborDistanceValue[j]));
					
					
							
					System.out.println(unvisitedVertex.get(i)+" has value: "+searchValueVertex(vertex.neighbor[j]));		
						
					
					if((vertex.getValue()+vertex.neighborDistanceValue[j]) < searchValueVertex(vertex.neighbor[j])){
							setSpecificVertex(vertex.neighbor[j], (vertex.getValue()+vertex.neighborDistanceValue[j]));
						
							
							getSpecifPreviousVertex(vertex.neighbor[j]);
							updatePreviousVertex(vertex.neighbor[j], vertex.getName());
							getSpecifPreviousVertex(vertex.neighbor[j]);
					
					
					}
					
						
							
							System.out.println(" ---------------------------- ");
					
					
					
					
				}
				
			}
				
				// System.out.println(showUnvisitedVertex());
				
				// Remove Select Vertex from Unvisited Vertex
				// removeUnvisitedVertex(vertex.getName());
				
				// Add Vertex Visited to Visited Vertex
				// addVisitedVertex(vertex.getName());
				
				
				// Show Unvisited Vertex
				// System.out.println(showUnvisitedVertex());
				
				// Show Visited Vertex
				// System.out.println(showVisitedVertex());
				
				// Verify the final vertex?
			
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
	
	public void getSpecifPreviousVertex(String name) {
		for(int i=0; i < 5; i++) {
			if(previousVertex[i][0] == name) {
				System.out.println("Previou Vertex: "+previousVertex[i][1]);
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
	
	public int searchValueVertex(String name) {
		for(Vertex v: vertexCreate) {
			if(v.getName() == name) {
				// System.out.println("Found "+v.getName()+" and you value:"+v.getValue());
				return v.getValue();
				
			}else {
				// System.out.println("Not found");
				
			}
		}
		return 0;
	}
	

	public void setSpecificVertex(String name, int value) {
		for(Vertex v: vertexCreate) {
			if(v.getName() == name) {
				
				// System.out.println("The vertex "+v.getName()+" has value: "+v.getValue());
				v.setValue(value);
				System.out.println("was modified value to :"+v.getValue());
			}else {
				// System.out.println("Not found");
				
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
	
	
	
	
	public void neighborVertex() {
		
	}
	
	
}
