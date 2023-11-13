
public class Main {

	
	public static void main(String[]args) {
		Main m = new Main();
		int[][] graphUndir = {
				 //  A B C D E
					{0,1,1,1,0,},
					{1,0,0,0,1},
					{1,0,0,1,0},
					{1,0,1,0,1},
					{0,1,0,1,0,}
					};
		
		int[][] graphDir = {
					 //  A B C D E
						{0,1,0,0,0},
						{0,0,0,0,1},
						{1,0,0,1,0},
						{0,0,0,0,0},
						{1,0,0,0,0}
						};
		
		if(m.circUndir(graphUndir))
			System.out.println("Graph #1 has a Euler circuit.");
		else
			System.out.println("Graph #1 does not have a Euler circuit.");
		if(m.circDir(graphDir))
			System.out.println("Graph #2 has a Euler circuit.");
		else
			System.out.println("Graph #2 does not have a Euler circuit.");
		if(m.pathUndir(graphUndir))
			System.out.println("Graph #1 has a Euler path.");
		else
			System.out.println("Graph #1 does not have a Euler path.");
		
		
		if(m.pathDir(graphDir))
			System.out.println("Graph #2 has a Euler path.");
		else
			System.out.println("Graph #2 does not have a Euler path.");

	}
	
	public boolean pathDir(int[][] graph) {
		int[] inDegrees = new int[graph.length];
		int[] outDegrees = new int[graph.length];
		
		//set all to 0
		for(int i = 0; i < graph.length; ++i) {
			inDegrees[i] = 0;
			outDegrees[i] = 0;
		}
		
		//get out degrees
		for (int y = 0; y < graph.length; ++y) {
			for (int x = 0; x < graph[y].length; ++x) {
				if (graph[y][x] == 1) {
					outDegrees[y] += 1;
				}
			}
		}
		
		//get in degrees
		for (int y = 0; y < graph.length; ++y) {
			for (int x = 0; x < graph[y].length; ++x) {
				if (graph[y][x] == 1) {
					inDegrees[x] += 1;
				}
			}
		}
		
		int normal = 0;
		int start = 0;
		int end = 0;

		for(int i = 0; i  < graph.length; ++i) {
			if(inDegrees[i] == outDegrees[i])
				++normal;
			if(outDegrees[i] == inDegrees[i] + 1)
				++start;
			if(outDegrees[i] == inDegrees[i] - 1) 
				++end;
		}
		
		if(end == 1 && start == 1 && normal == graph.length-2)
			return true;
		else
			return false;

	}
	
	public boolean pathUndir(int[][] graph) {
		int even = 0;
		int odd = 0;
		int index = 0;
		for (int y = 0; y < graph.length; ++y) {
			index = 0;
			for (int x = 0; x < graph[y].length; ++x) {
				if (graph[y][x] == 1) {
					++ index;
				}
					
			}
			if(index %2 == 0)
				++ even;
			else
				++odd;
		}
		if ((odd == 2) && (even == graph.length - odd))
			return true;
		else
			return false;
	}
	
	public boolean circDir(int[][] graph) {
		
		//every node must have an equal in and out index
				boolean identical = true;
				for (int y = 0; y < graph.length; ++y) {
					for (int x = 0; x < graph[y].length; ++x) {
						if (graph[y][x] != graph[x][y]) {
							identical = false;
						}
					}
				}
				return identical;
		
	}
	public boolean circUndir(int [][] graph) {
		//every node must have an even index
		int index = 0;
		for (int y = 0; y < graph.length; ++y) {
			index = 0;
			for (int x = 0; x < graph[y].length; ++x) {
				if (graph[y][x] == 1) {
					++ index;
				}
					
			}
			if(index != 2)
				return false;
		}
		return true;
		
	}

}
