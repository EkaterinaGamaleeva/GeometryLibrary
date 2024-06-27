package geometry.lib;

import geometry.lib.Figure;

public class Rectangle implements Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int area() {
        return a*b;
    }

    @Override
    public int perimeter() {
        return 2*(a+b);
    }

    public static class Main {
        public static void main(String[] args) {
            Сircle circle=new Сircle(5);
            System.out.println(circle.perimeter());
            System.out.println(circle.area());
        }
    }
}
