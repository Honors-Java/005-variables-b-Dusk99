background(255);

int rectx = 250;
int recty = 250;
int rectl = 100;
int rectw = 100;

int b = random(0,255);
int g = random(0,255);
int r = random(0,255);
void setup() {

	size(500, 500);
}

void draw() {
stroke(0);
fill (r,g,b,);
rect(rectx,recty,rectw,rectl);
fill((int) random(0,255), (int) random(0,255), (int) random(0,255))
ellipse(mouseX + (int) random(-30,30), mouseY + (int) random(-30,30),10,10)

void mousePressed(){
 b = (int) random(0,255);
 g = (int) random(0,255);
 r = (int) random(0,255);
 background(255);
 rectx = random(0,400);
 recty = random(0,400);
 rectl = random(50,400);
 rectw = random(50,400);

}


}