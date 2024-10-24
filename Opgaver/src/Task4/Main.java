package Task4;

public class Main {
    public static void main(String[] args) {
        ShapeBuilder shapeBuilder = new ShapeBuilder();

        Circle circle1 = new Circle(5); // Radius = 5
        Square square1 = new Square(4); // Længde = 4

        shapeBuilder.addShape(circle1);
        shapeBuilder.addShape(square1);

        // Udskriv arealer
        System.out.println("Arealet af cirklen er: " + circle1.getArea());
        System.out.println("Arealet af kvadratet er: " + square1.getArea());

        // Udskriv det samlede areal
        System.out.println("Det samlede areal af alle formerne er: " + shapeBuilder.getTotalArea());
    }
}
