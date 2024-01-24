package observer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class TextExitWindow extends TextWindow{
	
	private String text;
	
	public TextExitWindow(String string) {
		this.text = string;
	}

	@Override
	public void countNumber() {
		String[] words = text.split("\\s+");
        String stringWithoutSpaces = text.replaceAll("\\s", "");
        System.out.println("单词总数：" + words.length); 
        System.out.println("字符总数：" + stringWithoutSpaces.length()); 

	}

	@Override
	public void countAppearance() {
		String[] words = text.split("\\s+");
		TreeSet<String> uniqueWordSet = new TreeSet<>(Arrays.asList(words));
		String[] uniqueWords = uniqueWordSet.toArray(new String[0]);
		Arrays.sort(uniqueWords);
        System.out.println("去重后按字典序排序的单词列表:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
		
	}

	@Override
	public void countFrequency() {
		Map<String, Integer> wordFrequencyMap = countWordFrequency(text);
        
		List<Entry<String, Integer>> wordFrequencyList = new ArrayList<>(wordFrequencyMap.entrySet());

        Collections.sort(wordFrequencyList, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

        for (Entry<String, Integer> entry : wordFrequencyList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

		
	}
	
    public static Map<String, Integer> countWordFrequency(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); 
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        return wordFrequencyMap;
    }

}
