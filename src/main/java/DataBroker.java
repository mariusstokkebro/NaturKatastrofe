import processing.core.PApplet;

import java.util.ArrayList;

public class DataBroker{
PApplet p;
 ArrayList<Data> list = new ArrayList<Data>();
void loadData(){

    String[] rows = p.loadStrings("csv-deaths-natural-disasters.csv");
    String[] header = rows[0].split(",");
    for (int i = 0 ; i < rows.length; i++) {
        String[] cells = p.split(rows[i],",");
        for(int j = 1;j<cells.length;j++){
            Data bob= new Data(cells[1],header[j],cells[j]);
           //p.println("Lav objekt land:" + cells[1] + " døde :" + cells[j] + " år:" + header[j] );
           bob.printStuff();
        }

    }
}

}


