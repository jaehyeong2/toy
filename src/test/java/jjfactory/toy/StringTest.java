package jjfactory.toy;

import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void concatTest(){
        String ss = "hi lee!";
        String after = "bye~";

        boolean hi = after.contains("hi");
        boolean ssCon = ss.contains("hi");
        System.out.println("contain? = " + hi);
        System.out.println("contain? = " + ssCon);

        boolean equals = ss.equals("hi lee!");
        System.out.println("equals = " + equals);

        boolean startsWith = ss.startsWith("hi2 ");
        System.out.println("startsWith = " + startsWith);

        int i = ss.indexOf("e");
        System.out.println("i = " + i);

    }
}
