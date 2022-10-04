package ca.sait.ProblemDomain.prism;

import ca.sait.ProblemDomain.*;

public class TrianglePrism extends Prism{
    @Override
    public double calcBaseArea() {
        return side * side * (Math.sqrt(3)/4.0);
    }

    @Override
    public double calcVol() {
        return side * side * (Math.sqrt(3)/4.0) * height;
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
