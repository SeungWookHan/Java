public class Circle {
    int radius;
    String name;

    public Circle() {

    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

        Circle wook = new Circle();
        wook.radius = 38;
        wook.name = "한승욱";
        area = wook.getArea();
        System.out.println(wook.name + "의 면적은 " + area);
    }
}