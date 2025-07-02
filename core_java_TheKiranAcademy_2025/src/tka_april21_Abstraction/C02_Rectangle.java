package tka_april21_Abstraction;

public class C02_Rectangle extends C00_Shape{		// follows only 2 methods of 5 - partially child class
	
	@Override
	void calArea() {
		System.out.println("\nArea of Rectangle : " + 12);
	}
	@Override
	void draw() {
		System.out.println("Rectangle is draw : ");
	}
	@Override
	void color() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void resize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}

// Rectangle class followed only 2 methods of abstract class Shape thats why it is compulsory or 'order' behalf of Shape class for Rect class to 'implement' remaining 3 abstract method of class Shape;