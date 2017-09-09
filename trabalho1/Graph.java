package trabalho1;

public class Graph {
	
	public int[][] grafo = new int[7][7];
	
	public Graph(){
		
		grafo[1][1] = 1;
		grafo[1][2] = 1;
		grafo[1][5] = 1;
		grafo[2][3] = 1;		
		grafo[2][5] = 1;
		grafo[3][4] = 1;
		grafo[4][5] = 1;
		grafo[4][6] = 1;
		
		for(int i = 1; i < 7; i++ ){
			for(int j = 1; j < 7; j++){
				if(grafo[i][j] == 1){
					grafo[j][i] = 1;
				}
			}
		}
	}
	
	public void getGraph(){
		int count = 0;
		System.out.println("------Grafo-----");
		System.out.println("Vértices: 6");
		for(int i = 1; i < 7; i++){
			for(int j = 1; j < 7; j++){
				if(grafo[i][j] == 1){
					count++;
				}
			}
		}
		System.out.printf("Arestas: %d - {", count);
		for(int i = 1; i < 7; i++){
			for(int j = 1; j < 7; j++){
				if(grafo[i][j] == 1){
					System.out.printf("(%d,%d)", i, j);
				}
			}
		}
		System.out.printf("} \n");		
	}
	
	public void getMatrizGrafo(){
		System.out.println("--------Matriz Digrafo--------");
		for(int i = 1; i<7 ; i++){
			for(int j = 1; j<7; j++){
				System.out.printf("  %d  ", grafo[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	public void removerGrafo(int i, int j){
		if(grafo[i][j] == 1){
			grafo[i][j] = 0;
			grafo[j][i] = 0;
		}
	}
	
}
