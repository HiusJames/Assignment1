package ca.sait.ProblemDomain.prism;

import ca.sait.ProblemDomain.*;

public class PentagonPrism extends Prism{
    @Override
    public double calcBaseArea() {
        return side * 5 * 2 * Math.tan(Math.toRadians(54)) / 4.0;
    }

    @Override
    public double calcVol() {
        return height * side * 5 * 2 * Math.tan(Math.toRadians(54)) / 4.0;
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
        // TODO Auto-generated method stub
        return super.toString();
    }
}
