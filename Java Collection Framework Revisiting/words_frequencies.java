//it23017

import java.io.* ;
import java.util.* ;

class Main 
{
    public static void main(String [] args)
    {
        String text = "hello world hello java world java collections";
        
        TreeMap<String, Integer> wordFrequencies = new TreeMap<String, Integer>();
        
        String[] words = text.toLowerCase().split("\\W+");
        
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            
            if(wordFrequencies.containsKey(word))
            {
                int freq=wordFrequencies.get(word) ;
                
                wordFrequencies.put(word,freq+1) ;
            }
            else
            {
                wordFrequencies.put(word,1) ;
            }
        }
        
        System.out.println(wordFrequencies);
    }
}
