int rectpos = 150;
int cirpos = 250;





void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  background(255);
  stroke(0);
  fill(170)
  rect (rectpos,rectpos,200,200)
  fill(255,80,125)
  ellipse (cirpos,cirpos,100,100,)
  cirpos+=1
  

}