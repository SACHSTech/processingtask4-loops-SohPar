import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }
    
  /**
   * Called repeatedly, anything drawn to the screen goes here
   * @param i 
   */

  public void draw(){
   
    // Quadrant 1 (10 x 10 Grid)

    strokeWeight(3);
    for (int lineX = 20; lineX <= 180; lineX += 20) {
      line(lineX, 0, lineX, height);
    }
    for (int lineY = 20; lineY <= 180; lineY += 20) {
      line(0, lineY, height, lineY);
    }

  fill(207, 201, 200);
  rect(200, 0, 200, 200);


  // Quadrant 2 (5 x Circle grid)

  strokeWeight(3);
  for (int circleY = 20; circleY <= 200; circleY +=40) {
    for (int circleX = 220; circleX <= 400; circleX +=40) {
      fill(0, 102, 255);
      ellipse(circleX, circleY, 20, 20);
    }
  }
  
  fill(255, 255, 255);
  rect(0, 200, 200, 200);


  // Quadrant 4 (8-Pedal Flower)
  strokeWeight(4);
  translate(300,300);
  for(int i = 0; i < 8; i++){
    stroke(255, 115, 0);
    rotate(TWO_PI/8);
    line(0, 0, 50, 0);
  
    stroke(7);
    fill(10, 255, 75);
    ellipse(0, 0, 40, 40);
  }

  // define other methods down here.
  }
}

