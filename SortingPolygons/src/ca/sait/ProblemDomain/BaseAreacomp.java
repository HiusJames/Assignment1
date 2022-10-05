package ca.sait.ProblemDomain;

import java.util.*;

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
