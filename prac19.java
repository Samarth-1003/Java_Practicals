class Shape{
    public double area(){
        return 0;
    }

    public double parameter(){
        return 0;
    }
}

class Circle extends Shape{
    public double r;
    public Circle(double r){
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape{
    public int w;
    public int h;
    public Rectangle(int w, int h){
        this.w = w;
        this.h = h;
    }


    @Override
    public double area() {
        return w*h;
    }

}

class Triangle extends Shape{
    public double b;
    public double h;

    public Triangle(double b, double h){
        this.b=b;
        this.h=h;
    }

    @Override
    public double area() {
        return 0.5 * b *h;
    }
}

public class prac19 {
    public static void main(String args[]){
        Circle c = new Circle(4);
        System.out.println("Area of Circle: " + c.area());

        Rectangle r = new Rectangle(12,13);
        System.out.println("Area of Rectangle: " + r.area());

        Triangle t = new Triangle(12,11);
        System.out.println("Area Of Triangle: " + t.area());



    }
}