
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class StringTest {

    private StringUtil classToTest;

    /**
     * 1. What is the length of this text?
     * 
     * @param word
     * @param excepted
     */
    @ParameterizedTest
    @CsvSource({
            "progress,8",
            "This,4",
            "Alright,7",
            "WeCanCodeit,11"
    })
    public void stringLengthTest(String word, int excepted) {
        classToTest = new StringUtil();
        int result = classToTest.getStringLength(word);
        assertEquals(excepted, result);

    }

    /**
     * 2. Convert the variable word to all Upper case
     * 
     * @param word
     * @param excepted
     */
    @ParameterizedTest
    @CsvSource({
            "progress,PROGRESS",
            "This,THIS",
            "Alright,ALRIGHT",
            "WeCanCodeit,WECANCODEIT"
    })
    void getStringToUpperTest(String word, String excepted) {
        classToTest = new StringUtil();
        String result = classToTest.getStringToUpper(excepted);
        assertEquals(excepted, result);
    }

    /**
     * 3. Convert the variable word to all lower case
     * 
     * @param word
     * @param excepted
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,progress",
            "This,this",
            "Alright,alright",
            "WeCanCodeIt,wecancodeit"
    })
    void getStringToLowerTest(String word, String excepted) {
        classToTest = new StringUtil();
        String result = classToTest.getStringToLower(word);
        assertEquals(excepted, result);
    }

    /**
     * 4. What index is “Code” located in?
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,gress,3",
            "This,is,2",
            "Alright,right,2",
            "WeCanCodeIt,Code,5"
    })
    void getStringIndexTest(String word, String find, int excepted) {
        classToTest = new StringUtil();
        int result = classToTest.getStringIndex(word, find);
        assertEquals(excepted, result);
    }

    /**
     * 5. Trim the following word to print out “WeCanCodeIt"
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,Progress",
            "This,This",
            "Alright,Alright",
            "WeCanCodeIt,WeCanCodeIt"
    })
    void getStringTrimTest(String word, String excepted) {
        classToTest = new StringUtil();
        word += "  ";
        String result = classToTest.getStringTrim(word);
        assertEquals(excepted, result);
    }

    /**
     * 6. Use the substring method to display the last letter of “WeCanCodeIt"
     * 
     * @param word
     * @param excepted
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,s",
            "This,s",
            "Alright,t",
            "WeCanCodeIt,t",
    })
    void getLastCharacterTest(String word, String excepted) {
        classToTest = new StringUtil();
        String result = classToTest.getLastCharacter(word);
        assertEquals(excepted, result);
    }

    /**
     * 7. Use the substring method to display the first letter of “WeCanCodeIt”
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,P",
            "This,T",
            "Alright,A",
            "WeCanCodeIt,W",

    })
    void getFirstCharacterTest(String word, String excepted) {
        classToTest = new StringUtil();
        String result = classToTest.getFirstCharacter(word);
        assertEquals(excepted, result);
    }

    /**
     * 8. Replace the first occurrence of “aa” with “bb” from the following variable
     * 
     * @param word
     * @param find
     * @param excepted
     */
    @ParameterizedTest
    @CsvSource({
            "aabbccddbb,bb,aa,aaaaccddbb",
            "This,is,at,That",
            "Alright,right,l,All",
            "WeCanCodeIt,Code,Student,WeCanStudentIt"
    })
    void getStringIndexTest(String word, String find, String replace, String excepted) {
        classToTest = new StringUtil();
        String result = classToTest.getReplace(word, find, replace);
        assertEquals(excepted, result);
    }

    /**
     * 9. Use the method contains() to check if the following variable contains
     * “Code”
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,gress, true",
            "This,That,false",
            "Alright,All,false",
            "WeCanCodeIt,Code,true",

    })
    void getFirstCharacterTest(String word, String find, boolean excepted) {
        classToTest = new StringUtil();
        boolean result = classToTest.getContains(word, find);
        assertEquals(excepted, result);
    }

    /**
     * 10. Reverse a String
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,ssergorP",
            "This,sihT",
            "Alright,thgirlA",
            "WeCanCodeIt,tIedoCnaCeW",

    })
    void getReverseTest(String word, String excepted) {
        classToTest = new StringUtil();
        String result = classToTest.reverseString(word);
        assertEquals(excepted, result);
    }

    /**
     * 11. Duplicate Characters
     */
    @ParameterizedTest
    @CsvSource({
            "Progress,rs",
            "This Better be all,tel",
            "Alright,",
            "WeCanCodeIt,Ce",

    })
    void getDuplicateTest(String word, String excepted) {
        classToTest = new StringUtil();
        String result = classToTest.findDuplicates(word);
        assertEquals(excepted, result);
    }
}
