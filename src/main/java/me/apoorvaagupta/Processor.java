package me.apoorvaagupta;

import com.sun.jdi.IntegerValue;

import java.math.BigInteger;
import java.util.Scanner;

public class Processor<T> {

    private final Class<T> classname;

    public Processor(Class<T> classanme) {
        this.classname = classanme;
    }

    public <T> T process(T var1, T var2) {

        if (this.classname == Integer.class) {
            return (T) new Integer((Integer) var1 +  (Integer) var2);
        } else {
            return (T) ((String) var1 + (String) var2);
        }


    }


}
