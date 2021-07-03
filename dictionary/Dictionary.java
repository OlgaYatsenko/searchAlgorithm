/**
 * Dictionary interface is a template for all type of dictionaries
 */
package dictionary;


public interface Dictionary {
	/** Add this word to the dictionary.
	 * @param word The word to add
	 * @return true if the word was added to the dictionary 
	 * (it wasn't already there). */
	public abstract boolean addWord(String word);


	
	/** Return the number of words in the dictionary */
	public abstract int size();
	
	/** Check if the word is in the Dictionary */
	public abstract boolean isWord(String s);
	
}
