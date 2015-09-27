package com.andersmurphy.functional.sandbox.option;

import java.util.Iterator;

/**
 * Created by anders on 27/09/15.
 */
public final class None<T> extends Option<T> {
    @Override
    public boolean hasValue() {
        return false;
    }

    @Override
    public T getOrExplode() {
        throw new UnsupportedOperationException("Cannot resolve value on None");
    }

    @Override
    public String toString() {
        return "None";
    }

    @Override
    public boolean equals(Object other) {
        return (other == null || other.getClass() != None.class) ? false : true;
    }

    @Override
    public int hashCode() {
        return -1;
    }
}
