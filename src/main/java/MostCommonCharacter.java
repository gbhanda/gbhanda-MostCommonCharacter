import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int highestFrequency = 0;
        char mostCommonCharacter = '\n';
        for(int i = 0; i < str.length(); i++){
            char thisChar = str.charAt(i);
            if(map.containsKey(thisChar)) map.replace(thisChar, map.get(thisChar) + 1);
            else map.put(thisChar, 1);
            if (highestFrequency < map.get(thisChar)) {
                highestFrequency = map.get(thisChar);
                mostCommonCharacter = thisChar;
            }
        }


        return mostCommonCharacter;
    }
}
