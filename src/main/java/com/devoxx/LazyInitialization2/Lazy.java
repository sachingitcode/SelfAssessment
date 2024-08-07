package com.devoxx.LazyInitialization2;

// Lambda code of Supplier<T> interface is only executed
// when we execute the get() method of Supplier interface.
// Main part is Supplier has get() method, Which return T .
// and supplier is initialised when get() is called

import java.util.function.Supplier;

public class Lazy<T> implements Supplier<T> {
    private final Supplier<T> supplier; // to initialise,call via constructor
    private T value;
    Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }
    @Override
    public T get() {
        if (value == null) {
            value = supplier.get();
        }
        return value;
    }
}