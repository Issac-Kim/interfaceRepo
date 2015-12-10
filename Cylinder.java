public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return height * getArea();
    }

    public String toString(){
	return "Cylinder " + getName() + " with radius " + getRadius + " and height " + getHeight();
    }
}