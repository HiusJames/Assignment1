package ca.sait.ProblemDomain.shape;

import ca.sait.ProblemDomain.*;

public class Pyramid extends Shape {
    private double length;

    /**
     * Default constructor
     */
    public Pyramid() {

    }

    /**
     * Pyramid() - Constructor for the Pyramid shape
     * 
     * @param height    the height of the shape
     * @param length    the length of the shape
     */
    public Pyramid(double height, double length) {
        this.length = length;
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
     * getLength() - Get the length of the shape
     * 
     * @return          the length of the shape
     */
    public double getLength() {
        return length;
    }

    /**
     * setLength() - Set the length of the shape
     * 
     * @param length    the length of the shape
     */
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    /**
     * calcBaseArea() - Calculate the base area of the shape
     * 
     * @return          the base area of the shape
     */
    public double calcBaseArea() {
        return length * length;
    }
    @Override
    /**
     * calcVol() - Calculate the volume of the shape
     * 
     * @return          the volume of the shape
     */
    public double calcVol() {
       return length * length * (1/3.0) * height;
    }

    @Override
    /**
     * toString() - Convert the shape into a string
     * 
     * @return          the shape as a string
     */
    public String toString() {
        return String.format("Pyramid(length=%.3f height=%.3f)", length, height);
    }
    
}
