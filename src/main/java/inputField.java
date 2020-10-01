import processing.core.PApplet;

public class inputField {
    PApplet p;

    float posX, posY;
    float sizeX, sizeY;
    String text;
    float mouseX, mouseY;
    String indput = "";

    boolean klikket = false;
    boolean acceptLetters = true;

    inputField(PApplet p,float posX, float posY, float sizeX, float sizeY, String text){
    this.p =p;
        this.posX=posX;
    this.posY=posY;
    this.sizeX=sizeX;
    this.sizeY=sizeY;
    this.text=text;
    }
    void display(){
            p.stroke(1, 46, 74, 100);
            if(klikket){
                p.fill(220, 220, 252);
            } else {
                p.fill(200);
            }
        p.rect(posX, posY, sizeX, sizeY);

        p.fill(0);
        p.textSize(16);
        p.text(indput, posX +(sizeX/16), posY + (sizeY/2));
        p.text(text,posX, posY);



    }

        void KlikTjek(float mouseX,float mouseY) {
            this.mouseX = mouseX;
            this.mouseY = mouseY;
            if (mouseX > posX &&
                    mouseX < posX + sizeX &&
                    mouseY > posY &&
                    mouseY < posY + sizeY) {
                klikket = !klikket;
            } else {
                klikket = false;
            }
    }
    void setAcceptLetter(boolean accept) {
        acceptLetters = accept;
    }
    void keyindput(char key) {

        if(klikket ){
            if(key == p.BACKSPACE && indput.length() > 0){

                indput =indput.substring(0,indput.length()-1);
            } else {
                if ((!acceptLetters && key >= '0' && key <= '9') || acceptLetters)
                    indput = indput + key;
            }

        }
        p.println(indput);
    }
}
