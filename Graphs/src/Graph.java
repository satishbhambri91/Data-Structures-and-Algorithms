
import java.util.LinkedList;

class GraphRep 
{ 
   int V; 
   LinkedList<Integer> adjListArray[]; 
      
    // constructor  
    GraphRep(int V) 
    { 
        this.V = V; 
          
        // define the size of array as  
        // number of vertices 
        adjListArray = new LinkedList[V]; 
          
        // Create a new list for each vertex 
        // such that adjacent nodes can be stored 
        for(int i = 0; i < V ; i++){ 
            adjListArray[i] = new LinkedList<>(); 
        }
    }
    
    public void addEdge(GraphRep g, int src, int dest){
    	
    	 // Add an edge from src to dest.
    	g.adjListArray[src].add(dest);
    	
    	// Since graph is undirected, add an edge from dest 
        // to src also 
    	
    	g.adjListArray[dest].add(src);
    }
    
    public void printGraph(GraphRep graph){
    	
    	for(int v = 0; v < graph.V; v++){
    		
    		System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head");
            
            for(Integer pCrawl: graph.adjListArray[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            
            System.out.println("\n");
    	}
    } 
} 
public class Graph {
	
	public static void main(String[] args){
		int V  = 5;
		GraphRep g = new GraphRep(V);
		g.addEdge(g, 0, 1);
		g.addEdge(g, 0, 4);
		g.addEdge(g, 1, 2);
		g.addEdge(g, 1, 3);
		g.addEdge(g, 1, 4);
		g.addEdge(g, 2, 3);
		g.addEdge(g, 3, 4);
		
		g.printGraph(g);
		
	}
	
	
}
