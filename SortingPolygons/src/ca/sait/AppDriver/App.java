package ca.sait.AppDriver;

import ca.sait.Manager.SortingPolygons;
/**
 * 
 * @param args          Arguments from the command line 
 * @throws Exception    Throw all Exceptions
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        String filepath = "";
        String type = "";
        String sort = "";
        try {
        for (int i = 0; i < args.length; i++) {
        	String currentText = args[i].toLowerCase();
            if (currentText.startsWith("-f")) {
                filepath = currentText.substring(2);
            }
            else if (currentText.startsWith("-t")) {
                type = currentText.substring(2);
            }
            else if (currentText.startsWith("-s")) {
                sort = currentText.substring(2);
            }
        }
        SortingPolygons sp = new SortingPolygons();
       sp.start(filepath, type, sort);
    } catch(Exception e){
        System.out.println("Invalid input detected! Please try again.");
    }
    }
}
