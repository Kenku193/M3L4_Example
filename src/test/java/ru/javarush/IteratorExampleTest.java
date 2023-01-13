package ru.javarush;
import org.mockito.Mockito;
import org.junit.*;

import java.util.Iterator;

import static org.junit.Assert.*;
public class IteratorExampleTest {

    @Test
    public void testSnippet() {

        Iterator i = Mockito.mock(Iterator.class);

        Mockito.when(i.next()).thenReturn("Hello").thenReturn("World");


        String result = i.next() + " " + i.next() + " " + i.next();

        assertEquals("Hello World", result);


    }

}
