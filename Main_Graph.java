package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_Graph {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			System.out.println("Graph Size:");
			int graphSize = Integer.parseInt(br.readLine());
			Graph grp = new Graph(graphSize); 
			for(int i=0;i<graphSize;i++){
				System.out.println("Add node:");
				int v = Integer.parseInt(br.readLine());
				System.out.println("Conected node:");
				int w = Integer.parseInt(br.readLine());
				grp.addEdge(v, w);
			}
			
			String graph = grp.toString();
			System.out.print(graph);
	     }
		 catch(Exception E){
			 System.out.print(E);
		 }
	}
}
