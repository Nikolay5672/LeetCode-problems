package Easy.ArrayOrString;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int counter = 0;
        s = s.trim();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                counter = 0;
            }
            else{
                counter++;
            }
        }
        return counter;
    }

    public static int lengthOfLastWordUpdated(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // Find the index of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');

        // The length of the last word is the difference between the string length and the last space index
        return s.length() - lastSpaceIndex - 1;
    }

}
