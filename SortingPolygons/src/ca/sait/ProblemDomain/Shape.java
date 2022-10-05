package ca.sait.ProblemDomain;

public abstract class Shape implements Comparable<Shape> {
    protected double height;

    public abstract double calcBaseArea();

    public abstract double calcVol();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

@Override
    public int compareTo(Shape s){
        if (this.getHeight() > s.getHeight()){
            return 1;
        } else if (this.getHeight() < s.getHeight()){
            return -1;
        }
        return 0;
    }
}
