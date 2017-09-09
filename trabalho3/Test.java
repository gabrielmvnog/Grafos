package trabalho3;

public class Test {
	public static void main(String[] args) {
		Graph digrafo = new Graph();
		Vertex V0 = digrafo.addVertice("0");
		Vertex V1 = digrafo.addVertice("1");
		Vertex V2 = digrafo.addVertice("2");
		Vertex V3 = digrafo.addVertice("3");
		Vertex V4 = digrafo.addVertice("4");
		Vertex V5 = digrafo.addVertice("5");
		Vertex V6 = digrafo.addVertice("6");
		Vertex V7 = digrafo.addVertice("7");
		Vertex V8 = digrafo.addVertice("8");
		Vertex V9 = digrafo.addVertice("9");
		
		digrafo.addArco(V0,V1);
		digrafo.addArco(V0,V7);
		digrafo.addArco(V1,V2);
		digrafo.addArco(V1,V3);
		digrafo.addArco(V1,V6);
		digrafo.addArco(V3,V4);
		digrafo.addArco(V3,V5);
		digrafo.addArco(V7,V8);
		digrafo.addArco(V7,V9);
		digrafo.addArco(V8,V6);
		
		digrafo.DFS(V0);
		System.out.println("");
		System.out.println(digrafo);
		
		
	}
}
	


