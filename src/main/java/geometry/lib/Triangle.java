package geometry.lib;

import geometry.lib.Figure;

public class Triangle implements Figure {
    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getH() {
        return h;
    }

    @Override
    public int area() {
        return (int) (0.5*a*h);
    }

    @Override
    public int perimeter() {
        return a+b+c;
    }
}
