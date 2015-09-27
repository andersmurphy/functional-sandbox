package com.andersmurphy.functional.sandbox.functions;

/**
 * Created by anders on 24/09/15.
 */
public interface FunctionReturn<Argument, ReturnType> {
    ReturnType apply(Argument argument);
}
