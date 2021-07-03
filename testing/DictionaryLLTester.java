/**
 * 
 */
package testing;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import dictionary.DictionaryLL;
import dictionary.DictionaryLoader;


public class DictionaryLLTester {

	private String dictFile = "data/words.small.txt"; 

	DictionaryLL emptyDict; 
	DictionaryLL smallDict;
	DictionaryLL largeDict;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		emptyDict = new DictionaryLL();
		smallDict = new DictionaryLL();
		largeDict = new DictionaryLL();

		smallDict.addWord("Hello");
		smallDict.addWord("HElLo");
		smallDict.addWord("help");
		smallDict.addWord("a");
		smallDict.addWord("subsequent");
		
		DictionaryLoader.loadDictionary(largeDict, dictFile);
	}

	
	/** Test if the size method is working correctly.
	 */
	@Test
	public void testSize()
	{
		assertEquals("Testing size for empty dict", 0, emptyDict.size());
		assertEquals("Testing size for small dict", 4, smallDict.size());
		assertEquals("Testing size for large dict", 4438, largeDict.size());
	}
		
	
	/** Test the addWord method */
	@Test
	public void addWord()
	{
		
		
		assertEquals("Asserting hellow is not in empty dict", true, emptyDict.addWord("hellow"));
		assertEquals("Asserting hellow is not in small dict", true, smallDict.addWord("hellow"));
		assertEquals("Asserting hellow is not in large dict", true, largeDict.addWord("hellow"));
		


		assertEquals("Asserting hellow is in empty dict that contains hellow already", false, emptyDict.addWord("hellow"));
		assertEquals("Asserting hellow is in small dict that contains hellow already", false, smallDict.addWord("hellow"));
		assertEquals("Asserting hellow is in large dict that contains hellow already", false, largeDict.addWord("hellow"));

				
		emptyDict.addWord("XYZAbC");
		smallDict.addWord("XYZAbC");
		largeDict.addWord("XYZAbC");

		assertEquals("Asserting xyzabc is in empty dict", false, emptyDict.addWord("xyzabc"));
		assertEquals("Asserting xyzabc is in small dict", false, smallDict.addWord("xyzabc"));
		assertEquals("Asserting xyzabc is large dict", false, largeDict.addWord("xyzabc"));
		
		

		
		
	}	
	
}
