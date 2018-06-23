import java.util.*; 

public class MyClass {
    public static void main(String args[]) {
        int[] set = {1,2,3};
        ArrayList<String> ans = getPowerSet(set);
        for(int i=0; i<ans.size(); i++) { 
            System.out.println(ans.get(i));    
        }
    }
    
    public static ArrayList<String> getPowerSet(int[] set) { 
        ArrayList<String> list = new ArrayList<String>(); 
    
        if(set == null || set.length == 0) { 
            list.add(""); 
            return list; 
        }
        
        helper(set, list, "", 0); 
        return list; 
    }
    
    public static void helper(int[] set, ArrayList<String> list, String str, int index) { 
        if(index == set.length) { 
        		list.add(str.trim());
            return; 
        }
        
        helper(set, list, str, index+1); 
        helper(set, list, str + " " + set[index], index+1);    
        return; 
    }
}
