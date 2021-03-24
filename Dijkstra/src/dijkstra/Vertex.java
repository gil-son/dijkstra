package dijkstra;

public class Vertex {
	String name;
	int value;
	String previewVertex;
	String neighbor[] = {} ;
	int neighborValue[] = {} ;
	
	public Vertex(String name, int value, String previewVertex, String[] neighbor, int[] neighborValue) {
		super();
		this.name = name;
		this.value = value;
		this.neighbor = neighbor;
		this.neighborValue = neighborValue;
		this.previewVertex = previewVertex;
		
	}
	
	
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public String[] getNeighbor() {
		
		return neighbor;
	}
	
	public void setNeighbor(String[] neighbor) {
		this.neighbor = neighbor;
	}
	
	
	public String listNeighbors() {
		String show = "";
		for(int i=0; i < this.neighbor.length; i++) {
			if(i < this.neighbor.length-1) {
				show += neighbor[i]+",";
			}else {
				show += neighbor[i]+".";
			}
			
		}
		
		return show;
	}
	
	
	public void showNeighborAndValue() {
		System.out.println("Selected Vertex: "+this.getName());
		for(int i=0; i < this.neighbor.length; i++) {
			
				System.out.println(this.neighbor[i]);
				System.out.println(this.neighborValue[i]);;
			
			
		}
	}
	
	
	
	public String print() {
		return "Name:"+getName()+" Value:"+getValue() + " Neighbors:"+listNeighbors();
	}
	
}
