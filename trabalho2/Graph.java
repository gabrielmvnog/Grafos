package trabalho2;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Vertex> vertices = new ArrayList<>();
	private List<Arc> arcos = new ArrayList<>();
	
	public Graph(){
		Vertex V1 = addVertice("1");
		Vertex V2 = addVertice("2");
		Vertex V3 = addVertice("3");
		Vertex V4 = addVertice("4");
		Vertex V5 = addVertice("5");
		Vertex V6 = addVertice("6");
		
		addArco(V1,V1);
		addArco(V1,V2);
		addArco(V1,V5);
		addArco(V2,V1);		
		addArco(V2,V3);
		addArco(V2,V5);
		addArco(V3,V2);
		addArco(V3,V4);	
		addArco(V4,V3);
		addArco(V4,V5);
		addArco(V4,V6);
		addArco(V5,V1);
		addArco(V5,V2);
		addArco(V5,V4);
		addArco(V6,V4);
		
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
		int count = 0;
		for(Arc percorre : arcos){
			if(percorre.getDestino().equals(destino) && percorre.getOrigem().equals(origem)){
				arcos.remove(count);
			}
			
			if(percorre.getDestino().equals(origem) && percorre.getOrigem().equals(destino)){
				arcos.remove(count);
			}
			count++;
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
