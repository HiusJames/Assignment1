package ca.sait.ProblemDomain;

public class Cylinder {
    private double height;
    private double radius;
    private double base;
    private double volume;

    public Cylinder() {

    }

    public Cylinder(double height, double radius) {
        this.height = height;
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

    public double calcBase(double radius) {
        base = radius * radius * Math.PI;

        return base;
    }
    public double calcVolume(double height, double base) {
        volume = base * height;
        return volume;
    }
    
}
