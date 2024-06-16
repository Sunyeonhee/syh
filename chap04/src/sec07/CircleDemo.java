package sec07;

class Circle{
double radius;
static int num0fCircles = 0;
int numCircles=0;

public Circle(double radius) {
	this.radius = radius;
	num0fCircles++;
	numCircles++;
   }
}

public class CircleDemo {

	public static void main(String[] args) {
	Circle myCircle = new Circle(10.0);
	Circle yourCircle = new Circle(5.0);
	
	//print();
	System.out.println("원의 개수 :" +Circle.num0fCircles);
	System.out.println("원의 개수 :" +yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("인스턴트 메서드입니다.");

	}

}
