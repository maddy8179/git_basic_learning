package com.basic.learn;

import java.util.Scanner;

public class PalindromeSubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = countSP(input);
        System.out.println(count);
    }
    public static int countSP(String str){
        int count = 0;
        int n = str.length();
        for( int i = 0; i < n; i++){
            for( int j = i+1; j < n; j++){
                if(isPalindrome(str, i,j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str, int i, int j){
        while ( i < j){
            if ( str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
