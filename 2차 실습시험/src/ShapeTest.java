import java.util.Scanner;

class Shape{
	public Shape next;
	public Shape() {next = null;}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	int length;
	public Line(int length) {
		this.length = length;
	}
	public void draw() {
		System.out.println("Line: " + length);
	}
}

class Circle extends Shape{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle: " + radius);
	}
}

class Rect extends Shape{
	int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("Rect: " + width + "x" + height);
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape start = null;
		Shape last = null;
		Shape obj = null;
		
		Scanner input = new Scanner(System.in);
		int i = 0;
		while(true) {
			if(i >= 4) {
				break;
			}
			System.out.print("1. Line 2.Circle 3.Rect: ");
			int num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("선의 길이를 입력하시오: ");
				int length = input.nextInt();
				if(i==0) {
					start = new Line(length);
					last = start;
				}
				else {
					obj = new Line(length);
					last.next = obj;
					last = obj;
				}
				i++;
				break;
			case 2:
				System.out.print("원의 반지름을 입력하시오: ");
				int radius = input.nextInt();
				if(i==0) {
					start = new Circle(radius);
					last = start;
				}
				else {
					obj = new Circle(radius);
					last.next = obj;
					last = obj;
				}
				i++;
				break;
			case 3:
				System.out.print("사각형의 너비와 높이를 입력하시오: ");
				int width = input.nextInt();
				int height = input.nextInt();
				if(i==0) {;
					start = new Rect(width, height);
					last = start;
				}
				else {
					obj = new Rect(width, height);
					last.next = obj;
					last = obj;
				}
				i++;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 1, 2, 3 번 중에 입력하세요.");
			}
		}
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}

	}

}
