import processing.core.PApplet;

public class Data {
    PApplet p;
    String navn;
    String year;
    String death;
 Data(String navn, String year, String death){
     this.navn = navn;
     this.year = year;
     this.death= death;

 }
 void printStuff(){
     p.println("land:"+navn+""+"døde"+death+"år"+year);

 }
}
