package com.thoughtworks.tdd;

public class FizzBuzz {
    public static String fizzBuzz(int input){
        String result = "";
        if(input % 3 == 0){
            result += "Fizz";
        }
        if(input % 5 == 0){
            result += "Buzz";
        }
        if(input % 7 == 0){
            result += "Whizz";
        }

        if(result == ""){
            result += input;
        }
        return result;
    }
}
