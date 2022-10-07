package ca.sait.Manager;

import ca.sait.ProblemDomain.*;
import ca.sait.ProblemDomain.shape.*;
import ca.sait.ProblemDomain.prism.*;

import java.io.*;
import java.util.*;

public class SortingPolygons {
	String filepath;
	String type;
	String sort;
	Shape[] shapes;

    /**
	 * start() - Initializes filepath, type, and sort. Starts timer then loads the polygons and sorts them.
	 *
	 * @throws IOException - Thrown when the file could not be accessed.
     * @param filepath - Initializes which .txt is being sorted.
     * @param type - Initializes the area that gets sorted (height, basearea, volume).
     * @param sort - Initializes the type of sort used.
	 */
	public void start(String filepath, String type, String sort) throws IOException {
		this.filepath = filepath;
		this.type = type;
		this.sort = sort;
		System.out.println("Application started");
		long startTime = System.currentTimeMillis();
		LoadPolygons();
		SortPolygons();
		long endTime = System.currentTimeMillis();
		System.out.println("Processed time: " + (endTime - startTime) + "ms");
	}

    /**
	 * LoadPolygons() - Takes the shapes in a filepath and insert values into Shape object
	 *
	 * @throws IOException - Thrown when the file could not be accessed.
	 */
	public void LoadPolygons() throws IOException {
		Scanner in = new Scanner(new File("res//" + filepath));
		String line = in.nextLine();
		String[] fields = line.split(" ");
		int amount = Integer.parseInt(fields[0]);
		shapes = new Shape[amount];
		for (int i = 1; i <= amount; i++) {
			String name = fields[3 * i - 2];
			switch (name) {
			case "Cylinder":
				shapes[i - 1] = (new Cylinder(Double.parseDouble(fields[3 * i - 1]),
						Double.parseDouble(fields[3 * i])));
				break;
			case "Cone":
				shapes[i - 1] = (new Cone(Double.parseDouble(fields[3 * i - 1]), Double.parseDouble(fields[3 * i])));
				break;
			case "Pyramid":
				shapes[i - 1] = (new Pyramid(Double.parseDouble(fields[3 * i - 1]), Double.parseDouble(fields[3 * i])));
				break;
			case "SquarePrism":
				shapes[i - 1] = (new SquarePrism(Double.parseDouble(fields[3 * i - 1]),
						Double.parseDouble(fields[3 * i])));
				break;
			case "TriangularPrism":
				shapes[i - 1] = (new TrianglePrism(Double.parseDouble(fields[3 * i - 1]),
						Double.parseDouble(fields[3 * i])));
				break;
			case "PentagonalPrism":
				shapes[i - 1] = (new PentagonPrism(Double.parseDouble(fields[3 * i - 1]),
						Double.parseDouble(fields[3 * i])));
				break;
			case "OctagonalPrism":
				shapes[i - 1] = (new OctagonPrism(Double.parseDouble(fields[3 * i - 1]),
						Double.parseDouble(fields[3 * i])));
				break;
			}
		}
	}

    /**
	 * SortPolygons() - Decide sort, type, and prints the first 1000 Shapes.
	 */
	public void SortPolygons() {
		AllSorts sorts = new AllSorts(type);
		System.out.print("Sort method: ");
		switch (sort) {
		case "b":
			System.out.println("Bubble Sort");
			sorts.BubbleSort(shapes);
			break;
		case "s":
			System.out.println("Selection Sort");
			sorts.SelectionSort(shapes);
			break;
		case "i":
			System.out.println("Insertion Sort");
			sorts.InsertionSort(shapes);
			break;
		case "m":
			System.out.println("Merge Sort");
			sorts.MergeSort(shapes, shapes.length);
			break;
		case "q":
			System.out.println("Quick Sort");
			sorts.QuickSort(shapes, 0, shapes.length - 2);
			break;
		case "z":
			System.out.println("Custom Sort");
			sorts.MySort(shapes);
			break;
		}
		System.out.print("Sort by: ");
		switch (type) {
		case "h":
			System.out.println("Height");
			break;
		case "a":
			System.out.println("Base Area");
			break;
		case "v":
			System.out.println("Volume");
			break;
		}
		for (int i = 0; i < shapes.length - 1; i++) {
			if (i > 1000) {
				break;
			}
			switch (type) {
			case "h":
				System.out.println(shapes[i].getHeight() + " " + shapes[i].toString());
				break;
			case "a":
				System.out.println(shapes[i].calcBaseArea() + " " + shapes[i].toString());
				break;
			case "v":
				System.out.println(shapes[i].calcVol() + " " + shapes[i].toString());
				break;

			}
		}
	}
}