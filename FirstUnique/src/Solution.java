import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	private int index=-1;
	private HashMap<String, Integer> map = new HashMap<>();
	  private String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	  
    public int firstUniqChar(String s) {
    	init();
    	
        int length = s.length();
        for(int i = 0; i < length;i++)
        {
        	String current= s.substring(i,i+1);
        	int count = map.get(current);
        	if(count == -1)
        	{
        		map.put(current, i);
        	}
        	else
        	{
        		map.put(current, 99);
        	}
        	
        }
        Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
        	int value = iter.next().getValue();
        	if(value != 99 && value != -1)
        	{
        		if(index == -1 ||value < index)
        		{
        			index = value;
        		}
        	}
      }
        return index;
        
    }
    
    private void init()
    {
        for(String s: letters)
        {
            map.put(s,-1);
        }
    }
}
