package dijkstra;

public class Vertex {
	String name;
	int value;
	
	
	public Vertex(String name, int value) {
		super();
		this.name = name;
		this.value = value;
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
	
	public String print() {
		return "Name:"+getName()+" Value:"+getValue();
	}
}
