/* (C)2023 */
package jxline;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTest {
    @Test
    public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
