package org.example.Strings;
// check if the given string is palindrome or not
public class IsPalindrome {
    static boolean isPalindrome(String word){
        word=word.toLowerCase();
        char[] arr = word.toCharArray();
        int start=0;
        int end = word.length()-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "Madam";
        System.out.println(isPalindrome(word));
    }
}
