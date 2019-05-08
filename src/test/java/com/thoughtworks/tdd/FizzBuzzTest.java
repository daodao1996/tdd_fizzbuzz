package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();

    @Test
    public void when_input_number_is_not_multiple_of_3_5_7() throws Exception {
        String actual = fb.fizzBuzz(2);
        assertThat(actual, is("2"));
    }

    @Test
    public void when_input_number_is_multiple_of_3() throws Exception {
        String actual = fb.fizzBuzz(9);
        assertThat(actual, is("Fizz"));
    }

    @Test
    public void when_input_number_is_multiple_of_5() throws Exception {
        String actual = fb.fizzBuzz(10);
        assertThat(actual, is("Buzz"));
    }

    @Test
    public void when_input_number_is_multiple_of_7() throws Exception {
        String actual = fb.fizzBuzz(14);
        assertThat(actual, is("Whizz"));
    }

    @Test
    public void when_input_number_is_multiple_of_3_and_5() throws Exception {
        String actual = fb.fizzBuzz(30);
        assertThat(actual, is("FizzBuzz"));
    }

    @Test
    public void when_input_number_is_multiple_of_3_and_7() throws Exception {
        String actual = fb.fizzBuzz(21);
        assertThat(actual, is("FizzWhizz"));
    }

    @Test
    public void when_input_number_is_multiple_of_5_and_7() throws Exception {
        String actual = fb.fizzBuzz(35);
        assertThat(actual, is("BuzzWhizz"));
    }

    @Test
    public void when_input_number_is_multiple_of_3_and_5_and_7() throws Exception {
        String actual = fb.fizzBuzz(105);
        assertThat(actual, is("FizzBuzzWhizz"));
    }
}
