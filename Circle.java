package day11;
/*
 Q 2  create interface Geometricshape having method like double area(), double perimeter()

b) create class circle  have constructor and also  inherits above interface and override its methods 
c) create Rectangle have constructor and also   	inherits above interface and override its methods 
d) create shape class having main method that as choice from user and based on choice it call method

 */
public class Circle implements Geometricshape
{    int radius;
    public Circle(int radius) {
		super();
		this.radius = radius;
	}

		@Override
	public double area() {
		 
		return Math.PI * radius*radius;
	}

	@Override
	public double perimeter() {
		 
		return 2*Math.PI*radius;
	}

}
