import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharinStr {
	 public int firstUniqChar(String s) {
	        Map<Character,Integer> letterCount = new HashMap<Character,Integer>();
	        char[] arr = s.toCharArray();
	        
	        for (char c:arr) {
	            letterCount.put(c, letterCount.getOrDefault(c,0)+1);
	        }
	        if (letterCount.containsValue(1) == false) {
	            return -1;
	        } 
	        
	        int mini = s.length()+1;
	        for (char C : letterCount.keySet()) {
	            if (letterCount.get(C).equals(1)) {
	                mini = Math.min(mini,s.indexOf(C));
	            }
	        }    
	        return mini;
	    }
	 
	 public int firstUniqChar2(String s) {
	        int min = s.length();
	        for(char c = 'a'; c <= 'z'; c++) {
	            if(s.indexOf(c) != -1 && s.indexOf(c) == s.lastIndexOf(c))
	                min = Math.min(min, s.indexOf(c));
	        }
	        return min==s.length()?-1: min;
	    }

}
