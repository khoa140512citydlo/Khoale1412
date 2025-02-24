package ex6_1;


class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "Square[" + super.toString() + ", side=" + side + "]";
    }
}