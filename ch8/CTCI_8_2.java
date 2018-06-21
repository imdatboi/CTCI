import java.util.*; 

public class MyClass {
    public static void main(String args[]) {
        int[][] grid = {{1,1,0,0}, {1,1,0,0}, {0,1,1,1}, {0,0,0,1}};  
        ArrayList<String> ans = gridPath(grid); 
        
        for(int i=0; i<ans.size(); i++) { 
            System.out.println(ans.get(i));    
        }
    }
    
    public static ArrayList<String> gridPath(int[][] grid) { 
        ArrayList<String> path = new ArrayList<String>(); 
        if(grid == null || grid[0].length == 0 || grid[0][0] == 0) return path; 
        
        helper(grid, path, 0, 0); 
        return path; 
    }
    
    public static void helper(int[][] grid, ArrayList<String> path, int i, int j) { 
        if(path.size() >= 1 && path.get(path.size()-1).equals("["+ (grid.length-1) + "][" + (grid[0].length-1) +"]")) return; 
        if(i == grid.length-1 && j == grid[0].length-1) { 
            path.add("["+ i + "][" + j +"]"); 
            return; 
        }
        if(i >= grid.length || j >= grid[0].length || grid[i][j] == 0) { 
            if(path.get(path.size()-1).equals("["+ i + "][" + (j-1) +"]")) { 
                path.remove(path.size()-1);   
            }
            return; 
        }
        
        path.add("["+ i + "][" + j +"]"); 
        
        helper(grid, path, i+1, j);
        helper(grid, path, i, j+1); 
        return; 
    }
}
