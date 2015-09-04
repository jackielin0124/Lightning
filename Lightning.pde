int y = 0;

void setup()
{
    size(400,400);
    frameRate(10);

}

void draw()
{
	
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

void mousePressed()
{
	y = 0;
	background(50);

	
}