import processing.core.PApplet;
public class main extends PApplet{
    public static void main(String[] args) { PApplet.main("main");}
    PApplet p;
    DataBroker dataMaker=new DataBroker();

    @Override
    public void settings() {
        super.settings();
    }

    @Override
    public void setup() {
        super.setup();
        dataMaker.p = this;
    dataMaker.loadData();
    }

    @Override
    public void draw() {
        super.draw();
    }
}
