package com.linkedin.java9.impl.internal;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
