package dictionary;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	   
	public DictionaryLL() { 
    	dict =new LinkedList();
    	}

    /** Add words to dictionary
     * @param word The word to add
     * @return true - a word was added; false - a word was not added */
    public boolean addWord(String word) {
    	
    	if(!dict.contains(word.toLowerCase())) {dict.add(word.toLowerCase());return true;}
    	else return false;
    }

    /** Return the number of words in the dictionary */
    public int size()
    {
        return dict.size();
    }

    public boolean isWord(String s) {
    	return dict.contains(s);
    }
  

    
}
