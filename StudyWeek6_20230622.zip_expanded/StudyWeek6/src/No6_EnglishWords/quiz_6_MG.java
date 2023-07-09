package No6_EnglishWords;

import java.util.HashMap;
import java.util.Map;

public class quiz_6_MG {
    public static void main(String[] args) {
        String[] words = {
            "better", "vest", "raspy", "tearful", "dream", "accept", "ignore", "elfin", "pat", "wail",
            "itchy", "attract", "unpack", "assorted", "month", "cast", "beef", "arithmetic", "petite", "umbrella",
            "kaput", "frightened", "frame", "abounding", "yak", "resonant", "trace", "simplistic", "three", "slip",
            "train", "name", "lock", "windy", "guide", "calm", "tedious", "decisive", "illustrious", "exciting",
            "lamp", "adamant", "average", "finger", "sack", "vanish", "damaged", "bed", "compare", "notebook",
            "beds", "delight", "cowardly", "unknown", "shiver", "kill", "bright", "greedy", "makeshift", "cellar",
            "owe", "pack", "water", "paper", "rub", "incompetent", "neck", "tense", "airport", "cheap", "structure",
            "gaudy", "wound", "knot", "park", "simple", "brush", "fail", "volatile", "jam", "chubby", "pour",
            "load", "abortive", "increase", "knowledge", "meal", "cream", "stitch", "laugh", "treatment", "reach",
            "approval", "war", "kindhearted", "comparison", "past", "standing", "crown", "society"
        };

        Map<Integer, Map<Character, Integer>> lengthMap = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            if (length >= 5 && length <= 15) {
                Map<Character, Integer> countMap = lengthMap.getOrDefault(length, new HashMap<>());

                for (char c : word.toCharArray()) {
                    countMap.put(c, countMap.getOrDefault(c, 0) + 1);
                }

                lengthMap.put(length, countMap);
            }
        }

        for (Map.Entry<Integer, Map<Character, Integer>> entry : lengthMap.entrySet()) {
            int length = entry.getKey();
            Map<Character, Integer> countMap = entry.getValue();

            int maxCount = 0;
            char mostFrequentChar = '\0';

            for (Map.Entry<Character, Integer> countEntry : countMap.entrySet()) {
                char c = countEntry.getKey();
                int count = countEntry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    mostFrequentChar = c;
                }
            }

            System.out.println("Length " + length + ": Most frequent character is '" + mostFrequentChar + "' with count " + maxCount);
        }
    }
}
