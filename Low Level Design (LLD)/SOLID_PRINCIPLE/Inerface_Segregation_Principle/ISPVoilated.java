package SOLID_PRINCIPLE.Inerface_Segregation_Principle;


//Breakes ISP
// The Interface Segregation Principle (ISP) makes fine-grained interfaces that are client specific.
public class ISPVoilated {
    public static void main(String[] args) {

        Shape sqaure = new Square(2,5);
        Shape reactangle = new Rectangle(10,5);
        Shape cuboid = new Cuboid(3,2,10);

        sqaure.area();
        reactangle.area();
        cuboid.area();
        cuboid.volume();
        reactangle.volume();



        try{
            cuboid.area();
        }catch (UnsupportedOperationException e){
            System.out.println("Exception : "+e.getMessage());
        }

//        sqaure.area();
    }
}

abstract class Shape{

    int l;
    int h;
    int b;

    public Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public Shape(int l, int h, int b) {
        this.l = l;
        this.h = h;
        this.b = b;
    }


    public abstract void area();
    public abstract void volume ();
}


class Square extends Shape{


    public Square(int l, int b) {
        super(l, b);
    }

    @Override
    public void area() {
        System.out.println("Area of square : "+l*l);
    }

    @Override
    public void volume() {
        throw new UnsupportedOperationException("Volume not applicable for Rectangle"); // Unnecessary method
    }


}

class Rectangle extends Shape{


    public Rectangle(int l, int b) {
        super(l, b);
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle : "+l*b);
    }

    @Override
    public void volume() {
        throw new UnsupportedOperationException("Volume not applicable for Rectangle"); // Unnecessary method
    }


}
class Cuboid extends Shape{

    public Cuboid(int l, int h, int b) {
        super(l, h, b);
    }

    @Override
    public void area() {
        System.out.println("Area of Cube : "+2*((l*h)+(l*b)+(b*h)));
    }

    @Override
    public void volume() {
        System.out.println("Volume of Cuboid :"+(l*b*h));
    }
}
