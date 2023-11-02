

	class Circle {
	    double radius;
	    double length;
	}

	class Calculator {
	    public void calculateCircleLength(Circle circle) {
	        circle.length = 2 * Math.PI * circle.radius;
	    }
	}

	public class MainClass {
	    public static void main(String[] args) {
	        Circle myCircle = new Circle();
	        
	        myCircle.radius = 5.0; 

	        Calculator myCalculator = new Calculator();

	        myCalculator.calculateCircleLength(myCircle);

	        System.out.println("Circle uzunluğu: " + myCircle.length);
	    }
	}



