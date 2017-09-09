package trabalho2;

public class Arc {
	private Vertex origem;
	private Vertex destino;
	
	public Arc(Vertex o, Vertex d){
		setOrigem(o);
		setDestino(d);
	}
	
	public void setOrigem(Vertex o){
		origem = o;
	}
	
	public Vertex getOrigem(){
		return origem;
	}
	
	public void setDestino(Vertex d){
		destino = d;
	}
	
	public Vertex getDestino(){
		return destino;
	}
	
	public String toString(){
		return String.format("(%s,%s)", origem, destino);
	}
	
}
