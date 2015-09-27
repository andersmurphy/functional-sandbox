package com.andersmurphy.functional.sandbox.functions;

/**
 * Created by anders on 24/09/15.
 */
public interface Function2Return<Arg1, Arg2, ReturnType> {
    ReturnType apply(Arg1 arg1, Arg2 arg2);
}
