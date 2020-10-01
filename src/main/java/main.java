import processing.core.PApplet;
public class main extends PApplet{
    public static void main(String[] args) { PApplet.main("main");}
    PApplet p;
    DataBroker dataMaker=new DataBroker(this);
    inputField country;
    inputField year;

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
    }

    @Override
    public void draw() {
        clear();
        background(200);
        country.display();
        year.display();
        int aarInt = 0;
        if (year.indput.length() > 0)
            aarInt = Integer.parseInt(year.indput);

        text("Country: " + country.indput + "\nYear: " + year.indput + "\nDeath: " + dataMaker.getData(country.indput, aarInt),800, 300);

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
