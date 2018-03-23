package me.apoorvaagupta;

import java.util.Scanner;

public class Reader<T> {

    Scanner scn;
    private final Class<T> classname;


    public Reader(Class<T> classanme) {
        this.scn = new Scanner(System.in);
        this.classname = classanme;
    }

    public <T> T takeInput() {

        if (this.classname == Integer.class) {
            return (T) this.scn.nextBigInteger();
        } else {
            return (T) this.scn.next();
        }


    }


}
