import processing.core.*;



public class gui extends PApplet
{
	PImage webImg;
	public void setup() {
		size(400,400);
		String url="https://upload.wikimedia.org/wikipedia/commons/e/e4/Mauritius_beach.png";
		webImg = loadImage(url,"png");
	}
	public void draw()
	{
		webImg.resize(0, height);
		image(webImg,0,0);
		ellipse(width/4,height/5,width/5,height/5);
		fill(255,209,0);
	}
}