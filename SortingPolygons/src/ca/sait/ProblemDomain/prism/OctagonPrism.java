package ca.sait.ProblemDomain.prism;

import ca.sait.ProblemDomain.*;

public class OctagonPrism extends Prism {
    public OctagonPrism(double height, double side) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcBaseArea() {
        return side * side * 2 * (1 + Math.sqrt(2));
    }

    @Override
    public double calcVol() {
        return side * side * 2 * (1 + Math.sqrt(2)) * height;
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
        return String.format("OctagonPrism(side=%.3f height=%.3f)", side, height);
    }
}
