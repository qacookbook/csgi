import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingWordsDemo {
	
		
	/**
	 * Returns List of Strings that StartWith given characters with length greater than given length 
	 */
	public static List<String> getWords(List<String> words, List<String> firstLetters, Integer len) {
		ArrayList<String> result = new ArrayList<String>();
		if(words == null || words.isEmpty()) {
			return null;
		}
		if (firstLetters.isEmpty() && len == 0) {
			return words;
		}
        for (String word : words) {
        	String trimWord = word.trim();
        	for(String letter : firstLetters) {
        		if((trimWord.startsWith(letter)) && (len<word.length())) {
        			result.add(word);
        		}
        	}
     	}
		return result;		
	}
	
	/**
	 * Returns List of Strings that StartWith given characters and words with length greater than given length 
	 */
	public static Map<Integer, List<String>> getWordsList(List<String> words, List<String> firstLetters, Integer len) {
		HashMap<Integer,List<String>> result = new HashMap<Integer,List<String>>();
		ArrayList<String> matchLengthWordsList = new ArrayList<String>();
		int count = 0;
		if(words == null || words.isEmpty()) {
			return null;
		}
		if (firstLetters.isEmpty() && len == 0) {
			Integer key = words.size();
			result.put(key, words);
			return result;
		}
        for (String word : words) {
        	if(len < word.length()) {
        		matchLengthWordsList.add(word);
        	}
        	String trimWord = word.trim();
        	for(String letter : firstLetters) {
        		if(trimWord.startsWith(letter)) {
        			count++;
        		}
        	}
     	}
        result.put(count, matchLengthWordsList);
		return result;		
	}

	
	public static void countWords() {
		List<String> words = new ArrayList<String>();
		List<String> startsWith = new ArrayList<String>();
		List<String> matchingWords = CountingWordsDemo.getWords(words,startsWith,5);
		System.out.println ("Number of words: " + matchingWords.size());
		System.out.println("The Words are:");
		if(matchingWords != null) {
			for(int i = 0; i < matchingWords.size(); i++) {
				System.out.println(matchingWords.get(i));
			}
		}
	}
	
	public static void countWordsWithLength() {
		List<String> words = new ArrayList<String>();
		List<String> startsWith = new ArrayList<String>();
		Map<Integer, List<String>> matchingWords = CountingWordsDemo.getWordsList(words,startsWith,5);
		
		if(null != matchingWords) {
			for (Map.Entry<Integer,List<String>> entry : matchingWords.entrySet()) {
				System.out.println("Number of words = " + entry.getKey() +
                             ", The words are = " + entry.getValue());
			}
		}	
	}
	
	public static void main(String[] args) {
		
		String first_letter = "M";
		String second_letter = "m";
		
		List<String> words = new ArrayList<String>();
		words.add(null);
		words.add(null);
		words.add("moon11");
		words.add("moon11");
		
		List<String> startsWith = new ArrayList<String>();
		startsWith.add(first_letter);
		startsWith.add(second_letter);
		
		Map<Integer, List<String>> matchingWords = CountingWordsDemo.getWordsList(words,startsWith,5);
		
		if(null != matchingWords) {
			for (Map.Entry<Integer,List<String>> entry : matchingWords.entrySet()) {
				System.out.println("Number of words starting with M or m = " + entry.getKey() +
                             ", The words are = " + entry.getValue());
			}
		}
		
	}
}


