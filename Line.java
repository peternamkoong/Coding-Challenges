public class Line {
	//Instance Variables
	private Point Start;
	private Point End;
	
	//Constructors
	public Line(Point newStart, Point newEnd) {
		this.Start = new Point(newStart);
		this.End = new Point(newEnd);
	}
	
	//Getters
	public Point getStart() {
		return new Point(Start);
	}
	
	public Point getEnd() {
		return new Point(End);
	}
	
	//Setters
	public void setStart(Point newStart) {
		this.Start = new Point(newStart);
	}
	
	public void setEnd(Point newEnd) {
		this.End = new Point(newEnd);
	}
	
	//Other Methods
	public double length() {
		double xDistance = Start.getXCoord() - End.getXCoord();
		xDistance *= xDistance;
		double yDistance = Start.getYCoord() - End.getYCoord();
		yDistance *= yDistance;
		double dist = Math.sqrt(xDistance + yDistance);
		return dist;
	}
}
