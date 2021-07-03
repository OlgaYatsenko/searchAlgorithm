package dictionary;

import java.util.TreeSet;

/**
 * A class that implements the Dictionary interface using a BinarySearchTree
 */

public class DictionaryBST implements Dictionary 
{
   private TreeSet<String> dict;
	

  public DictionaryBST() {
	   dict = new TreeSet<String>();
  }
	
   
   /** Add this word to the dictionary.  Convert it to lowercase first
    * for the assignment requirements.
    * @param word The word to add
    * @return true if the word was added to the dictionary 
    * (it wasn't already there). */
  public boolean addWord(String word) {
  	
  	if(!dict.contains(word.toLowerCase())) {dict.add(word.toLowerCase());return true;}
  	else return false;
  }


   /** Return the number of words in the dictionary */
   public int size()
   {
   	// Implement this method
       return dict.size();
   }
   
   public boolean isWord(String s) {
   	return dict.contains(s);
   }

}
