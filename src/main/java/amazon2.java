import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class amazon2
{ 


	public static int shortestDistance(int[][] grid) {
		// set up visited array and queue.
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0,0,0));
		visited[0][0]=true;
		while (!q.isEmpty()) {
			Node top = q.poll();
			visited[top.x][top.y] = true;

			if (grid[top.x][top.y]==9) {
				return top.dist-1;
			}
			// down
			if (top.x+1 < grid.length &&
					grid[top.x+1][top.y] !=0 &&
					!visited[top.x+1][top.y]) {
				q.add(new Node(top.x+1, top.y, top.dist+1));
			}

			// up
			if (top.x-1 > 0 &&
					grid[top.x-1][top.y] !=0 &&
					!visited[top.x-1][top.y]) {
				q.add(new Node(top.x-1, top.y, top.dist+1));
			}

			// left
			if (top.y-1 > 0 &&
					grid[top.x][top.y-1] !=0 &&
					!visited[top.x][top.y-1]) {
				q.add(new Node(top.x, top.y-1, top.dist+1));
			}

			// right
			if (top.y+1 < grid[0].length &&
					grid[top.x][top.y+1] !=0 &&
					!visited[top.x][top.y+1]) {
				q.add(new Node(top.x, top.y+1, top.dist+1));
			}
		}
		return -1;
	}


	public static int ss(List<List<Integer>> lots) {
		// set up visited array and queue.
		boolean[][] visited = new boolean[lots.size()][lots.get(0).size()];
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0,0,0));
		visited[0][0]=true;
		while (!q.isEmpty()) {
			Node top = q.poll();
			visited[top.x][top.y] = true;

			if (lots.get(top.x).get(top.y)==9) {
				return top.dist-1;
			}
			// down
			if (top.x+1 < lots.size() &&
					lots.get(top.x+1).get(top.y) !=0 &&
					!visited[top.x+1][top.y]) {
				q.add(new Node(top.x+1, top.y, top.dist+1));
			}

			// up
			if (top.x-1 > 0 &&
					lots.get(top.x-1).get(top.y) !=0 &&
					!visited[top.x-1][top.y]) {
				q.add(new Node(top.x-1, top.y, top.dist+1));
			}

			// left
			if (top.y-1 > 0 &&
					lots.get(top.x).get(top.y-1)!=0  &&
					!visited[top.x][top.y-1]) {
				q.add(new Node(top.x, top.y-1, top.dist+1));
			}

			// right
			if (top.y+1 < lots.get(0).size() &&
					lots.get(top.x).get(top.y+1)!=0&&
					!visited[top.x][top.y+1]) {
				q.add(new Node(top.x, top.y+1, top.dist+1));
			}
		}
		return -1;
	}



public static void main(String [] args)
{
	int [][] lot = new int [][] {{1,0,0},{1,0,0}, {1,9,1}};
	List<List<Integer>> lots = new ArrayList<>();

	List<Integer> l1 = new ArrayList<>();
	l1.add(1);
	l1.add(0);
	l1.add(0);


	List<Integer> l2 = new ArrayList<>();
	l2.add(1);
	l2.add(0);
	l2.add(0);

	List<Integer> l3 = new ArrayList<>();
	l3.add(1);
	l3.add(9);
	l3.add(1);

	lots.add(l1);
	lots.add(l2);
	lots.add(l2);


	System.out.println(amazon2.shortestDistance(lot));
	System.out.println(amazon2.ss(lots));

	//System.out.println(amazon2.shortestDistance(lots));
}
}
