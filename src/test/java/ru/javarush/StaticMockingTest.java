package ru.javarush;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.junit.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class StaticMockingTest {
    @Test
    public void myNameIsTest(){
        MockedStatic<DataService> dataServiceMockedStatic = Mockito.mockStatic(DataService.class);
        dataServiceMockedStatic.when(DataService::myName).thenReturn("Privet");
        assertEquals("Privet", DataService.myName());
        dataServiceMockedStatic.verify(DataService::myName);
    }

    @Test
    public void iAmTheDangerTest(){
        MockedStatic<DataService> dataServiceMockedStatic = Mockito.mockStatic(DataService.class);
        dataServiceMockedStatic.when(() -> DataService.iAmTheDanger(2,6)).thenReturn(10);
        assertEquals(10, DataService.iAmTheDanger(2,6));
    }
}
