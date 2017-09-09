package trabalho3;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Vertex> vertices = new ArrayList<>();
	private List<Arc> arcos = new ArrayList<>();

	public Vertex addVertice(String n) {
		Vertex v = new Vertex(n);
		vertices.add(v);
		return v;
	}

	public int contaVertices() {
		int count = 0;
		for (Vertex percorre : vertices) {
			count++;
		}
		return count;
	}

	public void addArco(Vertex origem, Vertex destino) {
		Arc a = new Arc(origem, destino);
		origem.addAdj(a);
		arcos.add(a);
	}

	public void removeArco(String origem, String destino) {
		int count = 0;
		for (Arc percorre : arcos) {
			if (percorre.getDestino().equals(destino) && percorre.getOrigem().equals(origem)) {
				arcos.remove(count);
			}

			if (percorre.getDestino().equals(origem) && percorre.getOrigem().equals(destino)) {
				arcos.remove(count);
			}
			count++;
		}
	}

	public int contaArco() {
		int count = 0;
		for (Arc percorre : arcos) {
			count++;
		}
		return count;
	}

	public String toString() {
		String formato = "";
		for (Vertex varrer : vertices) {
			formato += varrer.getNome() + "->";
			for (Arc percorrer : varrer.getAdj()) {
				Vertex v = percorrer.getDestino();
				formato += v.getNome() + " ";
			}
			formato += "\n";
		}
		return formato;
	}

	public void DFS(Vertex v) {
		int n = vertices.size();
		boolean[] visited = new boolean[n];
		DFS_REC(visited, v);
	}

	public void DFS_REC(boolean[] visited, Vertex v) {
		int i = Integer.parseInt(v.getNome());
		visited[i] = true;
		System.out.print(i + " ");
		for (Arc x : v.getAdj()) {
			int j = Integer.parseInt(x.getDestino().getNome());
			if (!visited[j]) {
				DFS_REC(visited, x.getDestino());
			}
		}
	}

}
