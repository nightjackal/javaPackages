package utils;

public class stringLength{
    /**
     * This method counts the number of characters in a string and returning that value.
     * Preconditions: The String text must be passes through the getLgth() method as an argument and must be a string.
     * Postconditions: The output should be the integer representation of the length of the string inputted.
     * 
     * @param text
     * @return 0 Returns the integer literal 0
     * @return count Returns the length of the string
     */
    public int getLgth(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            count++;
        }
        return count;
    }
    //Heck yeah!
}