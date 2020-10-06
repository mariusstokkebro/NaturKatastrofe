import processing.core.PApplet;

import java.util.ArrayList;

public class main extends PApplet{
    public static void main(String[] args) { PApplet.main("main");}
    PApplet p;
    DataBroker dataMaker=new DataBroker(this);
    inputField country;
    inputField year;
    graph graphs;
    int maxH=0;
    int Height = 0;
    ArrayList <Integer> cool = new ArrayList<Integer>();
    @Override
    public void settings() {
        size(1000,720);
    }

    @Override
    public void setup() {
        super.setup();
        dataMaker.p = this;
    dataMaker.loadData();
        country = new inputField(  this,750, 100, 200, height / 12, "Country");
        year = new inputField(  this,750,200, 200, height / 12, "Year");
        year.setAcceptLetter(false);
        graphs = new graph(this);

    }

    @Override
    public void draw() {
        clear();
        background(200);
        country.display();
        year.display();
        cool=dataMaker.getAllDeaths(country.input);
        int yearInt = 0;
        if (year.input.length() > 0) {
            yearInt = Integer.parseInt(year.input);
        }
        text("Country: " + country.input + "\nYear: " + year.input + "\nDeath: " + dataMaker.getData(country.input, yearInt) ,800, 300);
        if(cool.size()>0){
            maxH++;
            for (int i = dataMaker.getAllDeaths(country.input).size() - 1; i > 0; i--) {

                Height = constrain(dataMaker.getAllDeaths(country.input).get(i), 0, maxH);
                rect(600 - i * 5, 650, 5, Height * -1);

            }
        }else{maxH=0;}

       



        text("1900",0,700);
        text("1950",300,700);
        text("2014",600,700);

    }
    public void mouseClicked() {
        country.KlikTjek(mouseX,mouseY);
        year.KlikTjek(mouseX,mouseY);
    }
    public void keyTyped() {
        country.keyindput(key);
        year.keyindput(key);

    }
}
