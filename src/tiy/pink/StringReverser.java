package tiy.pink;

/**
 * Created by bearden-tellez on 8/24/16.
 */
public class StringReverser {

    public String reverseString(String stringToReverse){
        char[] stringChars = stringToReverse.toCharArray();
        String reversedString = "";
        for (int charIndex = stringChars.length -1; charIndex >= 0; charIndex --){
            System.out.print(stringChars[charIndex]); //wrong bc this is printing not saving it as a string - not being returned. Can't be unit tested.
            reversedString += stringChars[charIndex];
        }
        //return stringToReverse;
        return reversedString;
    }

}
