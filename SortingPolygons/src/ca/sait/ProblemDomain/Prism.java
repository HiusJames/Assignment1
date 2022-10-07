package ca.sait.ProblemDomain;

/*

 * Abstract class for prism
 * 
 * getSide() - get the prism side 
 * setSide() - set the side of the prism
 * 
 */
public abstract class Prism extends Shape {
    protected double side;

    public abstract double calcBaseArea();

    public abstract double calcVol();

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
