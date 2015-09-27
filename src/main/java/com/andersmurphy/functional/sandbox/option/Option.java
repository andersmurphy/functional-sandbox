package com.andersmurphy.functional.sandbox.option;

/**
 * Created by anders on 27/09/15.
 */
public abstract class Option<T> {

    public abstract boolean hasValue();

    public abstract T getOrExplode();

    public T getOrElse(T alternative) {
        return hasValue() == true ? getOrExplode() : alternative;
    }
}
