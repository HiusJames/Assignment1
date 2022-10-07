package ca.sait.ProblemDomain;

import java.util.*;

/*
 *
 * 
 * @param s1 - First shape being compared
 * 
 * @param s2 - Second shape being compared
 *
 * 
 * 
 */
public class Volumecomp implements Comparator<Shape>{
    public int compare(Shape s1, Shape s2) {
        if (s1.calcVol() < s2.calcVol()){
            return -1;
        } else if (s1.calcVol() > s2.calcVol()){
            return 1;
        }
        return 0;
    }
    
}
