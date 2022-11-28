package org.example;

public class Rectangle {
    int id;
    int upperX, upperY;
    int lowerX, lowerY;
    int a, b;

    public Rectangle() {
    }

    public Rectangle(int id, int upperX, int upperY, int lowerX, int lowerY, int a, int b) {
        this.id = id;
        this.upperX = upperX;
        this.upperY = upperY;
        this.lowerX = lowerX;
        this.lowerY = lowerY;
        this.a = a;
        this.b = b;
    }

    public int square() {
        return  a+a+b+b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUpperX() {
        return upperX;
    }

    public void setUpperX(int upperX) {
        this.upperX = upperX;
    }

    public int getUpperY() {
        return upperY;
    }

    public void setUpperY(int upperY) {
        this.upperY = upperY;
    }

    public int getLowerX() {
        return lowerX;
    }

    public void setLowerX(int lowerX) {
        this.lowerX = lowerX;
    }

    public int getLowerY() {
        return lowerY;
    }

    public void setLowerY(int lowerY) {
        this.lowerY = lowerY;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle with " +
                "id=" + id +
                ", upperX=" + upperX +
                ", upperY=" + upperY +
                ", lowerX=" + lowerX +
                ", lowerY=" + lowerY +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
