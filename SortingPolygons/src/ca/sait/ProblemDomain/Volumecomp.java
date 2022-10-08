package ca.sait.ProblemDomain;

import java.util.*;

public class Volumecomp implements Comparator<Shape>{
    /**
     * compare() - Compares two shapes based on their volume
     * 
     * @param s1    first shape
     * @param s2    second shape
     * @return      returns an integer indicating whether the fisrt shape is bigger or smaller than the second
     */
    public int compare(Shape s1, Shape s2) {
        if (s1.calcVol() < s2.calcVol()){
            return -1;
        } else if (s1.calcVol() > s2.calcVol()){
            return 1;
        }
        return 0;
    }
    
}
