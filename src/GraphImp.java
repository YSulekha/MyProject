import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class GraphImp {
	Map<Integer, List<Integer>> adjancencyList;
	int vertices[];
	int count = 0;
	public static void main(String args[]){
		GraphImp g = new GraphImp();
		g.adjancencyListImp();
	}
	public void adjancencyListImp() {
		int source;
		int dest;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int v= s.nextInt();
		System.out.println("Enter number o edges");
		int e = s.nextInt();
		adjancencyList = new HashMap<Integer, List<Integer>>();
		for(int i = 1;i <= v;i++) {
			List<Integer> l = new LinkedList<Integer>();
			adjancencyList.put(i, l);
		}
		System.out.println("Enter the edge in \"source Destination\"format");
		int j = 1;
		while(j <= e) {
			source = s.nextInt();
			dest = s.nextInt();
			setEdge(source,dest);
			j++;
		}
		System.out.println("Graph:");
		for(int i = 1;i <= v;i++) {
			System.out.print(i);
			List<Integer> l = getEdge(i);
			for(int k=0;k<l.size();k++) {
				System.out.print("->"+l.get(k));
			}
			System.out.println();
		}
	}
	public void setEdge(int source,int destination){
		List<Integer> l = adjancencyList.get(source);
		l.add(destination);
		l = adjancencyList.get(destination);
		l.add(source);
	}
	
	public List<Integer> getEdge(int source){
		return(adjancencyList.get(source));
	}
	
	public void DepthFirstSearch(){
		vertices = new int[adjancencyList.size()];
		for(int j = 0;j < vertices.length;j++){
			vertices[j] = 0;
		}
		
		for(int i = 1;i <= adjancencyList.size();i++){
			if(vertices[i-1] == 0){
				DFS(i);
			}
		}
	}
	public void DFS(int source){
		count=count+1;
		vertices[source-1] = count;
		int j = adjancencyList.get(source).size();
		while(j > 0){
			
		}
	}
}
