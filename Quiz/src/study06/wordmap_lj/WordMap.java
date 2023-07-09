package study06.wordmap_lj;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordMap {
	public static void main(String[] args) throws IOException {
		
		
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
		
		
		
		HashMap<Integer, HashMap<String, Integer>> hm2 = new HashMap<>();
		
		for(String i : words) {
			
			HashMap<String, Integer> hm;
		
				if(hm2.containsKey(i.length())) {
				
				hm = hm2.get(i.length());
				
			} else {
				
				hm = new HashMap<>();
				
			}
			
			for(int j = 0; j < i.length(); j++) {
				
					String a = String.valueOf(i.charAt(j));	
								
					if(hm.containsKey(a)) {
						
						hm.put(a, hm.get(a)+1);
						
					} else {
						
						hm.put(a, 1);
						
					}
			}
			
			hm2.put(i.length(), hm);
		
		}
		
		for(Map.Entry<Integer, HashMap<String, Integer>> iii : hm2.entrySet()) {
			
			int a = iii.getKey();
			HashMap<String, Integer> hm3 = iii.getValue();
			
			for(Map.Entry<String, Integer> hm4 : hm3.entrySet()) {
				
				String b = hm4.getKey();
				int c = hm4.getValue();
				System.out.println(a + "글자 단어-> " + b + ": "+ c);
			}
			System.out.println("====================");
		}
		
		System.out.println(hm2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		//키값은 고유하기때문에 여기서 타입 순서를 바꿀 수 없음
//		HashMap<String,Integer> hm = new HashMap<>();
//		
//		//words배열을 해쉬맵 키=값으로 넣어주기 위해 향상된 for문사용
//		for(String i : words ) {
//			
//			hm.put(i,i.length());			
//			
//		}
//		
//		System.out.println(hm);
//		
//		//글자수로 단어를 찾으려고 entrySet이용
//		Set<Entry<String, Integer>> entrySet = hm.entrySet();
//		//글자수가 같은 단어를 넣어줄 배열 생성
//		ArrayList<String> wordsLength = new ArrayList<>();
//		
//		for(Entry<String,Integer> entry : entrySet) {
//			
//			if(entry.getValue() == 5) {
//								
//					wordsLength.add( entry.getKey());
//				
//				
//			}
//		}
//	
//		String arr = "";
//		String[] words = ""
//		for(int i = 0; i < wordsLength.size(); i++) {
//			
//			arr = wordsLength.get(i);
//			= arr.split("");
//			
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
	}

}
