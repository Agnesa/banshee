package com.smauel.banshee;

import java.util.Arrays;
import java.util.List;

public class Banshee {

    public int add(int a, int b) {
        return a + b;
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public List<String> listNames(String...names) {
        return Arrays.asList(names);
    }


}
