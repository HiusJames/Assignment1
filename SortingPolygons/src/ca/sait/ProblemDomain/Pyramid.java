package ca.sait.ProblemDomain;

public class Pyramid {
    private double height;
    private double length;
    private double base;
    private double volume;

    public Pyramid() {

    }

    public Pyramid(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public double calcBase(double length) {
        base = length * length;
        return base;
    }

    public double calcVolume(double height, double base) {
        volume = base * (1/3) * height;
        
        return volume;
    }
}
