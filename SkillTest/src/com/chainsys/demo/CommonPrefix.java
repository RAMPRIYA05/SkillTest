package com.chainsys.demo;
import java.util.Scanner;
public class CommonPrefix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String[] arr=new String[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();	
		}	

		System.out.println("common Prefix:"+longestCommonSubstring(arr));
	}

	public static String longestCommonSubstring(String[] arr) {
		if (arr == null || arr.length == 0) {
        return "";
    }

    String firstString = arr[0];
    int maxSubstringLength = firstString.length();
    String longestSubstring = "";
    
    for(int i = 0; i < maxSubstringLength; i++) {
        for(int j = i+1; j<= maxSubstringLength; j++) {
            String substring = firstString.substring(i, j);
            if(containSubstring(arr, substring) && substring.length() > longestSubstring.length()) {
                longestSubstring = substring;
            }
        }
    }
        return longestSubstring;
    }
	
	private static boolean containSubstring(String[] arr, String substring) {
	       for (String str : arr) {
	           if(!str.contains(substring)) {
	               return false;
	           }
	       }
	       return true;
	   }	
	
}


