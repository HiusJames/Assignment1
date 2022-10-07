package ca.sait.ProblemDomain.shape;

import ca.sait.Manager.AllSorts;
import ca.sait.ProblemDomain.*;

public class Cone extends Shape {
    private double radius;
    
    public Cone() {

    }
    
    public Cone(double height, double radius) {
        this.radius = radius;
        this.height = height;
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
       return radius * radius * Math.PI * (1.0/3.0) * height;
    }

    @Override
    public String toString() {
        return String.format("Cone(radius=%.3f height=%.3f)", radius, height);
    }
    
}

