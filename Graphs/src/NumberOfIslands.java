
public class NumberOfIslands {
	    public int numIslands(char[][] grid) {
	        if(grid == null){
	            return 0;
	        }
	        
	        int islandCount = 0;
	        
	        for(int i = 0; i < grid.length; i++){
	            for(int j = 0; j < grid[0].length; j++){
	                if(grid[i][j] == '1'){
	                    ++islandCount;
	                    changeLandToWater(grid, i, j);
	                }
	            }
	        }
	        return islandCount;
	    }
	    
	    private void changeLandToWater(char[][] grid, int i, int j){
	        if(i < 0|| i > grid.length || j < 0 || j > grid[0].length || grid[i][j] == '0'){
	            return;
	        }
	        
	        grid[i][j] = '0';
	        
	        changeLandToWater(grid, i-1, j);
	        changeLandToWater(grid, i+1, j);
	        changeLandToWater(grid, i, j - 1);
	        changeLandToWater(grid, i, j + 1);
	        
	    }
	}
