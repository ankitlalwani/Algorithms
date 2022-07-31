package leetCode.validParenthesis;

public class approach1 {
	public boolean isValid(String s) {
		char[] temp = new char[s.length()];
		int j=0;
		for (int i=0;i<s.length();i++){
			if ((j==0) && (s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')) return false;
			if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
				temp[j]= s.charAt(i);
				j++;
			}else if (s.charAt(i)==')'&&temp[j-1]=='('){
					j--;
			}else if (s.charAt(i)=='}'&&temp[j-1]=='{'){
				j--;
			} else if (s.charAt(i)==']'&&temp[j-1]=='['){
				j--;
			} else return false;
		}
		if (j==0){
			return true;
		}else return false;
	}
	public static void main (String [] args){
		String input = "(){}}{";
		approach1 validParanthesis = new approach1();
		System.out.println(validParanthesis.isValid(input));
	}
}
