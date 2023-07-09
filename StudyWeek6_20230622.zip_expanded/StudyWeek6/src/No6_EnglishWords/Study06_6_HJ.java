package No6_EnglishWords;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Study06_6_HJ {
	public static void main(String[] args) {
		String[] words = { "better", "vest", "raspy", "tearful", "dream", "accept", "ignore", "elfin", "pat", "wail",
				"itchy", "attract", "unpack", "assorted", "month", "cast", "beef", "arithmetic", "petite", "umbrella",
				"kaput", "frightened", "frame", "abounding", "yak", "resonant", "trace", "simplistic", "three", "slip",
				"train", "name", "lock", "windy", "guide", "calm", "tedious", "decisive", "illustrious", "exciting",
				"lamp", "adamant", "average", "finger", "sack", "vanish", "damaged", "bed", "compare", "notebook",
				"beds", "delight", "cowardly", "unknown", "shiver", "kill", "bright", "greedy", "makeshift", "cellar",
				"owe", "pack", "water", "paper", "rub", "incompetent", "neck", "tense", "airport", "cheap", "structure",
				"gaudy", "wound", "knot", "park", "simple", "brush", "fail", "volatile", "jam", "chubby", "pour",
				"load", "abortive", "increase", "knowledge", "meal", "cream", "stitch", "laugh", "treatment", "reach",
				"approval", "war", "kindhearted", "comparison", "past", "standing", "crown", "society" };

		TreeMap<Character, Integer> map = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 길이: ");
		int n = sc.nextInt();
		
		for(String w : words) {
			if(w.length() == n) {
				for(int i = 0; i < n; i++) {
					char c = w.charAt(i);
					if(map.containsKey(c)) map.put(c, map.get(c)+1);
					else map.put(c, 1);
					
				}
			}
		}
		
		for(Map.Entry<Character, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey() + "-" + ent.getValue());
		}
		
	
	}
}
