public class Main {
    public static void main(String[] args) {
        Shape kor = new Circle(2);
        System.out.println("A kerulete: " + kor.getPerimeter());
        System.out.println("A terulete: " + kor.getArea());

        Shape shape = new Shape() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

        Shape negyzet = new Square(2);
        System.out.println("A kerulete: " + negyzet.getPerimeter());
        System.out.println("A terulete: " + negyzet.getArea());
    }
}
