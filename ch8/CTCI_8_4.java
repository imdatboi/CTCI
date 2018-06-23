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
        HashSet<String> hSet = new HashSet<String>(); 
    
        if(set == null || set.length == 0) { 
            list.add(""); 
            return list; 
        }
        
        helper(set, list, "", 0, hSet); 
        return list; 
    }
    
    public static void helper(int[] set, ArrayList<String> list, String str, int index, HashSet<String> hSet) { 
        if(index == set.length) { 
        		if(!hSet.contains(str)) { 
        			list.add(str.trim());
        			hSet.add(str); 
        		}
            return; 
        }
        
        for(int i=index; i<set.length; i++) { 
            helper(set, list, str, i+1, hSet); 
            helper(set, list, str + " " + set[i], i+1, hSet); 
        }
        
        return; 
    }
}
