package No6_EnglishWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class quiz06_J {	

	public static void main(String[] args) {

		/*
		 * 	단어 100개가 들어있는 배열이 있다. 
			단어의 최소 길이가 5(예, apple),  최대 길이가 15 (예,acknowledgement)
			이 단어들은 영어이고, 전부 소문자이다.
			단어 길이마다, 5~15, 제일 많이 사용하는 알파벳이 무엇인지를 찾아내시오.			
			ex. 
			만약 길이 5인 단어들이 apple, crazy, pizza , aaaa 라고 하면			
			a -> 6  
			p-> 3
			z ->3
			c ->1
			l->1
			y ->
			e->1			
			이렇게 컴퓨터가 인식하도록 해야 한다.
		 */

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


		Map<Integer, List<String>> map = new HashMap<>();		

		for (String word : words) {//문자열을 그룹화해주기
			
			int len = word.length(); //문자열의 길이
			
			List<String> wordList = map.get(len); //길이에 따라 단어를 리스트에 담기
			
			if (wordList == null) { //만약 비어있다면
				wordList = new ArrayList<String>();  //ArrayList를 새로 생성해서 담기
			}
			wordList.add(word); //문자열 담기
			map.put(len, wordList); //길이가 키, 단어리스트가 값. 이걸 map에 넣어줌
		}

		//map2 -> 길이가 키, 길이에 해당하는 단어들에서 알파벳이 나온 횟수가 값
		Map<Integer, Map<Character, Integer>> map2 = new HashMap<Integer, Map<Character, Integer>>();
		
		//단어 길이별로 알파벳이 나온 횟수 세기
		for (int len : map.keySet()) { //map의 모든 키(단어의 길이)를 확인
			
			//길이에 대한 새로운 map3 생성 - 알파벳이 키, 해당 알파벳이 나온 횟수가 값
			Map<Character, Integer> map3 = new HashMap<Character, Integer>();

			for (String word : map.get(len)) { //길이가 len만큼인 단어를 가져오기 (반복) 문자배열로 가져옴

				char[] c = word.toCharArray(); //문자 하나하나 확인

				for (char r : c) { //문자 r이 map3에 들어있는지 확인
					if (map3.containsKey(r)) {
						map3.put(r, map3.get(r) + 1); //map3에 들어있으면 1 증가
					} else {
						map3.put(r, 1); //안 들어 있으면 새로 추가
					}
				}
			}
			map2.put(len, map3); 
			//map2:위의 두 가지를 저장했던 타입의 맵
			//문자 길이(key 키)와 해당하는 길이의 단어들과 알파벳의 등장한 횟수를 저장한 map3(value 값) 저장
		}

		for (int len : map2.keySet()) { //map2의 모든 길이 확인
			System.out.println("문자열 길이 : " + len);
			Map<Character, Integer> m = map2.get(len);
			for (char c : m.keySet()) { //c - 알파벳 의미하는 변수
				System.out.println(c + "->" + m.get(c)); //알파벳이 나온 횟수 출력
			}
		}
	}


}

//푸는 순서
//
//Map<Integer, List<String>> map = new HashMap<>();		
//for(String word : words) { //문자열을 그룹화해주기
//int length = word.length(); //문자열의 길이
//if(!map.containsKey(length)) { //해당하는 단어의 길이가 없으면/ length 말고 word면 이미 키로 사용중이라 중복됨
//	map.put(length, new ArrayList<>()); //map에 키-값 추가 List 객체를 값으로 map에 추가
//}
//
//List<String> wordsList = map.get(length);
//wordsList.add(word); //문자열의 길이: 키, 해당 길이의 문자열이 List로 저장됨
//
//Map<Character, Integer> map2 = new HashMap<>();  //문자를 키로 사용, 문자 반복횟수가 값
//
//for(char c : word.toCharArray() ) { //문자열을 문자배열로 변환
//	map2.put(c, map2.getOrDefault(c, 0) + 1); //해당 문자의 반복되는 횟수 저장
//	//getOrDefault - map에 해당문자가 있으면 값을 가져옴, 없으면 0반환. 이미 있으면 1 증가.
//}
//for(Map.Entry<Character, Integer> entry: map2.entrySet()) {
//	System.out.println(entry.getKey()+ "->" + entry.getValue());				
//}			
//}

