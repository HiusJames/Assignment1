package ca.sait.ProblemDomain.shape;

import ca.sait.ProblemDomain.*;

public class Pyramid extends Shape {
    private double length;

    public Pyramid() {

    }

    public Pyramid(double height, double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    @Override
    public double calcBaseArea() {
        return length * length;
    }
    @Override
    public double calcVol() {
       return length * length * (1/3) * height;
    }

    @Override
    public String toString() {
        return String.format("Pyramid(length=%.3f height=%.3f)", length, height);
    }
    
}
