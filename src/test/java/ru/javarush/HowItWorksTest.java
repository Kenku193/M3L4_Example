package ru.javarush;

import org.mockito.Mockito;
import org.junit.*;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class HowItWorksTest {

    @Test
    public void testSnippet() {

        List<String> anotherData = new ArrayList<>();
        anotherData.add("someExampleDataForTesting");

        DataService dataServiceMock = Mockito.mock(DataService.class);

        Mockito.when(dataServiceMock.getAllData()).thenReturn(anotherData);


        assertEquals(dataServiceMock.getAllData().size(), 1);


    }

    @Test
    public void testSquare() throws InterruptedException {
        DataService dataServiceMock = Mockito.mock(DataService.class);

        Mockito.doReturn(10).when(dataServiceMock).getSquare();

        assertEquals(dataServiceMock.getSquare(), 10);

    }

    @Test
    public void testGetSomeInnerClass(){
        DataService dataServiceMock = Mockito.mock(DataService.class);
        Mockito.when(dataServiceMock.getSomeInnerClass()).thenReturn(new SomeInnerClass());
    }
}
