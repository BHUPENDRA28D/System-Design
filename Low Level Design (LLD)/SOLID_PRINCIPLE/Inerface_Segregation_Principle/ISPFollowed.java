package SOLID_PRINCIPLE.Inerface_Segregation_Principle;

public class ISPFollowed {
    public static void main(String[] args) {

        TwoDShape square    = new Squares(5);
        TwoDShape rectangle = new Reactangle(4, 6);
        ThreeDShape cube     = new Cube(3);

        System.out.println("Square Area: "    + square.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Cube Area: "      + cube.area());
        System.out.println("Cube Volume: "    + cube.volume());
    }
}

interface  TwoDShape{

    double area();

}

interface ThreeDShape{
    double area();
    double volume();
}


class Squares implements TwoDShape{

    int e;

    public Squares(int e) {
        this.e = e;
    }

    @Override
    public double area() {
        return e*e;
    }

}

//reactangle classs.

class Reactangle implements  TwoDShape{

    int l,b;

    public Reactangle(int l,int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        return l*b;
    }


}

class Cube implements ThreeDShape{

    int e;

    public Cube(int e) {
        this.e = e;
    }

    @Override
    public double area() {
        return 6*e*e;
    }

    @Override
    public double volume() {
        return  e*e*e;
    }
}
