public class Circle extends Shape{

    private double radius;

    public Circle(double radius, String name){
	super(name);
	this.radius = radius;
    }

    public double getRadius(){
	return radius;
    }

    public double getArea(){
	return Math.pow(getRadius(), 2) * Math.pi;
    }

    public String toString(){
	return "Circle "+getName()+" with radius of "+getRadius();
    }

}
