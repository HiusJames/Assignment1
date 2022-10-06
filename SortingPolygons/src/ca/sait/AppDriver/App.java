package ca.sait.AppDriver;

import ca.sait.Manager.SortingPolygons;

public class App {
    public static void main(String[] args) throws Exception {
        SortingPolygons sp = new SortingPolygons();
        String filepath = "";
        String type = "";
        String sort = "";

        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-f")) {
                filepath = args[i].substring(2);
            }
            if (args[i].startsWith("-t")) {
                type = args[i].substring(2);
            }
            if (args[i].startsWith("-s")) {
                sort = args[i].substring(2);
            }
        }
        sp.start("polyfor1.txt", "h", "b");
    }
}
