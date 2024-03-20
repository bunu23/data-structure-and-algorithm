package algo;

import java.util.Arrays;

public class KMPAlgorithm {

	 public static void computeLPSArray(char[] pattern, int[] lps) {
	        int n = pattern.length;
	        lps[0] = 0; 
	        int i = 1;
	        int j = 0;

	        while (i < n) {
	            if (pattern[i] == pattern[j]) {
	                lps[i] = j + 1;
	                i++;
	                j++;
	            } else {
	                // mismatch
	                if (j != 0) {
	                    j = lps[j - 1]; 
	                } else {
	                    lps[i] = 0; 
	                    i++;
	                }
	            }
	        }
	    }

	    public static void search(char[] text, char[] pattern) {
	        int n = text.length;
	        int m = pattern.length;

	        int[] lps = new int[m];
	        computeLPSArray(pattern, lps);

	        int i = 0;
	        int j = 0;

	        while (i < n) {
	            if (text[i] == pattern[j]) {
	                i++;
	                j++;
	                if (j == m) {
	                    // pattern found
	                    System.out.println("Pattern found at index " + (i - m));
	                    j = lps[j - 1]; 
	                }
	            } else {
	                // mismatch
	                if (j != 0) {
	                    j = lps[j - 1]; 
	                } else {
	                    i++; 
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String text = "ABABDABACDABABCABAB";
	        String pattern = "A";
	        search(text.toCharArray(), pattern.toCharArray());
	    }
	}

   