package me.david.pythoninjava;

import me.david.pythoninjava.utils.StreamUtils;

public class Global {

    public static int abs(int number) {
        return Math.abs(number);
    }

    public static long abs(long number) {
        return Math.abs(number);
    }

    public static double abs(double number) {
        return Math.abs(number);
    }

    public static float abs(float number) {
        return Math.abs(number);
    }

    public static boolean all(Iterable<Boolean> iterable) {
        return StreamUtils.stream(iterable).allMatch(bool -> bool);
    }

    public static boolean any(Iterable<Boolean> iterable) {
        return StreamUtils.stream(iterable).anyMatch(bool -> bool);
    }

}
