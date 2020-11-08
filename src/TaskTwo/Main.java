package TaskTwo;

public class Main {
    public static void main(String[] args) {
        RectangularBox rectangle = new RectangularBox();
        rectangle.setWidth(2.5);
        rectangle.setLength(4.5);
        rectangle.setHeight(10);

        rectangle.printSidesOfRectangularBox();
        System.out.println("Volume is: " + rectangle.getVolume());

        rectangle.printInformationOfRectangularBox();
    }
}