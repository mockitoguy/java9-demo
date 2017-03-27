package com.linkedin.java9demo.impl.internal;

import com.linkedin.java9demo.api.internal.InternalApi;

public class RogueClass {

    public static void main(String[] args) {
        //using internal type from api:

        System.out.println(new InternalApi().toString());
    }
}
