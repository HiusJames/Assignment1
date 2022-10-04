package ca.sait.ProblemDomain.shape;

import ca.sait.ProblemDomain.*;

public class Cylinder extends Shape {
    private double radius;

    public Cylinder() {

    }

    public Cylinder(double height, double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcBaseArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public double calcVol() {
       return radius * radius * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cone [radius=" + radius + "]";
    }
    
}
