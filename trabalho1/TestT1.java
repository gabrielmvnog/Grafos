package trabalho1;

public class TestT1 {
	public static void main(String[] args) {
		
		Digraph digrafo = new Digraph();
		digrafo.getDigrafo();
		digrafo.getMatrizDigrafo();
		digrafo.removerDigrafo(0, 2);
		System.out.println("\n Removido o arco (0,2) \n");
		digrafo.getDigrafo();
		digrafo.getMatrizDigrafo();
		
		Graph grafo = new Graph();
		grafo.getGraph();
		grafo.getMatrizGrafo();
		grafo.removerGrafo(1, 5);
		System.out.println("\n Removido o arco (1,5) / (5,1) \n");	
		grafo.getGraph();
		grafo.getMatrizGrafo();
	
	}
}
