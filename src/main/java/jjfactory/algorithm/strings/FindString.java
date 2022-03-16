package jjfactory.algorithm.strings;

import java.util.Locale;
import java.util.Scanner;

public class FindString {
    public int solution(String str,char ch){
        int answer = 0;
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        FindString T = new FindString();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        System.out.println("input1 = " + input1);
        char input2 = sc.next().charAt(0);

        System.out.println("input2 = " + input2);

        System.out.println(T.solution(input1,input2));
    }
}
