package trabalho2;

import java.util.ArrayList;
import java.util.List;

public class Digraph {
	private List<Vertex> vertices = new ArrayList<>();
	private List<Arc> arcos = new ArrayList<>();

	public Digraph(){
		Vertex V0 = addVertice("0");
		Vertex V1 = addVertice("1");
		Vertex V2 = addVertice("2");
		Vertex V3 = addVertice("3");
		Vertex V4 = addVertice("4");
		Vertex V5 = addVertice("5");
		
		addArco(V0,V2);
		addArco(V0,V3);
		addArco(V0,V4);
		addArco(V2,V1);
		addArco(V2,V4);
		addArco(V3,V4);
		addArco(V3,V5);
		addArco(V4,V1);
		addArco(V4,V5);
		addArco(V5,V1);		
	}
	
	public Vertex addVertice(String n){
		Vertex v = new Vertex(n);
		vertices.add(v);
		return v;
	}
	
	public int contaVertices(){
		int count = 0;
		for(Vertex percorre : vertices){
			count++;
		}
		return count;
	}
	
	
	public void addArco(Vertex origem, Vertex destino){
		Arc a = new Arc(origem,destino);
		origem.addAdj(a);
		arcos.add(a);
	}
	
	public void removeArco(String origem, String destino){
		
		
		for(Arc percorre : arcos){
			if(percorre.getDestino().getNome().equals(destino) && percorre.getOrigem().getNome().equals(origem)){
				arcos.remove(percorre);
			}
		}
		
	}

	
	public int contaArco(){
		int count = 0;
		for(Arc percorre : arcos){
			count++;
		}
		return count;
	}
	
	public String toString(){
		String formato = "";
		for(Vertex varrer : vertices){
			formato += varrer.getNome() + "->";
			for(Arc percorrer : varrer.getAdj()){
				Vertex v = percorrer.getDestino();
				formato += v.getNome() + " ";
			}
			formato += "\n";
		}
		return formato;
	}
	
}
