package dijkstra;

public class Main {
	public static void main(String []args) {
		
		// int A = Integer.MAX_VALUE ,B = Integer.MAX_VALUE,C= Integer.MAX_VALUE,D = Integer.MAX_VALUE,E = Integer.MAX_VALUE;
		Vertex vertex1 = new Vertex("A",1);
		Vertex vertex2 = new Vertex("B",2);
		Vertex vertex3 = new Vertex("C",3);
		Vertex vertex4 = new Vertex("D",4);
		Vertex vertex5 = new Vertex("E",5);
		
		Dijkstra d = new Dijkstra();
		d.newVertex(vertex1);
		d.newVertex(vertex2);
		d.newVertex(vertex3);
		d.newVertex(vertex4);
		d.newVertex(vertex5);
		
		
		// Test before you start
		
		System.out.println(d.showVertex());
		
		d.searchVertex("A");
		
		d.setSpecificVertex("A", 15);
		
		System.out.println(d.showVertex());
		
		d.removeVertex("A");
		System.out.println(d.showVertex());
		
		d.addVertex(new Vertex("Z",12));
		System.out.println(d.showVertex());
	}
}
