package com.demojunit;

public class CheckString {
	public boolean isvowel(char c ) {
		if(c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
	}
	public int containvowel(String s) {
		int count = 0;
		for(char c:s.toCharArray()) {
			if(isvowel(c)) count++;
		}
		return count;
	}
}
