package com.andersmurphy.functional.sandbox.option;

/**
 * Created by anders on 27/09/15.
 */
public final class Some<T> extends Option<T> {

    private final T value;

    public Some(T value) {
        this.value = value;
    }

    @Override
    public boolean hasValue() {
        return true;
    }

    @Override
    public T getOrExplode() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Some<?> some = (Some<?>) o;

        if (value != null ? !value.equals(some.value) : some.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Some{" +
                "value=" + value +
                '}';
    }
}
