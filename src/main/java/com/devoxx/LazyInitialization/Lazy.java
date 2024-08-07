package com.devoxx.LazyInitialization;

import java.util.function.Supplier;

/*Level of InDirection Solves the Majority of Problems in Computer Programming
 * In Procedural Code, Pointer gives the power Of Indirection
 * In OO code, Overriding gives the Power
 * In Functional Programming Lambda gives the power
 */

class Lazy<T> {
    private T instance;
    private Supplier<T> supplier;

    public Lazy( Supplier<T> supplier ) {
        this.supplier = supplier;
    }

    public T get() {
        if (instance != null) {
            instance = supplier.get();
        }
        return instance;
    }
}
