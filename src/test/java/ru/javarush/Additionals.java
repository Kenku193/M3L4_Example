package ru.javarush;


import org.junit.*;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.ArgumentMatchers.*;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class Additionals {

    @Test
    public void someTesting() {
        PasswordEncoder mock = mock(PasswordEncoder.class);

        String pass = "Huevos";

        when(mock.encode(pass)).thenReturn("1");
        String encode = mock.encode(pass);
    //    assertEquals("1", encode);
        verify(mock).encode(or(eq("a"), endsWith("s")));
    }
}
