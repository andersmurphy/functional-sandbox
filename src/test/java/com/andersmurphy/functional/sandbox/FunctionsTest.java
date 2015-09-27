package com.andersmurphy.functional.sandbox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by anders on 24/09/15.
 */
public class FunctionsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void function_prints_hello_name() throws Exception {
        FunctionVoid func = new FunctionVoid<String>() {
            @Override
            public void apply(String name) {
                System.out.print("Hello " + name);
            }
        };

        func.apply("Anders");

        assertThat(outContent.toString(), is(equalTo("Hello Anders")));

    }

    @Test
    public void function_mutiplies_by_two() throws Exception {
        FunctionReturn func = new FunctionReturn<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        assertThat((Integer) func.apply(3), is(equalTo(6)));
    }

    @Test
    public void function_mutiplies_by_two_and_returns_result_as_string() throws Exception {
        FunctionReturn func = new FunctionReturn<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return Integer.toString(integer * 2);
            }
        };
        assertThat((String) func.apply(4), is(equalTo("8")));
    }

    @Test
    public void function_mutiplies_by_two_numbers_and_returns_result_as_string() throws Exception {
        Function2Return func = new Function2Return<Integer, Integer, String>() {
            @Override
            public String apply(Integer arg1, Integer arg2) {
                return Integer.toString(arg1 * arg2);
            }
        };
        assertThat((String) func.apply(4, 9), is(equalTo("36")));
    }

}