package me.apoorvaagupta;

import com.sun.jdi.IntegerValue;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Processor class for processing(adding) variables
 * @param <T>
 */
public class Processor<T> {

    private final Class<T> classname;

    /**
     * Constructor for processor class
     * @param classanme
     */
    public Processor(Class<T> classanme) {
        this.classname = classanme;
    }

    /**
     * Adds the arguement variables
     * @param var1
     * @param var2
     * @param <T>
     * @return
     */
    public <T> T process(T var1, T var2) {

        if (this.classname == Integer.class) {
            return (T) new Integer((Integer) var1 +  (Integer) var2);
        } else {
            return (T) ((String) var1 + (String) var2);
        }


    }


}
