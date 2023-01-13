package ru.javarush;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public class DataService {



    public List<String> getAllData(){
        return null;
    }

    public int getSquare() {
        return 1;
    }

    public String getTextSum(int a, int b){
       int result = a + b;
       return String.valueOf(result);
    }

    public SomeInnerClass getSomeInnerClass(){
        return new SomeInnerClass();
    }


    public List<String> getSomeData(String x){
        return null;
    }

    public DataService() {
        throw new IllegalAccessError();
    }

    public IllegalArgumentException exceptionThrower(){
        return new IllegalArgumentException();
    }

    public static String myName() {
        return "Say my name!";
    }

    public static int iAmTheDanger(int a, int b) {
        return a+b;
    }
}

class SomeInnerClass {

}
