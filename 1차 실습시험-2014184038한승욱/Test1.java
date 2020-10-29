import java.util.Scanner;
class Shape{
	public Shape next;
	public Shape() {
		next = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	int length;
	Line(int length){
		this.length = length;
	}
	public void draw() {
		System.out.println("Line: "+this.length);
	}
}
class Circle extends Shape{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle: "+this.radius);
	}
}
class Rect extends Shape{
	int width, height;
	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("Rect: "+this.width+"X"+this.height);
	}
}
public class Test1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Shape start=null;
		Shape last=null;
		Shape obj =null;
		last = start;
		int i=0;
		while(i<5) {
			System.out.print("1.Line 2.Circle 3.Rect");
			int num = scanner.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("길이를 입력하시오:");
				int length = scanner.nextInt();
				if(i==0) {
					start = new Line(length);
					last = start;
					i++;
				}
				else {
					obj = new Line(length);
					last.next = obj;
					last = obj;
					i++;
				}
				break;
			case 2:
				System.out.print("반지름을 입력하시오:");
				int radius = scanner.nextInt();
				if(i==0) {
					start = new Circle(radius);
					last = start;
					i++;
				}
				else {
					obj = new Circle(radius);
					last.next = obj;
					last = obj;
					i++;
				}
				break;
			case 3:
				System.out.print("너비와 높이를 입력하시오:");
				int width = scanner.nextInt();
				int height = scanner.nextInt();
				if(i==0) {
					start = new Rect(width, height);
					last = start;
					i++;
				}
				else {
					obj = new Rect(width, height);
					last.next = obj;
					last = obj;
					i++;
				}
				break;
			default:
				System.out.println("잘못 입력했습니다(1~3");
			}
			Shape p = start;
			while(p != null) {
				p.draw();
				p = p.next;
			}
		}
	}
}
