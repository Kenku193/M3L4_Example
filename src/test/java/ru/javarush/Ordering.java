package ru.javarush;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.ArgumentMatchers.endsWith;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class Ordering {
    @Test
    public void someTesting() {
        DataService mock = mock(DataService.class);

        when(mock.getSquare()).thenReturn(1000);
        when(mock.getTextSum(Mockito.anyInt(), Mockito.anyInt())).thenReturn("Тысяча");


        for (int i = 0; i < 10; i++) {
            mock.getSquare();
        }
        mock.getTextSum(Mockito.anyInt(), Mockito.anyInt());



        InOrder order = Mockito.inOrder(mock);


        order.verify(mock, times(10)).getSquare();
        order.verify(mock).getTextSum(Mockito.anyInt(), Mockito.anyInt());



    }
}
