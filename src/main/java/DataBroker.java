import processing.core.PApplet;

import java.util.ArrayList;

public class DataBroker{
PApplet p;
 ArrayList<Data> list = new ArrayList<Data>();

void loadData(){

    String[] rows = p.loadStrings("csv-deaths-natural-disasters.csv");
    String[] header = rows[0].split(",");
    for (int i = 1 ; i < rows.length; i++) {
        String[] cells = p.split(rows[i],",");
        for(int j = 2;j<cells.length;j++){
            if(cells[j].equals("")){
                cells[j] ="-1";

            }

            Data bob= new Data(cells[1],Integer.parseInt(header[j]),Integer.parseInt(cells[j]));
            list.add(bob);
          // p.println("Lav objekt land:" + cells[1] + " døde :" + cells[j] + " år:" + header[j] );
          bob.printStuff();
        }

    }
}

}


