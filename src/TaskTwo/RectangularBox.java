package TaskTwo;

public class RectangularBox {
    private double length;
    private double width;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Side can't be zero or negative");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Side can't be zero or negative");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Side can't be zero or negative");
        }
    }

    public void printSidesOfRectangularBox() {
        System.out.println("Length: " + this.length + " Width: " + this.width + " Height: " + this.height);
    }

    public double getDiagonal() {
        return Math.sqrt(this.length * this.length + this.width * this.width + this.height * this.height);
    }

    public double getSurfaceArea() {
        return 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
    }

    public double getVolume() {
        return this.getSurfaceArea() * this.height;
    }

    public void printInformationOfRectangularBox() {
        this.printSidesOfRectangularBox();
        System.out.println("Diagonal: " + this.getDiagonal());
        System.out.println("Surface Area: " + this.getSurfaceArea());
        System.out.println("Volume: " + this.getVolume());
    }
}