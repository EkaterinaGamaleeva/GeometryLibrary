package geometry.lib;

import geometry.lib.Figure;

public class Сircle implements Figure {
    private int r;

    public Сircle(int r) {
        this.r = r;
    }

    @Override
    public int area() {
        return (int) (Math.PI*(r*r));
    }

    @Override
    public int perimeter() {
        return (int) (2*Math.PI*r);
    }
}
