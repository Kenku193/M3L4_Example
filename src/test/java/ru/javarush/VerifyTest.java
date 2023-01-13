package ru.javarush;

import org.mockito.Mockito;
import org.junit.*;

import static org.junit.Assert.*;

public class VerifyTest {
    @Test
    public void dataSerivceVerifying() {

        DataService mock = Mockito.mock(DataService.class);

        Mockito.when(mock.getSquare()).thenReturn(1);

        assertEquals(1, mock.getSquare());

        Mockito.verify(mock).getSquare();

        Mockito.verify(mock, Mockito.times(1)).getSquare();
        Mockito.verify(mock, Mockito.atLeast(1)).getSquare();
        Mockito.verify(mock, Mockito.atLeastOnce()).getSquare();
        Mockito.verify(mock, Mockito.only()).getSquare();
         Mockito.verify(mock, Mockito.atMost(1)).getSquare();


         Mockito.verify(mock, Mockito.after(3000).atLeast(1)).getSquare();



    }

}
