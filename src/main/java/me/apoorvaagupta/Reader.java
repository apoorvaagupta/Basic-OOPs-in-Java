package me.apoorvaagupta;

import java.util.Scanner;

/**
 * Reader class for taking console input
 * @param <T>
 */

public class Reader<T> {

    Scanner scn;
    private final Class<T> classname;

    /**
     * Constructor for reader class
     * @param classanme
     */
    public Reader(Class<T> classanme) {
        this.scn = new Scanner(System.in);
        this.classname = classanme;
    }

    /**
     * method to take input from console
     * @param <T>
     * @return
     */
    public <T> T takeInput() {

        if (this.classname == Integer.class) {
            return (T) new Integer(this.scn.nextInt());
        } else {
            return (T) this.scn.next();
        }


    }


}
