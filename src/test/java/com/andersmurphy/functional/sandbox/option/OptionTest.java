package com.andersmurphy.functional.sandbox.option;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by anders on 27/09/15.
 */
public class OptionTest {

    @Test
    public void getOrElse_returns_some_when_otpion_has_a_value() throws Exception {
        Option<String> optionWithValue = new Some<String>("SomeValue");

        assertThat(optionWithValue.getOrElse("SomeAlternativeValue"), is(equalTo("SomeValue")));
    }

    @Test
    public void getOrElse_returns_none_when_otpion_has_no_value() throws Exception {
        Option<String> optionWithNoValue = new None<String>();

        assertThat(optionWithNoValue.getOrElse("SomeAlternativeValue"), is(equalTo("SomeAlternativeValue")));
    }

    @Test
    public void hasValue_returns_true_when_option_has_a_value() throws Exception {
        Option<String> optionWithValue = new Some<String>("SomeValue");

        assertThat(optionWithValue.hasValue(), is(equalTo(true)));
    }

    @Test
    public void hasValue_returns_false_when_option_has_no_value() throws Exception {
        Option<String> optionWithNoValue = new None<String>();

        assertThat(optionWithNoValue.hasValue(), is(equalTo(false)));
    }
}