package ca.sait.Manager;

import ca.sait.ProblemDomain.*;
import java.io.*;
import java.util.*;

public class SortingPolygons {
    static ArrayList<Shape> cone = new ArrayList<>();
    static ArrayList<Shape> cylinder = new ArrayList<>();
    static ArrayList<Shape> pyramid = new ArrayList<>();
    static ArrayList<Prism> squares = new ArrayList<>();
    static ArrayList<Prism> triangle = new ArrayList<>();
    static ArrayList<Prism> pentagon = new ArrayList<>();
    static ArrayList<Prism> octagon = new ArrayList<>();

    static ArrayList<Double> height = new ArrayList<>();
    static ArrayList<Double> base = new ArrayList<>();
    static ArrayList<Double> volume = new ArrayList<>();

    public void start(String filepath, String type, String sort) throws IOException {
        AllSorts s = new AllSorts(type);
        Scanner in = new Scanner(new File(filepath));

        String line = in.nextLine();
        String[] fields = line.split(" ");
        int amount = Integer.parseInt(fields[0]);
        for (int i = 1; i < amount; i++) {
            
        }
    }
}