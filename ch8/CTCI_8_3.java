public class MyClass {
    public static void main(String args[]) {
        int[] arr = {-5, 0, 1, 3, 10};
        
        System.out.println(findMagicIndex(arr));    //-1 means no magic index is found 
    }
    
    public static int findMagicIndex(int[] arr) { 
        if(arr == null || arr.length == 0) return -1; 
        
        int lo = 0; 
        int hi = arr.length; 
        while(hi-lo > 1) { 
            int mid = lo+(hi-lo)/2; 
            if(arr[mid] > mid) { 
                hi = mid;    
            } else { 
                lo = mid;    
            }
        }
        
        return arr[lo] == lo ? lo : -1; 
    }
}
