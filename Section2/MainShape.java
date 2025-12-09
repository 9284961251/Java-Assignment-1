package Section2;
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    double calculateArea() {
        return width * height;
    }
}

public class MainShape{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.calculateArea());
    }
}