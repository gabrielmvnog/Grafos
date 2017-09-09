package trabalho1;

public class Digraph {
	public int digraf[][] = new int[6][6];
	
	public Digraph(){
		digraf[0][2] = 1;
		digraf[0][3] = 1;
		digraf[0][4] = 1;
		digraf[2][1] = 1;
		digraf[2][4] = 1;
		digraf[3][4] = 1;
		digraf[3][5] = 1;
		digraf[4][1] = 1;
		digraf[4][5] = 1;
		digraf[5][1] = 1;	
	}
	
	public void removerDigrafo(int i, int j){
		if(digraf[i][j] == 1){
			digraf[i][j] = 0;
		}
	}
	
	public void getDigrafo(){
		System.out.println("--------Digrafo--------");
		int count = 0;
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				if(digraf[i][j] == 1){
					count++;
				}
			}
		}
		System.out.println("Vértices: " + digraf.length);
		System.out.printf("Arestas: %d - {", count);
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				if(digraf[i][j] == 1){
					System.out.printf("(%d,%d)", i, j);
				}
			}
		}
		System.out.printf("} \n");
	}
	
	public void getMatrizDigrafo(){
		System.out.println("--------Matriz Digrafo--------");
		for(int i = 0; i<6 ; i++){
			for(int j = 0; j<6; j++){
				System.out.printf("  %d  ", digraf[i][j]);
			}
			System.out.printf("\n");
		}
	}


}
