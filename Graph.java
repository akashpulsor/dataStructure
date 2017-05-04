package algoPractice;

import java.util.*;

public class Graph {
	private int V;
	private LinkedList<Integer> adj[];
	boolean visited[] = new boolean[V] ;
	public Graph(int graphSize){
		V  = graphSize;
		adj = new LinkedList[graphSize];
		for(int i =0; i<graphSize;i++){	 
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int v,int w){
		if(v > V - 1){
			LinkedList<Integer> temp[] = new LinkedList[V + v/2];
			for(int i =0; i < V;i++){
				temp[i] = adj[i]; 
			}
			adj = temp;
		}
		adj[v].add(w);
	}

	@Override
	public String toString() {
		String grp = "Graph [";
		for(int i =0;i<V;i++){
			
			grp += i + adj[i].toString() + " ";
			
		}
		grp = grp + " ]";
		return grp;
	}
	
	public void DFS(){
		boolean[] visited = new boolean[V]; 
		for(int i =0;i<V;i++){
			if(visited[i]==false){
				DFSUtil(i);
			}
		}
	}
	
	public void DFSUtil(int v){
		visited[v] = true;
		System.out.println(v+ " ");
		Iterator<Integer> i = adj[v].iterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
				DFSUtil(n);
			}
		}
	}
	
	public void DFS_stack(int s){
		
		Visited();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(s);
		while(!stack.isEmpty()){
			s = stack.pop();
			if(visited[s]==false){
				visited[s]= true;
			}
			Iterator<Integer> i = adj[s].iterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					stack.push(n);
				}
			}
		}
	}
	
	public void Visited(){
		for(int  i =0;i < V;i++){
			visited[i] = false;
		}
	}

}
