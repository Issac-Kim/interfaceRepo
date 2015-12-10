public class Sphere extends Circle{

    public Sphere(double radius, String name){
	super(radius,name);
    }
    
    public double getVolume(){
	return 4.0/3 * Math.pi * Math.pow(getRadius(), 2);
    }

    public String toString(){
	return "Sphere " + getName() + "with radius " +  getRadius();
    }
}