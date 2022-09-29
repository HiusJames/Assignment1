package ca.sait.ProblemDomain;

public class Prism {
    private double height;
    private double length;
    private double base;
    private double volume;

    public Prism() {

    }

    public Prism(double height, double length) {
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

    public double calcBase(String type, double length) {
        switch(type) {
            case "Square":
            base = length * length;

            case "Trianglar":
            base = (length * length * Math.sqrt(3))/4;

            case "Pentagonal":
            base = (5 *length * length * Math.tan(Math.toRadians(54)))/4;

            case "Octagonal":
            base = 2 * length * length * (1 + Math.sqrt(2));

        }
        return base;
    }

    public double calcVolume(String type, double height, double base) {
        volume = base * height;

        return volume;
    }
}
