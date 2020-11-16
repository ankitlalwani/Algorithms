package Arrays;

/*
P22. Generate Parentheses
Given n pairs of parentheses,
write a function to generate all combinations of well-formed parentheses.
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    public List<String> generateParenthesis(int n) {
        int openCounter=0;
        int closeCounter=0;
        String s = " ";
        List<String> list= new ArrayList();
        generateString(list,"", openCounter, closeCounter, n);
        return list;
    }

    public void generateString(List<String> list, String s, int openCounter, int closeCounter, int n){
        if(s.length()==2*n){
            list.add(s);
            openCounter=0;
            closeCounter=0;
            return;
        }

        if(openCounter<n){
            generateString(list, s+"(", openCounter+1, closeCounter, n);
        }
        if(closeCounter<openCounter){

            generateString(list, s+")", openCounter, closeCounter+1, n);
        }
    }

    public  static void main(String [] args){

        int n =3;
        GenerateParanthesis generateParanthesis = new GenerateParanthesis();

        List<String> result = generateParanthesis.generateParenthesis(n);

        System.out.println(result);

    }
}
