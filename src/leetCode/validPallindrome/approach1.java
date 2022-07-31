package leetCode.validPallindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class approach1 {
	
	public boolean isPallindrome(String s){
		List<Character> l1 = new ArrayList();
		l1.add('a'); l1.add('b'); l1.add('c'); l1.add('d'); l1.add('e'); l1.add('f'); l1.add('g');
		l1.add('h'); l1.add('i'); l1.add('j'); l1.add('k'); l1.add('l'); l1.add('m'); l1.add('n');
		l1.add('o'); l1.add('p'); l1.add('q'); l1.add('r'); l1.add('s'); l1.add('t'); l1.add('u');
		l1.add('v'); l1.add('w'); l1.add('x'); l1.add('y'); l1.add('z');
		l1.add('1'); l1.add('2'); l1.add('3'); l1.add('4'); l1.add('5');
		l1.add('6'); l1.add('7'); l1.add('8'); l1.add('9'); l1.add('0');
		char[] a1 = new char[s.length()];
		int j=0;
		String allLowerCase = s.toLowerCase();
		if (s.equals(" ")){
			return true;
		}
		for (int i=0;i<allLowerCase.length();i++){
			if (l1.contains(allLowerCase.charAt(i))){
				a1[j] = allLowerCase.charAt(i);
				j++;
			}
		}
		int y=j-1;
		for (int x=0;x<=y;x++){
			if (a1[x]!=a1[y]){
				return false;
			}else {
				y--;
			}
		}
		return true;
	}
	public static void main(String [] args){
		String s = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		String s3 = " ";
		String s4 = "0p";
		approach1 a = new approach1();
		System.out.println("is valid Pallindrome?: "+ a.isPallindrome(s4));
	}
}
