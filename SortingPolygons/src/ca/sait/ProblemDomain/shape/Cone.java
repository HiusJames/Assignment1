package ca.sait.ProblemDomain.shape;

import ca.sait.ProblemDomain.*;

public class Cone extends Shape {
    private double radius;

    /**
     * Default constructor
     */
    public Cone() {

    }

    /**
     * Cone() - Constructor for the Cone shape
     * 
     * @param height    the height of the shape
     * @param radius    the radius of the shape
     */
    public Cone(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * getHeight() - Get the height of the shape
     * 
     * @return          the height of the shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * setHeight() - Set the height of the shape
     * 
     * @param height    the height of the shape
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * getRadius() - Get the radius of the shape
     * 
     * @return          the radius of the shape
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setRadius() - Set the radius of the shape
     * 
     * @param radius    the radius of the shape
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    /**
     * calcBaseArea() - Calculate the base area of the shape
     * 
     * @return          the base area of the shape
     */
    public double calcBaseArea() {
        return radius * radius * Math.PI;
    }
    @Override
    /**
     * calcVol() - Calculate the volume of the shape
     * 
     * @return          the volume of the shape
     */
    public double calcVol() {
       return radius * radius * Math.PI * (1.0/3.0) * height;
    }

    @Override
    /**
     * toString() - Convert the shape into a string
     * 
     * @return          the shape as a string
     */
    public String toString() {
        return String.format("Cone(radius=%.3f height=%.3f)", radius, height);
    }
    
}









