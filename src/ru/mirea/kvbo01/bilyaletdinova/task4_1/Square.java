package ru.mirea.kvbo01.bilyaletdinova.task4_1;

public class Square extends Rectangle{
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
