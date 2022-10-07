package ca.sait.ProblemDomain;

import java.util.*;

/*
 * Compares the BaseAreaComp of two shapes 
 * 
 * @param s1 - First shapes base area
 * @param s2 - Second shapes base area 
 * 
 * return positive if first shape is greater than the second shape. Negative if otherwise
 */

public class BaseAreacomp implements Comparator<Shape>{
    public int compare(Shape s1, Shape s2) {
        if (s1.calcBaseArea() < s2.calcBaseArea()){
            return -1;
        } else if (s1.calcBaseArea() > s2.calcBaseArea()){
            return 1;
        }
        return 0;
    }
    
}
