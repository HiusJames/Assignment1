package ca.sait.ProblemDomain.prism;

import ca.sait.ProblemDomain.*;

public class TrianglePrism extends Prism {
    /**
     * TrianglePrism() - Constructor for Triangular Prism
     * 
     * @param height    the height of the shape
     * @param side      the side of the shape
     * 
     */
    public TrianglePrism(double height, double side) {
        this.side = side;
        this.height = height;
    }

    @Override
    /**
     * calcBaseArea() - Calculate base area of the shape.
     * 
     * @return          returns the base area of the shape
     */
    public double calcBaseArea() {
        return side * side * (Math.sqrt(3) / 4.0);
    }

    @Override
    /**
     * calcVol() - Calculate the volume of the shape.
     * 
     * @return          returns the volume of the shape
     */
    public double calcVol() {
        return side * side * (Math.sqrt(3) / 4.0) * height;
    }

    @Override
    /**
     * getSide() - Get the side of the shape
     * 
     * @return          returns the side of the shape
     */
    public double getSide() {
        return this.side;
    }

    @Override
    /**
     * setSide() - Set the side of the shape
     * 
     * @param side      the side of the shape
     */
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    /**
     * getHeight() - Get the height of the shape
     * 
     * @return          the height of the shape
     */
    public double getHeight() {
        return this.height;

    }

    @Override
    /**
     * setHeight() - Set the height of the shape
     * 
     * @param height    the height of the shape
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    /**
     * toString() - Convert the object into a String
     * 
     * @return          returns the object as a String
     */
    public String toString() {
        return String.format("TrianglePrism(side=%.3f height=%.3f)", side, height);
    }
}
