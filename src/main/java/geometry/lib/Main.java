package geometry.lib;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(10,5,6,4);
        System.out.println("Площадь"+"---"+triangle.area());
        System.out.println("Перимитр"+"---"+triangle.perimeter());
    }
}
