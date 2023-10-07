package exercises.Computer;

public class Circle {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area of circle is - " + (3.14 * (radius * radius)));
    }
}
