package ru.javarush;
import org.mockito.Mockito;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParametersTest {

    @Test
    public void getTextSumTest(){
        DataService mock = Mockito.mock(DataService.class);

        Mockito.doReturn("90").when(mock).getTextSum(1,2);
        assertEquals("90", mock.getTextSum(1,2));


        assertEquals(null, mock.getTextSum(3,3));

    }

    @Test
    public void getTextAnySumTest(){
        DataService mock = Mockito.mock(DataService.class);

        Mockito.when(mock.getTextSum(Mockito.anyInt(), Mockito.anyInt())).thenReturn("90");
        Mockito.when(mock.getTextSum(Mockito.anyInt(), Mockito.anyShort())).thenReturn("90");


      //  Mockito.doReturn("90").when(mock).getTextSum(1,2);
        assertEquals("90", mock.getTextSum(1,2));
    }

    @Test
    public void getTextValueSumTest(){
        DataService mock = Mockito.mock(DataService.class);

        // SAME & EQ
        Mockito.when(mock.getTextSum(Mockito.same(7), Mockito.eq(8))).thenReturn("90");
      //  Mockito.when(mock.getTextSum(Mockito.anyInt(), Mockito.anyShort())).thenReturn("90");

        assertEquals("90", mock.getTextSum(7,8));
    }

    @Test
    public void getSomeDataArgumentTest(){
        DataService mock = Mockito.mock(DataService.class);
        Mockito.when(mock.getSomeData(Mockito.argThat(arg -> arg.startsWith("fu") && arg.length()>=3))).thenReturn(new ArrayList<String>());

        assertEquals(new ArrayList<String>(), mock.getSomeData("funfsdfds"));

    }

    @Test
    public void getThrowTest(){
        DataService mock = Mockito.mock(DataService.class);

        assertThrows(IllegalAccessError.class, () -> new DataService());
    }

}
