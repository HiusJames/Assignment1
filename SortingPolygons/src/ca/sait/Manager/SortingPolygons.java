package ca.sait.Manager;

import ca.sait.ProblemDomain.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SortingPolygons {
    static ArrayList<Shape> cone = new ArrayList<>();
    static ArrayList<Shape> cylinder = new ArrayList<>();
    static ArrayList<Shape> pyramid = new ArrayList<>();

    static ArrayList<Double> height = new ArrayList<>();
    static ArrayList<Double> base = new ArrayList<>();
    static ArrayList<Double> volume = new ArrayList<>();

    private static final String FILE_PATH1 = "res/polyfor1.txt";
    private static final String FILE_PATH2 = "res/polyfor3.txt";
    private static final String FILE_PATH3 = "res/polyfor5.txt";
    private static final String FILE_PATH4 = "res/polyNameBig.txt";
    private static String file_path;

    public void displayMenu() throws IOException {
        Scanner in = new Scanner(System.in);
        int in_path = 0;
        char option = ' ';

        System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
        while (in_path != 5) {
            System.out.println("Welcome to Group 6's Sorting Assignment!\n");
            System.out.printf("%-5d%s", 1, "polyfor1.txt\n");
            System.out.printf("%-5d%s", 2, "polyfor3.txt\n");
            System.out.printf("%-5d%s", 3, "polyfor5.txt\n");
            System.out.printf("%-5d%s", 4, "polyNameBig.txt\n");
            System.out.printf("%-5d%s", 5, "Exit\n");
            System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
            System.out.print("\nEnter an option: ");
            in_path = in.nextInt();
            in.nextLine();

            switch (in_path) {
                case 1:
                    file_path = FILE_PATH1;
                    break;
                case 2:
                    file_path = FILE_PATH2;
                    break;
                case 3:
                    file_path = FILE_PATH3;
                    break;
                case 4:
                    file_path = FILE_PATH4;
                    break;

            }
        }

    }

    public static void loadFile() throws FileNotFoundException {

        File file = new File(file_path);
        Scanner inData = new Scanner(file);

        int amount = Integer.parseInt(inData.next());
        String name;
        double height;

        for (int i = 1; i < amount + 1; i++) {
            Scanner fr = new Scanner(file);
            name = fr.next();
        }

    }

}