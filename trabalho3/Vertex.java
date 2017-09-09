package trabalho3;

import java.util.ArrayList;
import java.util.List;


public class Vertex {

	   private String nome;
	   private List<Arc> adj = new ArrayList<Arc>();
	   
	   Vertex(String n){
		   setNome(n);
	   }
	   
	    public String getNome(){
	        return nome;
	    }
	    
	    public void setNome(String n){
	        nome = n;
	    }
	    
	    public void addAdj(Arc e){
	    	adj.add(e);
	    }
	    
	    public List<Arc> getAdj(){
	    	return adj;
	    }

}
