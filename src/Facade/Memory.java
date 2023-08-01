package Facade;

import java.util.Arrays;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Added item to memory " + position);
        System.out.println(Arrays.toString(data));


    }
}
