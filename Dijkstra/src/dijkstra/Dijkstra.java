package dijkstra;

import java.util.ArrayList;


public class Dijkstra {
	
	
	
	 Vertex vertex;
	 ArrayList<Vertex> vertexCreate = new ArrayList();
	 String neighborVertex[] = {};
	 ArrayList<String> unvisitedVertex = new ArrayList();
	 ArrayList<String> visitedVertex = new ArrayList();
	 
	 
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
		System.out.println(vertex.listNeighbors());
		System.out.println(vertex.getNeighbor().length);
		
		// Get just nieghbor
		
		for(int i=0; i < vertex.getNeighbor().length; i++ ) {
			System.out.println(vertex.neighbor[i]);
		}
		
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
