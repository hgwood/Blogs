package com.zenika.tryy;

/**
 * A function throwing an exception.
 */
public interface TryFunction<I, O> {

    /**
     * Applies this function to the given argument.
     *
     * @param i the function argument
     * @return the function result
     * @throws Exception
     */
    O apply(I i) throws Exception;
}
