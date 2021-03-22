package dijkstra;

import java.util.ArrayList;


public class Dijkstra {
	
	
	
	Vertex vertex;
	 ArrayList<Vertex> vertexCreate = new ArrayList();
	
	public void newVertex( Vertex vertex) {
		vertexCreate.add(vertex);
	}
	
	public String showVertex() {
		String show  = "";
		for(Vertex str: vertexCreate){
			show += str.print() + "\n";
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
