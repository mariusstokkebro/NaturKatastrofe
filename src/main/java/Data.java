import processing.core.PApplet;

public class Data {
    PApplet p;
    String navn;
    int year;
    int death;
 Data(String navn, int year, int death){
     this.navn = navn;
     this.year =year;
     this.death= death;

 }
 void printStuff(){
     p.println("land:"+navn+""+"døde"+death+"år"+year);

 }
}
