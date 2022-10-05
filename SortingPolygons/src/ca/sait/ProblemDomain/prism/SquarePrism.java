package ca.sait.ProblemDomain.prism;

import ca.sait.ProblemDomain.*;

public class SquarePrism extends Prism {
    public SquarePrism(double height, double side) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcBaseArea() {
        return side * side;
    }

    @Override
    public double calcVol() {
        return side * side * height;
    }

    @Override
    public double getSide() {
        return this.side;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getHeight() {
        return this.height;

    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("SquarePrism(side=%.3f height=%.3f)", side, height);
    }

}
