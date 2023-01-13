package ru.javarush;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.AdditionalMatchers.eq;
import static org.mockito.AdditionalMatchers.or;
import static org.mockito.ArgumentMatchers.endsWith;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class HowItWorks_2_Test {
    @Test
    public void petesting(){
        // 1:  CОЗДАЕМ ЗАГЛУШКУ
        PasswordEncoder mock = Mockito.mock(PasswordEncoder.class);

        // 2: ОПРЕДЕЛЕЯЕМ ЧТО ДОЛЖНО ВЕРНУТЬСЯ
        when(mock.encode("a")).thenReturn("1");

        // 3: ВЫПОЛНЯЕМ МЕТОД и ПРОВЕРЯЕМ РЕЗУЛЬТАТ
       assertEquals(mock.encode("a"), "1");

    }

}
