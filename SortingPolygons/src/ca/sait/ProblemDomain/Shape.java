package ca.sait.ProblemDomain;

public abstract class Shape implements Comparable<Shape> {
    protected double height;
    /**
     * calcBaseArea() - abstract method for calculating the base area of the shape
     */
    public abstract double calcBaseArea();
    /**
     * calcVol() - abstract method for calculating the volume of the shape
     */
    public abstract double calcVol();
    /**
     * getHeight() - get the height of the shape
     * 
     * @return          the height of the shape
     */
    public double getHeight() {
        return height;
    }
    /**
     * setHeight() - set the height of the shape
     * 
     * @param height    the height of the shape
     */
    public void setHeight(double height) {
        this.height = height;
    }

@Override
    /**
     * compareTo() - Compare two shapes based on their height
     * 
     * @param s         the shape to compare against
     * @return          an integer indicating whether this shape is bigger or smaller than the given shape
     */
    public int compareTo(Shape s){
        if (this.getHeight() > s.getHeight()){
            return 1;
        } else if (this.getHeight() < s.getHeight()){
            return -1;
        }
        return 0;
    }
}
