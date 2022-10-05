package ca.sait.ProblemDomain;

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
