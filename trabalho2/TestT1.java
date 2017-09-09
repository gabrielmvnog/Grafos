package trabalho2;

public class TestT1 {
	public static void main(String[] args) {
		System.out.println("-----Digrafo------");

		Digraph digrafo = new Digraph();
		System.out.println("Vértices: " + digrafo.contaVertices());
		System.out.println("Arestas: " + digrafo.contaArco());		
		System.out.println(digrafo);
				
//		digrafo.removeArco("0", "2");
		
		System.out.println("----Grafo----");
		Graph grafo = new Graph();
		System.out.println("Vértices: " + grafo.contaVertices());
		System.out.println("Arestas: " + grafo.contaArco());
		System.out.println(grafo);
		
		
		
	}
}
