package com.company;

import java.io.Closeable;
import java.io.IOException;

public class Car implements Closeable {


    @Override
    public String toString() {
        return "Car{}";
    }

    @Override
    public void close() throws IOException {
        System.out.println("машина жабылып жатат");
    }
    public void drive(){
        System.out.println("машина журуп жатат");
    }
}
