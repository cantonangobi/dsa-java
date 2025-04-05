package com.example;

public class RecursionTest {
    public String testing(int num){
        String result = "";
        result += num;
        if (num > 1){
            num --;
            return testing(num, result);
        }

        return result;

    }
    public String testing(int num, String result){
        // String result = "";
        result += ", \t" + num ;
        if (num > 1){
            num --;
            return testing(num, result);
        }

        return result;

    }
}
