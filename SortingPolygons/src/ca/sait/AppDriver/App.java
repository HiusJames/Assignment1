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

        for (int i = 0; i < args.length; i++) {
        	String currentText = args[i].toLowerCase();
            if (currentText.startsWith("-f")) {
                filepath = currentText.substring(2);
            }
            if (currentText.startsWith("-t")) {
                type = currentText.substring(2);
            }
            if (currentText.startsWith("-s")) {
                sort = currentText.substring(2);
            }
        }
        // do some data check
        // for test
        System.out.println("here is run");

//        System.out.println(filepath);
//        System.out.println(type);
//        System.out.println(sort);
        SortingPolygons sp = new SortingPolygons();
        sp.start("polyfor1.txt", "h", "i");
//        sp.start(filepath, type, sort);
    }
}
