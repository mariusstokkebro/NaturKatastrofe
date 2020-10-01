import processing.core.PApplet;
import processing.data.Table;

import java.util.ArrayList;

public class DataBroker {
    PApplet p;


    ArrayList<Data> list = new ArrayList<Data>();

    DataBroker(PApplet p) {
        this.p = p;

    }

    void loadData() {

        String[] rows = p.loadStrings("csv-deaths-natural-disasters.csv");
        String[] header = rows[0].split(",");
        for (int i = 1; i < rows.length; i++) {
            String[] cells = p.split(rows[i], ",");
            for (int j = 2; j < cells.length; j++) {
                if (cells[j].equals("")) {
                    cells[j] = "0";

                }

                Data bob = new Data(cells[1], Integer.parseInt(header[j]), Integer.parseInt(cells[j]));
                list.add(bob);
                // p.println("Lav objekt land:" + cells[1] + " døde :" + cells[j] + " år:" + header[j] );
                bob.printStuff();
            }

        }
    }

    public int getData(String countryName, int Year) {
        int a = 0;
        for (int i = 0; i < list.size(); ++i) {
            Data data = list.get(i);
            if (countryName.equalsIgnoreCase(data.navn) && Year == data.year) {
                a = list.get(i).death;
            }
        }
        return a;
    }


}