import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int y = 0;

public void setup()
{
    size(400,400);
}

public void draw()
{
	frameRate(30);
	background(0);
	
	
	int x = (int)(Math.random() *380 +10);
	int flashR = (int)(Math.random() *50 + 150);
	int flashG = (int)(Math.random() *50 + 150);
	int flashB = (int)(Math.random() *50 + 150);
	
	 while(y < 500)
	{
		
		stroke(flashR, flashG, flashB);
		strokeWeight(3);
		int changeX = (int)(Math.random() *20 -10);
		int changeY = (int)(Math.random() *10 +4);
		line(x, y, x + changeX, y + changeY);
		x = changeX + x;
		y = changeY + y;

	}

}

public void mousePressed()
{
	y = 0;

	redraw();
	background(30);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
