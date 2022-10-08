package ca.sait.ProblemDomain;

public abstract class Prism extends Shape {
    protected double side;
    /**
     * calcBaseArea() - abstract method for calculating the base area of the shape
     */
    public abstract double calcBaseArea();
    /**
     * calcVol() - abstract method for calculating the volume of the shape
     */
    public abstract double calcVol();
    /**
     * getSide() - get the side of the shape
     * 
     * @return      the side of the shape
     */
    public double getSide() {
        return side;
    }
    /**
     * setSide() - set the side of the shape
     * 
     * @param side  the side of the shape
     */
    public void setSide(double side) {
        this.side = side;
    }

}
