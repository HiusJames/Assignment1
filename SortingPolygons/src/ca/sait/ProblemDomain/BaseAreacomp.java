package ca.sait.ProblemDomain;

import java.util.*;

public class BaseAreacomp implements Comparator<Shape>{
    /**
     * compare() - Compares two shapes based on their base area
     * 
     * @param s1    first shape
     * @param s2    second shape
     * @return      returns an integer indicating whether the fisrt shape is bigger or smaller than the second
     */
    public int compare(Shape s1, Shape s2) {
        if (s1.calcBaseArea() < s2.calcBaseArea()){
            return -1;
        } else if (s1.calcBaseArea() > s2.calcBaseArea()){
            return 1;
        }
        return 0;
    }
    
}
