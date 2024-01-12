package Project;

public class RecursivePalindrome {
    
    public static void main(String[] args) {
     String palindrome = "abcba";
     System.out.println("Строка abcba - палиндром?: " + isPalindrome(palindrome));   
    }
    public static boolean isPalindrome(String palindrome){
        
        return isPalindrome(palindrome, 0, palindrome.length()- 1);
    }
    private static boolean isPalindrome(String palindrome, int low, int high){
        if(high <= low)
            return true;
        else if (palindrome.charAt(low) != palindrome.charAt(high))
            return false;
        else
            return isPalindrome(palindrome, low + 1, high - 1);

    }
}
