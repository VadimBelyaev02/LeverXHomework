package com.google.withExternalLibrary;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class Program {

    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new ImmutablePair<>(1, 2);
        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        System.out.println(pair);
    }


}


