package application;

public class Path {
    private int[][] dist;
    private World.CellState[][] state;
    private int ny, nx;
    static private int queueType;
    
    public Path(int[][] dist, World.CellState[][] state) {
        this.dist = dist;
        this.state = state;
        ny = state.length;
        nx = state[0].length;
    }
    
    //Prefer dots than empty cells
    protected int cellDist(int x, int y) {
        return state[y][x] == World.CellState.Dot ? 1 : 2;
    }
    
    public void findDistance(Pos from) {
        //For testing, try three different types of queues
        Queue<Pos> queue = null;
        switch(queueType) {
        case 0: queue = new ListQueue<Pos>();   break;
        case 1: queue = new HeapQueue<Pos>();   break;
        case 2: queue = new RBTreeQueue<Pos>(); break;
        }
        queueType = (queueType + 1) % 3;
       
        //initialize dist to max int
        for(int y = 0; y < ny; y++)
            for(int x = 0; x < nx; x++)
                dist[y][x] = 998;//Integer.MAX_VALUE;
        
        //Update dist array to find the shortest path, where
        //the distance between cells are weighted by cellDist
        //
        //TODO: - Starting from the 'from' position,
        //        update dist[y][x] for all y and x such that
        //        dist[y][x] = dist[p.y][p.x] + d, where
        //        p is the position dequeued from queue and
        //        d is cellDist(x, y) value
        //      - Updating dist[y][x] should continue until
        //        queue becomes empty
        //
        
        dist[from.y][from.x] = 0;
        queue.enqueue(from);
        while(!queue.isEmpty()) {
        	Pos p = queue.dequeue();
        	int dx[] = new int[] {-1, 1, 0, 0};
        	int dy[] = new int[] {0, 0, -1, 1};
        	for(int i = 0; i < 4; i++) {
        		int x = (p.x + dx[i] + nx) % nx;
        		int y = (p.y + dy[i] + ny) % ny;
        		int d = cellDist(x,y);
        		if(state[y][x] != World.CellState.Wall && dist[y][x] > dist[p.y][p.x] + d) {
        			dist[y][x] = dist[p.y][p.x] + d;
        			queue.enqueue(new Pos(x, y, d));
        		}
        	}
        }
    }
    
    //Hopefully, this can help your debugging
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int y = 0; y < ny; y++) {
            for(int x = 0; x < nx; x++) {
                if(state[y][x] == World.CellState.Wall)
                    sb.append("###");
                else
                    sb.append(String.format("%3d", dist[y][x]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
