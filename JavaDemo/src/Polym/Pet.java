package Polym;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public interface Pet {
    public void eat();
    default void fun(){
        System.out.println("123");
    }
}
