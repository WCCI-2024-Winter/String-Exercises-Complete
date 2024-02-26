import java.util.HashMap;
import java.util.Map;

public class StringUtil {

    /**
     * 1. What is the length of this text?
     * 
     * @param input
     * @return
     */
    public int getStringLength(String input) {
        int result = 0;
        if (input != null) {
            result = input.length();
        }
        return result;
    }

    /**
     * 2. Convert the variable word to all Upper case
     * 
     * @param input
     * @return
     */
    public String getStringToUpper(String input) {
        String result = "";
        if (input != null) {
            result = input.toUpperCase();
        }
        return result;
    }

    /**
     * 3. Convert the variable word to all lower case
     * 
     * @param input
     * @return
     */
    public String getStringToLower(String input) {
        String result = "";
        if (input != null) {
            result = input.toLowerCase();
        }
        return result;
    }

    /**
     * 4. What index is “Code” located in?
     * 
     * @param input
     * @param toFind
     * @return
     */
    public int getStringIndex(String input, String toFind) {
        int result = 0;
        if (input != null) {
            result = input.indexOf(toFind);
        }
        return result;
    }

    /**
     * 5. Trim the following word to print out “WeCanCodeIt”
     * 
     * @param input
     * @return
     */
    public String getStringTrim(String input) {
        String result = "";
        if (input != null) {
            result = input.trim();
        }
        return result;
    }

    /**
     * 6. Use the substring method to display the last letter of “WeCanCodeIt"
     * 
     * @param input
     * @return
     */

    public String getFirstCharacter(String input) {
        String result = null;
        if (input != null) {
            result = input.substring(0,1);
        }
        return result;
    }

    /**
     * 7. Use the substring method to display the first letter of “WeCanCodeIt”
     * 
     * @param input
     * @return
     */
    public String getLastCharacter(String input) {
        String result = null;
        if (input != null) {
            result = input.substring(input.length() - 1);
        }
        return result;
    }

    /**
     * 8. Replace the first occurrence of “aa” with “bb” from the following variable
     */
    public String getReplace(String input, String find, String replace) {
        String result = null;
        if (input != null) {
            result = input.replaceFirst(find, replace);
        }
        return result;
    }

    /**
     * 9. Use the method contains() to check if the following variable contains
     * “Code”
     */
    public boolean getContains(String input, String find) {
        boolean result = false;
        if (input != null) {
            result = input.contains(find);
        }
        return result;
    }

    /**
     * 10. Reverse a String
     */
    public String reverseString(String original) {
        char[] charArray = original.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
/**
 * 11. Duplicate Characters in a String
 * @param inputString
 * @return
 */
    public String findDuplicates(String inputString) {
       StringBuilder result = new StringBuilder();

        Map<Character, Integer> charCount = new HashMap<Character, Integer>();
        
        char[] characters = inputString.toCharArray();

          for (char c : characters) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                result.append(entry.getKey());
            }
        }
        if(result.isEmpty()){
            return null;
        }
         return result.toString().trim();
    }
/**
 * 
 */
public String VowelCounter(String word){
    int vowelCount = 0;
    int consonantCount = 0;
    word = word.toLowerCase();
   
    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        } else if (ch >= 'a' && ch <= 'z') {
            consonantCount++;
        }
    }
  
    return "Number of vowels: " + vowelCount + " Number of consonants: " + consonantCount;
}
    
}
