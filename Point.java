public class Point {
//Instance Variables
	private int xcoord;
	private int ycoord;
	
//Constructors
	public Point(int newXcoord, int newYcoord) {
		if (newXcoord >=0) {
			this.xcoord = newXcoord;
		}
		if (newYcoord >=0) {
			this.ycoord = newYcoord;
		}
	}
	public Point(Point newPoint) {
		this.xcoord = newPoint.getXCoord();
		this.ycoord = newPoint.getYCoord();
	}
	
//Getters
	public int getXCoord() {
		return xcoord;
	}
	public int getYCoord() {
		return ycoord;
	}
	
//Setters
	public void setXCoord(int newXcoord) {
		if (newXcoord >= 0) {
			this.xcoord = newXcoord;
		}
	}
	
	public void setYCoord(int newYcoord) {
		if (newYcoord >= 0) {
			this.ycoord = newYcoord;
		}
	}

//Other Methods
	public void moveUp(int Up) {
		this.ycoord = ycoord - Up;
	}
	
	public void moveDown(int Down) {
		this.ycoord = ycoord + Down;
	}
	
	public void moveRight(int Right) {
		this.xcoord = xcoord + Right;
	}
	
	public void moveLeft(int Left) {
		this.xcoord = xcoord - Left;
	}
	
	public double distance(Point newPoint) {
		double xDistance = this.xcoord - newPoint.getXCoord();
		xDistance *= xDistance;
		double yDistance = this.ycoord - newPoint.getYCoord();
		yDistance *= yDistance;
		double dist = Math.sqrt(xDistance + yDistance);
		return dist;
	}
	
	public boolean equals(Point newPoint) {
		if (this.getXCoord() == newPoint.getXCoord() && this.getYCoord() == newPoint.getYCoord()) {
			return true;
		}
		else {
			return false;
		}
	}
}
