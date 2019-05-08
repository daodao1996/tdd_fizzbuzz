package com.thoughtworks.tdd;

import static com.thoughtworks.tdd.FizzBuzz.fizzBuzz;

public class Main {
    public static void main(String[] args){
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz(i+1);
            System.out.println(result);
        }
    }


}
